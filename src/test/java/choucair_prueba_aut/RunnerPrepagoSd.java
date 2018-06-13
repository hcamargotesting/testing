package choucair_prueba_aut;

import org.junit.runner.*;
import org.junit.runner.RunWith;
import choucair_prueba_aut.model.*;
import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import java.sql.*;
import java.util.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

//@RunWith(CucumberWithSerenity.class)
//@CucumberOptions(features = "src/test/resources/features/SmartDealer/Login" , tags="@Venta_prepago_nuevo_smartdealer")

public class RunnerPrepagoSd {
		
	public Statement st=null;
	public ResultSet rs = null;
	public StringBuilder queryStrDriven = new StringBuilder();
	public StringBuilder UpdateQuery = new StringBuilder();
	obtener_config_propierties obtener_config_propierties;
	public Connection conexion;
	public static HashMap<String, String> collection_test_case = new HashMap<>();
	public static String str_ambiente_ejecucion="SMARTDEALER_UAT";
	public RunnerPrepagoSd() {
		
	}

	@Before
	public void  Inicio() {
		try {	
		System.out.println(" Inicio ");
		conexion = conexion_base_datos.conexion_sql_server("conexion_bd_robot");	
	} catch (Exception e) {
		System.out.println(e.toString());
	}
}

    @Test
	public void test() throws SQLException{ 
    	
		String nombre_columna="";
		String valor_columna="";
    	System.out.println(" Medio ");  	
  
    	queryStrDriven.append(" SELECT intrg.TXT_NUM_DOC as documento_suscriptor,* FROM  WND_SD_PRE_CASOS_INTEGRALES_D intrg ");
		queryStrDriven.append(" inner join UNI_LOGIN_SD_D login on login.ID_CASO=intrg.ID_CASO_LOGIN ");
		queryStrDriven.append(" inner join WND_SD_PRE_INFORMACION_VENDEDOR_D vende on vende.ID_CASO= intrg.ID_CASO ");
		queryStrDriven.append(" inner join WND_SD_PRE_INFORMACION_SUSCRIPTOR_D susc on susc.ID_CASO= intrg.ID_CASO ");
		queryStrDriven.append(" inner join WND_SD_PRE_OFERTA_PROGRAMACION_D progrm on progrm.ID_CASO=intrg.ID_CASO ");
		queryStrDriven.append(" inner join WND_SD_PRE_INFORMACION_PAGOS_D pagos on pagos.ID_CASO=intrg.ID_CASO ");
		queryStrDriven.append(" inner join WND_SD_PRE_INFORMACION_ORDEN_SERVICIO_D ord_serv on ord_serv.ID_CASO=intrg.ID_CASO ");
		queryStrDriven.append(" inner join WND_SD_PRE_INFORMACION_RESUMEN_D resumen on resumen.ID_CASO=intrg.ID_CASO ");
		queryStrDriven.append(" WHERE intrg.ESTADO_CASO like '%Activo%' ");	
		queryStrDriven.append(" order by intrg.ID_CASO asc ");
		st = conexion.createStatement();
	    rs = st.executeQuery(queryStrDriven.toString());  

		while (rs.next()) {
		    	choucair_prueba_aut.model.obtener_config_propierties.obtener_ciudad_instalacion(rs.getString("ID_CASO").toString(),rs.getString("ID_CASO_DIRECCION"));
		    	choucair_prueba_aut.model.obtener_config_propierties.genera_datos_aleatorios_smartdealer(rs.getString("ID_CASO").toString());
		    	choucair_prueba_aut.model.obtener_config_propierties.obtiene_barrio_sugerido(str_ambiente_ejecucion,"WND_SD_PRE_INFORMACION_SUSCRIPTOR_D",rs.getString("ID_CASO").toString(),rs.getString("CMB_CIUDAD").toString(),rs.getString("DEPARTAMENTO").toString()); 	
		 }
		rs.close(); 
	    rs = st.executeQuery(queryStrDriven.toString());  
	        
	    while (rs.next()) {
	    	collection_test_case.clear();
	    	for (int i=1;i<=rs.getMetaData().getColumnCount();i++) {
	    	  nombre_columna = rs.getMetaData().getColumnLabel(i).toLowerCase().toString();
	    	  valor_columna=rs.getString(i);
	    	  collection_test_case= (HashMap<String, String>) choucair_prueba_aut.model.obtener_config_propierties.objeto_HashMap(nombre_columna, valor_columna);
	    	 	
	    	}
    	 JUnitCore.runClasses(ejecutar_cucumber.class);
    	 //System.out.println("Ejecutando el caso: " + rs.getString("ID_CASO").toString());
    }  	         
	   rs.close(); 

	   
	}
    
	@RunWith(CucumberWithSerenity.class)
    @CucumberOptions(features = "src/test/resources/features/SmartDealer/Login" , tags="@Venta_prepago_nuevo_smartdealer")
    public class ejecutar_cucumber {    	

    }
	
	public void caso_ejecutado(String ID_CASO) {
		
		//UpdateQuery.append(" UPDATE WND_SD_PRE_CASOS_INTEGRALES_D SET UTILIZADO='0' WHERE ID_CASO='" + ID_CASO + "'   ");
		try {			
			//st = conexion.createStatement();
		    //rs = st.executeQuery(UpdateQuery.toString());  	    		    
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}
    

    @After
	public void Final() {
    	
 
	}
    


    
}
