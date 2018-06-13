package choucair_prueba_aut.model;

import java.sql.Driver;
import java.sql.Connection;
import java.sql.DriverManager;


public class conexion_base_datos {
	
	public String[] valores_configu_bd=null;
	public static Connection con = null;
	public static Connection con_smart_dealer = null;
	public static obtener_config_propierties obtener_config_propierties;
	public static String  connectionUrl;	
	public conexion_base_datos(){
	
	}
	
	public static Connection conexion_sql_server(String nombre_conexion) {
		
		try {
		
			switch (nombre_conexion.toLowerCase()) {
			
            case "conexion_bd_robot":
            	
				String[] valores_configu_bd = choucair_prueba_aut.model.obtener_config_propierties.obtener_config();
				String host = valores_configu_bd[0].split("=")[1];
				String serverName = valores_configu_bd[2].split("=")[1];
				String userName = valores_configu_bd[3].split("=")[1];
				String password = valores_configu_bd[4].split("=")[1];		
				String  connectionUrl = "jdbc:jtds:sqlserver://"+ host + ";databaseName=" + serverName + ";user=" + userName + ";password=" + password + "";
				Class.forName("net.sourceforge.jtds.jdbc.Driver");
				con = DriverManager.getConnection(connectionUrl);
			
				 if (con != null) {
					 System.out.println("Robot Conectado..");
					 return con; 
				 }else {
					 System.out.println("Robot no conectado..");
					 return con; 
				 }
			
	  
			}	
			
		}catch(Exception e) {
			System.out.println("Error en la conexion" + e.toString());

		}
		 return con;	
	}

	public static Connection conexion_sql_server_ambientes(String cadena_conexion) {

			try {
			@SuppressWarnings("unused")
			Connection con = null;
			String[] valores_configu_bd1 = cadena_conexion.split("-/-");		
			String host1 = valores_configu_bd1[0].toString();
			String serverName1 = valores_configu_bd1[1].toString();
			String userName1 = valores_configu_bd1[2].toString();
			String password1 = valores_configu_bd1[3].toString();		
			String instancia = valores_configu_bd1[0].toString();
			instancia = instancia.replace("\\", "@");
			String[] separa = instancia.split("@");
		
			if(separa.length>1){
				connectionUrl = "jdbc:jtds:sqlserver://" + separa[0].toString() + ";databaseName="+ serverName1 + ";instance=" + separa[1].toString() + ";user=" + userName1 + ";password=" + password1 + "";
			}else {
				System.out.println("contenido");
				connectionUrl = "jdbc:jtds:sqlserver://"+ host1 + ";databaseName=" + serverName1 + ";user=" + userName1 + ";password=" + password1 + "";
			}		
			
			Class.forName("net.sourceforge.jtds.jdbc.Driver");
			con_smart_dealer = DriverManager.getConnection(connectionUrl);
			return con_smart_dealer;	
			
			}catch(Exception e) {
				System.out.println(e.toString());
			}
			return con_smart_dealer;
		
	}	
	
	
}
