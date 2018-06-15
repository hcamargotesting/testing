package choucair_prueba_aut.model;
import java.io.*;
import java.util.*;
import java.sql.Driver;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.*;
import choucair_prueba_aut.RunnerPrepagoSd;
import choucair_prueba_aut.model.*;
import choucair_prueba_aut.pageObjects.LoginPageObject;

public class obtener_config_propierties  {
	
	public static String[] str_array_conexion_bd = new String[10];
	public static HashMap<String, String> collection_test_case = new HashMap<>();
	public static StringBuilder queryString = new StringBuilder();
	public static StringBuilder queryStrDriven = new StringBuilder();
	public static Connection conexion;
	public static Connection conexion_smart_dealer;
	public static Statement st=null;
	public static ResultSet rs = null;

	/* instancia clase runner*/
	//RunnerPrepagoSd RunnerPrepagoSd;

	public RunnerPrepagoSd obtener_clases = new RunnerPrepagoSd();
	conexion_base_datos conectar_bd = new conexion_base_datos();
	//LoginPageObject objectos_pageObject = new LoginPageObject();
	LoginPageObject LoginPageObject;
	
	static Random random = new Random();
	public static Statement st_crud=null;
	public static ResultSet rs_crud = null;
	public static ResultSet rs_datos_ciudad = null;
	public static Statement st_datos_ciudad=null;
	public String retornando ="";
	
	public obtener_config_propierties() {
		
	}
	

	public static String[] obtener_config() {
		// TODO Auto-generated method stub
		try {
			
			File file = new File ("C:\\config.properties");
			
			@SuppressWarnings("resource")
			Scanner sc = new Scanner(file);
			for (int inc =0 ; sc.hasNextLine();inc++)
			{
				str_array_conexion_bd[inc]=sc.nextLine().toString();
			}
			
			
		}catch(Exception e) {
			
			System.out.println(e.toString());
	
		}
		return str_array_conexion_bd;
		
	}
	
	public static Map<String, String> objeto_HashMap(String input_name_field,String input_value_field) {  
		 collection_test_case.put(input_name_field, input_value_field);
		 return collection_test_case;  
	  }
		
	public static void genera_datos_aleatorios_smartdealer(String id_caso)  {
		
		try {
		
			int int_numero_documento = Math.abs((111111111)+random.nextInt(99999999));
			queryString.append(" SELECT TOP(1) * FROM DATOS_SMARTDEALER ORDER BY NEWID() ");
			conexion = conexion_base_datos.conexion_sql_server("conexion_bd_robot");
			st_crud = conexion.createStatement();
		    rs_crud = st_crud.executeQuery(queryString.toString());  	      
		    while (rs_crud.next()) {
		    	queryString.setLength(0);
		    	//Actualiza numero de documento en tabla suscriptor
		 	    queryString.append(" UPDATE WND_SD_PRE_INFORMACION_SUSCRIPTOR_D SET TXT_NUM_DOC='" + int_numero_documento + "',TXT_NOMBRE='" + rs_crud.getString("Nombres").toString() + "',TXT_APELLIDO='" + rs_crud.getString("Apellidos").toString() + "',CMB_GENERO='" + rs_crud.getString("Genero").toString() + "',TXT_LUG_EXP='" + rs_crud.getString("Ciudades").toString() + "',TXT_REF_PERS='" + rs_crud.getString("Referencia").toString() + "',CMB_PARENTESCO='" + rs_crud.getString("Parentesco").toString() + "' WHERE ID_CASO='" + id_caso + "' ");    	 
		    }
		    rs_crud.close();

		    st_crud.executeUpdate(queryString.toString());
		    
		    //Actualiza numero de documento en tabla integral
		    queryString.setLength(0);
		    queryString.append(" UPDATE WND_SD_PRE_CASOS_INTEGRALES_D SET TXT_NUM_DOC='" + int_numero_documento + "'  WHERE ID_CASO='" + id_caso + "' ");
		    st_crud.executeUpdate(queryString.toString());        	
		    
	    	//Actualiza numero contrato pagina programacion
	    	int int_numero_contrato = Math.abs((111111111)+random.nextInt(99999999));
	    	int int_numero_verificacion_contrato = Math.abs((1)+random.nextInt(9));	    	
	    	queryString.setLength(0);
	    	queryString.append(" UPDATE WND_SD_PRE_OFERTA_PROGRAMACION_D SET TXT_NO_CONTRATO_1='" + int_numero_contrato + "',TXT_NO_CONTRATO_2='" + int_numero_verificacion_contrato + "'   WHERE ID_CASO='" + id_caso + "' ");
	    	st_crud.executeUpdate(queryString.toString());  
	    	  	
	    	st_crud.close();
	    	conexion.close();
	    	
		}catch(Exception e) {
			System.out.println("Error genera_datos_aleatorios_smartdealer " + e.toString());		
		}		
		 
	}
	
	
	@SuppressWarnings("unused")
	public static void obtiene_barrio_sugerido(String ambiente,String tbl_suscriptor_robot,String ID_CASO,String ciudad,String departamento)  {
		
		try {
			
			ResultSet rs_smart_dealer = null;
			Statement st_smart_dealer = null;
			String str_barrio_aleatorio_smart_dealer="";
			String cadena_conexion="";
			// 1- obtiene los datos de conexion al ambiente de smartdealer
			queryString.setLength(0);
			queryString.append(" Select TOP(1) * from TBL_AMBIENTES_D WHERE nombre='" + ambiente + "'");
			conexion = conexion_base_datos.conexion_sql_server("conexion_bd_robot");
			st_crud = conexion.createStatement();
		    rs_crud = st_crud.executeQuery(queryString.toString());  	      
		    while (rs_crud.next()) {
		    		cadena_conexion= rs_crud.getString("DATA_SOURCE").toString()+"-/-" + rs_crud.getString("DB_SUSCRIPCIONES").toString()+"-/-"+ rs_crud.getString("USUARIO").toString()+"-/-"+ rs_crud.getString("PASSWORD").toString();
		    }
		    rs_crud.close();
		    st_crud.close();
		    conexion.close();
		    
	    	// 2- conexion a la base de smart dealer del ambiente actual de ejecucion para obtener el barrio con la ciudad y departamento 	
			queryString.setLength(0);
			queryString.append(" select top(1) ciudad.Ciudad NombreCiudad, barrio.Ciudad NombreBarrio ");
			queryString.append(" FROM tbInstGeograficas as barrio ");
			queryString.append(" INNER JOIN tbZonificacion zonificacionbarrio ON zonificacionbarrio.NuevoCodPostal = barrio.CodPostal ");
			queryString.append(" INNER JOIN tbZonificacion zonificacionsubregion ON zonificacionsubregion.IdZonificacion = zonificacionbarrio.IdZonificacionP ");
			queryString.append(" INNER JOIN tbZonificacion zonificacionregion ON zonificacionregion.IdZonificacion = zonificacionsubregion.IdZonificacionP ");
			queryString.append(" INNER JOIN tbInstGeograficas localidad ON localidad.CodPostal = barrio.CodPostalPadre ");
			queryString.append(" INNER JOIN tbInstGeograficas ciudad ON ciudad.CodPostal = localidad.CodPostalPadre ");
			queryString.append(" INNER JOIN tbTipoGeografia tipogeografia ON tipogeografia.CodTipoGeografia = barrio.CodTipoGeografia ");
			queryString.append(" WHERE tipogeografia.NomTipoGeografia = 'Barrio/Vereda' ");
			queryString.append(" AND ciudad.Ciudad=('" + ciudad.trim() + "') ");
			queryString.append(" AND ciudad.Departamento=('" + departamento.trim() + "') ");
			queryString.append(" AND ciudad.CodTipoGeografia='2' ");
			queryString.append(" ORDER by NEWID() ");
			conexion_smart_dealer = conexion_base_datos.conexion_sql_server_ambientes(cadena_conexion);
			st_smart_dealer = conexion_smart_dealer.createStatement();
			rs_smart_dealer = st_smart_dealer.executeQuery(queryString.toString());  	      
		    while (rs_smart_dealer.next()) {
		    	for (int i=1;i<=rs_smart_dealer.getMetaData().getColumnCount();i++) {
		    		str_barrio_aleatorio_smart_dealer=rs_smart_dealer.getString("nombrebarrio").toString();
		    		break;
		    	}
		    	break;
			  }
		    rs_smart_dealer.close();
		    st_smart_dealer.close();
		    conexion_smart_dealer.close();
	    	conexion = conexion_base_datos.conexion_sql_server("conexion_bd_robot");
			st_crud = conexion.createStatement();
			
			//Actualiza tabla de robot pantalla suscriptor con el barrio 
			queryString.setLength(0);
			queryString.append(" UPDATE " + tbl_suscriptor_robot + " SET CMB_BARRIO='" + str_barrio_aleatorio_smart_dealer + "' WHERE ID_CASO="+ ID_CASO);
		    st_crud.executeUpdate(queryString.toString());   
		    st_crud.close();
		    conexion.close(); 

		}catch(Exception e) {
			System.out.println("Error obtiene_barrio_sugerido " + e.toString());		
		}				 
	}
	
	public static void obtener_ciudad_instalacion(String id_caso,String id_caso_direccion)  {
		
		try {
			queryString.setLength(0);
			conexion = conexion_base_datos.conexion_sql_server("conexion_bd_robot");
			st_crud = conexion.createStatement();
			queryString.append(" SELECT TOP (1) *  FROM DATOS_SMARTDEALER_DIRECCIONES WHERE ID_CASO_DIRECCION='"+ id_caso_direccion +"'");
			rs_datos_ciudad = st_crud.executeQuery(queryString.toString()); 
			    while (rs_datos_ciudad.next()) {
					queryString.setLength(0);
					queryString.append(" UPDATE WND_SD_PRE_INFORMACION_SUSCRIPTOR_D SET CMB_GEN_DIR_1='" + rs_datos_ciudad.getString("CMB_GEN_DIR_1").toString() + "', TXT_GEN_DIR_2='" + rs_datos_ciudad.getString("TXT_GEN_DIR_2").toString() + "', CMB_GEN_DIR_3='" + rs_datos_ciudad.getString("CMB_GEN_DIR_3").toString() + "', TXT_GER_DIR_4='" + rs_datos_ciudad.getString("TXT_GER_DIR_4").toString() + "',");
					queryString.append(" TXT_GER_DIR_5='" + rs_datos_ciudad.getString("TXT_GER_DIR_5").toString() + "', CMB_GER_DIR_6='" + rs_datos_ciudad.getString("CMB_GER_DIR_6").toString() + "',CMB_TIPO_EDIFICACION='" + rs_datos_ciudad.getString("CMB_TIPO_EDIFICACION").toString() + "', TXT_EDIFICACION='" + rs_datos_ciudad.getString("TXT_TIPO_EDIFICACION").toString() + "',");
					queryString.append(" BTN_EDIFICACION='" + rs_datos_ciudad.getString("BTN_TIPO_EDIFICACION").toString() + "', CMB_UBICA_DIREC='" + rs_datos_ciudad.getString("CMB_UBICA_DIRRECCION").toString() + "', TXT_UBICA='" + rs_datos_ciudad.getString("TXT_UBICA_DIRRECCION").toString() + "', BTN_UBICA='" + rs_datos_ciudad.getString("BTN_UBICA_DIRRECCION").toString() + "',");
					queryString.append(" CMB_CIUDAD='" + rs_datos_ciudad.getString("Ciudad").toString() + "',");
					queryString.append(" DEPARTAMENTO='" + rs_datos_ciudad.getString("Departamento").toString() + "'," );
					queryString.append(" TXT_UBICA_Y='" + rs_datos_ciudad.getString("TXT_COORDENADAS_Y").toString() + "'," );
					queryString.append(" BTN_UBICA_XY='" + rs_datos_ciudad.getString("ADICIONAR_COORDENADAS").toString() + "'" );
					queryString.append(" WHERE ID_CASO=" + id_caso);
			    	
			    }
			    rs_datos_ciudad.close();

		}catch(Exception e) {
			System.out.println("Error obtener_ciudad_instalacion" + e.toString());
		}finally {
			try {
				//conexion = conexion_base_datos.conexion_sql_server("conexion_bd_robot");
				st_crud = conexion.createStatement();
				st_crud.executeUpdate(queryString.toString());
			    st_crud.close();
			    conexion.close();
			} catch (SQLException e) {
				System.out.println("Error SQLException obtener_ciudad_instalacion" + e.toString());
				// TODO Auto-generated catch block
				System.out.println("finally "+ e.toString());
			} 
		}
		
	}
	
	public void coleccion_datos_caso_de_prueba(String id_caso, String proceso_captura) {
	
	   	try {
	   	   	
	   		switch(proceso_captura.toLowerCase().toString()) {
	   		
	   		case "cliente_nuevo_prepago":
	   			
	   			conexion = conexion_base_datos.conexion_sql_server("conexion_bd_robot");
				String nombre_columna="";
				String valor_columna="";
				queryStrDriven.setLength(0);
				queryStrDriven.append(" SELECT intrg.TXT_NUM_DOC as documento_suscriptor,* FROM  WND_SD_PRE_CASOS_INTEGRALES_D intrg ");
				queryStrDriven.append(" inner join UNI_LOGIN_SD_D login on login.ID_CASO=intrg.ID_CASO_LOGIN ");
				queryStrDriven.append(" inner join WND_SD_PRE_INFORMACION_VENDEDOR_D vende on vende.ID_CASO= intrg.ID_CASO ");
				queryStrDriven.append(" inner join WND_SD_PRE_INFORMACION_SUSCRIPTOR_D susc on susc.ID_CASO= intrg.ID_CASO ");
				queryStrDriven.append(" inner join WND_SD_PRE_OFERTA_PROGRAMACION_D progrm on progrm.ID_CASO=intrg.ID_CASO ");
				queryStrDriven.append(" inner join WND_SD_PRE_INFORMACION_PAGOS_D pagos on pagos.ID_CASO=intrg.ID_CASO ");
				queryStrDriven.append(" inner join WND_SD_PRE_INFORMACION_ORDEN_SERVICIO_D ord_serv on ord_serv.ID_CASO=intrg.ID_CASO ");
				queryStrDriven.append(" inner join WND_SD_PRE_INFORMACION_RESUMEN_D resumen on resumen.ID_CASO=intrg.ID_CASO ");
				queryStrDriven.append(" WHERE intrg.ID_CASO='"+ id_caso +"' ");
				queryStrDriven.append(" order by intrg.ID_CASO asc ");
				st = conexion.createStatement();
			    rs = st.executeQuery(queryStrDriven.toString());  

				while (rs.next()) {
					
				    	choucair_prueba_aut.model.obtener_config_propierties.obtener_ciudad_instalacion(rs.getString("ID_CASO").toString(),rs.getString("ID_CASO_DIRECCION"));
				    	choucair_prueba_aut.model.obtener_config_propierties.genera_datos_aleatorios_smartdealer(rs.getString("ID_CASO").toString());
				    	choucair_prueba_aut.model.obtener_config_propierties.obtiene_barrio_sugerido(choucair_prueba_aut.pageObjects.LoginPageObject.str_ambiente_ejecucion.toString(),"WND_SD_PRE_INFORMACION_SUSCRIPTOR_D",rs.getString("ID_CASO").toString(),rs.getString("CMB_CIUDAD").toString(),rs.getString("DEPARTAMENTO").toString());
				    	
				    	collection_test_case.clear();
				    	for (int i=1;i<=rs.getMetaData().getColumnCount();i++) {
				    	  nombre_columna = rs.getMetaData().getColumnLabel(i).toLowerCase().toString();
				    	  valor_columna=rs.getString(i);
				    	  collection_test_case= (HashMap<String, String>) objeto_HashMap(nombre_columna, valor_columna);
				    	}
				    	 
				 }
				rs.close(); 
				st.close();
				conexion.close();

				    
	   			break;
	   			
	   		case "cliente_nuevo_pospago":
	   			
	   			break;

	   			
	   		}

	   	}catch(Exception e) {
	   		System.out.println("Error en el metodo coleccion_datos_caso_de_prueba: " + e.toString());
	   	}    
	}

	public void crud (String conexion_robot,String cadena, String tipo_action ) {
	
		try {
			
			conexion = conexion_base_datos.conexion_sql_server(conexion_robot);
	   		
			switch(tipo_action.toLowerCase().toString()) {
	   		
	   		case "create":
	   			break;
	   			
	   		case "read":	
	   			break;
	   		
	   		case "update":
	   			
	   			st_crud = conexion.createStatement();
	   			st_crud.executeUpdate(cadena);
	   			st_crud.close();
	   			conexion.close();
	   			
	   			break;
	   			
	   		case "delete":	
	   			break;
	   			
	   			
			}
		
		}catch(Exception e) {
			
		}
	}
	
	
	
	
	
	
}
