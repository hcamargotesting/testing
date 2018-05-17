package choucair_prueba_aut.definition;

import choucair_prueba_aut.steps.LoginSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class LoginDefinition {

	@Steps
	LoginSteps LoginSteps;
	
	@Given("^Ingreso a planet con la url correspondiente$")
	public void ingreso_a_planet_con_la_url_correspondiente() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		LoginSteps.Browser();
		
	}

	@When("^Ingreso de usuario \"([^\"]*)\"$")
	public void Ingreso_de_usuario(String usuario) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		LoginSteps.IngresoUsuario(usuario);		
	}

	@When("^Ingreso de password \"([^\"]*)\"$")
	public void Ingreso_de_password(String password) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		LoginSteps.IngresoPassword(password);
	    
	}

	@When("^doy click en botón Ingresar$")
	public void doy_click_en_botón_Ingresar() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		LoginSteps.ClickBotonIngresar();
	}

	@Then("^Ingreso al portal de planet$")
	public void ingreso_al_portal_de_planet() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		LoginSteps.IngresoPortalPlanet();
	}

	
	/* smart dealer*/
	
	@Then("^Ingreso aplicativo smartdealer ventas prepago$")
	public void ingreso_aplicativo_smartdealer_ventas_prepago() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		LoginSteps.browser_smartdealer();
		
	}

	@When("^ingreso de usuario smartdealer \"([^\"]*)\"$")
	public void ingreso_de_usuario_smartdealer(String usuario_sd) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		LoginSteps.Ingreso_Usuario_Smartdealer(usuario_sd);
	}

	@When("^ingreso de contrasena usuario smartdealer \"([^\"]*)\"$")
	public void ingreso_de_contrasena_usuario_smartdealer(String contrasena_sd) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		LoginSteps.Ingreso_Contrasena_Smartdealer(contrasena_sd);
	}
	
	@When("^doy click en el boton aceptar$")
	public void doy_click_en_el_boton_aceptar() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		LoginSteps.Click_boton_aceptar();
	}

	@When("^doy click al menu captura smartdealer$")
	public void doy_click_al_menu_captura_smartdealer() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		LoginSteps.Click_Menu_Captura_Smartdealer();
	}

	@When("^doy click en el sub menu Prepago ideal$")
	public void doy_click_en_el_sub_menu_Prepago_ideal() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		LoginSteps.Click_Submenu_Captura_Smartdealer();
	}

	@When("^doy click en el sub item Captura Prepago$")
	public void doy_click_en_el_sub_item_Captura_Prepago() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		LoginSteps.Click_Subitem_Captura_Smartdealer();
	}

	@When("^selecciono punto de venta pagina vendedor$")
	public void selecciono_punto_de_venta_pagina_vendedor() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		LoginSteps.Seleccion_Punto_Venta_Smartdealer();
	}

	@Then("^selecciono tipo de documento suscriptor$")
	public void selecciono_tipo_de_documento_suscriptor() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		LoginSteps.Seleccion_Tipo_Documento_Smartdealer();
	}

	@Then("^doy click en calificar suscriptor$")
	public void doy_click_en_calificar_suscriptor() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		LoginSteps.Click_Calificar_Suscriptor();
	}
	@Then("^Ingreso a smart dealer$")
	public void ingreso_a_smart_dealer() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
		LoginSteps.IngresoSmartdealer();
	}
	
	@Then("^doy click cerrar sesion Prepago$")
	public void doy_click_cerrar_sesion_Prepago() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		LoginSteps.ClickCerrarSesionSmartdealer();
	}
	
	@Then("^doy click en el boton siguiente pantalla vendedor$")
	public void doy_click_en_el_boton_siguiente_pantalla_vendedor() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		LoginSteps.ClickBotonSiguienteVendedor();
	}

	@Then("^escribo numero de documento suscriptor$")
	public void escribo_numero_de_documento_suscriptor() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		LoginSteps.Ingresar_Numero_Documento_suscriptor();
	}

	@Then("^escribo lugar de expedicion suscriptor$")
	public void escribo_lugar_de_expedicion_suscriptor() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		LoginSteps.Ingresar_Lugar_Expedicion_suscriptor();
	}

	@Then("^escribo nombre suscriptor$")
	public void escribo_nombre_suscriptor() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		LoginSteps.Ingresar_Nombre_suscriptor();
	}

	@Then("^escribo apellido de suscriptor$")
	public void escribo_apellido_de_suscriptor() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		LoginSteps.Ingresar_Apellido_suscriptor();
	}

	@Then("^escribo fecha nacimiento suscriptor$")
	public void escribo_fecha_nacimiento_suscriptor() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		LoginSteps.Ingresar_Fecha_Nacimiento();
	}

	@Then("^selecciono genero suscriptor$")
	public void selecciono_genero_suscriptor() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		LoginSteps.Seleccion_Genero_suscriptor();
	    
	}

	@Then("^selecciono actividad economica suscriptor$")
	public void selecciono_actividad_economica_suscriptor() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		LoginSteps.Seleccion_Actividad_Economica_suscriptor();
	}

	@Then("^escribo referencia personal$")
	public void escribo_referencia_personal() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		LoginSteps.Ingresar_Referencia_Personal();
	}

	@Then("^selecciono parentesco$")
	public void selecciono_parentesco() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		LoginSteps.Seleccion_Parentesco();
	    
	}

	@Then("^escribo indicativo telefono$")
	public void escribo_indicativo_telefono() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		LoginSteps.Ingresar_Indicativo_Telefono();
	}

	@Then("^escribo numero telefono$")
	public void escribo_numero_telefono() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		LoginSteps.Ingresar_Numero_Telefonico();
	}
	
	@Then("^selecciono ciudad$")
	public void selecciono_ciudad() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		LoginSteps.Seleccion_Ciudad();
	}
	
	@Then("^escribo indicativo instalacion$")
	public void escribo_indicativo_instalacion() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		LoginSteps.Ingresar_Indicativo_Instalacion();
	}

	@Then("^escribo numero de telefono de instalacion$")
	public void escribo_numero_de_telefono_de_instalacion() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
		LoginSteps.Ingresar_Numero_Instalacion();
	}

	@Then("^escribo indicativo operador celular$")
	public void escribo_indicativo_operador_celular() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		LoginSteps.Ingresar_Indicativo_Operador();
	}

	@Then("^escribo numero de celular$")
	public void escribo_numero_de_celular() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		LoginSteps.Ingresar_Numero_Celular();
	}

	@Then("^escribo indicativo otro numero$")
	public void escribo_indicativo_otro_numero() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		LoginSteps.Ingresar_Indicativo_Otro();
	}

	@Then("^escribo numero telefonico otro$")
	public void escribo_numero_telefonico_otro() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		LoginSteps.Ingresar_Telefonico_Otro();
	}

	@Then("^escribo numero extension otro$")
	public void escribo_numero_extension_otro() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		LoginSteps.Ingresar_Numero_Extension_Otro();
	}

	@Then("^seleccciono vias acceso$")
	public void seleccciono_vias_acceso() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		LoginSteps.Seleccion_Vias_Acceso();
	}

	@Then("^escribo direccion instalacion$")
	public void escribo_direccion_instalacion() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		LoginSteps.Ingresar_Direccion_instalacion();
	}

	@Then("^selecciono orienteacion direccion$")
	public void selecciono_orienteacion_direccion() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		LoginSteps.Seleccion_Orientacion_Direccion();
	}

	@Then("^escribo numero de orientacion uno$")
	public void escribo_numero_de_orientacion_uno() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		LoginSteps.Ingresar_Numero_Orientacion_uno();	
	}

	@Then("^escribo numero de orientacion dos$")
	public void escribo_numero_de_orientacion_dos() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		LoginSteps.Ingresar_Numero_Orientacion_dos();
	}

	@Then("^selecciono orienteacion tres$")
	public void selecciono_orienteacion_tres() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	}
	
	@Then("^doy click en el boton generar direccion$")
	public void doy_click_en_el_boton_generar_direccion() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		LoginSteps.Click_Boton_Generar_Direccion();
	}
	
	@Then("^selecciono tipo de edificacion$")
	public void selecciono_tipo_de_edificacion() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	}

	@Then("^escribo dato de edificacion$")
	public void escribo_dato_de_edificacion() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	}

	@Then("^click agregar edificacion$")
	public void click_agregar_edificacion() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	}

	@Then("^selecciono ubicacion de edificacion$")
	public void selecciono_ubicacion_de_edificacion() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	}

	@Then("^escribo ubicacion de edificacion$")
	public void escribo_ubicacion_de_edificacion() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	}

	@Then("^click ubicacion edificacion$")
	public void click_ubicacion_edificacion() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	}

	@Then("^doy click en boton georeferenciar$")
	public void doy_click_en_boton_georeferenciar() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		LoginSteps.Click_Boton_Georeferenciar();
	}

	@Then("^selecciono barrio$")
	public void selecciono_barrio() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		LoginSteps.Seleccion_Barrio();
	}

	@Then("^selecciono estrato$")
	public void selecciono_estrato() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		LoginSteps.Seleccion_Estrato();
	}

	@Then("^doy click si tiene email$")
	public void doy_click_si_tiene_email() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		LoginSteps.Click_Email_Si();
	}

	@Then("^doy click no tiene email$")
	public void doy_click_no_tiene_email() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	}

	@Then("^doy click en contrato fisico$")
	public void doy_click_en_contrato_fisico() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	}

	@Then("^selecciono pago inicial$")
	public void selecciono_pago_inicial() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		LoginSteps.Seleccion_Pago_Inicial();
	}

	@Then("^selecciono pago mensual$")
	public void selecciono_pago_mensual() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		LoginSteps.Seleccion_Pago_Mensual();
	}

	@Then("^doy click en modalidad de pago$")
	public void doy_click_en_modalidad_de_pago() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		LoginSteps.Click_Modalidad_Pago();
	}

	@Then("^doy click en oferta comercial$")
	public void doy_click_en_oferta_comercial() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		LoginSteps.Click_Oferta_Comercial();
	}

	@Then("^doy click boton calificar$")
	public void doy_click_boton_calificar() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		LoginSteps.Click_Boton_Calificar();
	}

	@Then("^doy click en boton grabar ibs$")
	public void doy_click_en_boton_grabar_ibs() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		LoginSteps.Click_Boton_Grabar_ibs();
	}

	@Then("^siguiente pantalla suscriptor$")
	public void siguiente_pantalla_suscriptor() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		LoginSteps.Siguiente_Pantalla_Suscriptor();
	}
	@Then("^escribo email$")
	public void escribo_email() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		LoginSteps.Ingresar_Email();
	}

	@Then("^escribo dominio email$")
	public void escribo_dominio_email() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		LoginSteps.Ingreso_Dominio_Email();
	}	
	
/* pantalla programacion*/
	
	
	@Then("^doy click en plan basico familia$")
	public void doy_click_en_plan_basico_familia() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		LoginSteps.Click_radio_button_plan_basico_familia();
	}

	@Then("^doy click en prepago favorito$")
	public void doy_click_en_prepago_favorito() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		LoginSteps.Click_prepago_favorito();
	}

	@Then("^doy click en decodificador principal$")
	public void doy_click_en_decodificador_principal() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		LoginSteps.Click_decodificador_principal();
	}

	@Then("^doy click en decodificador adicional$")
	public void doy_click_en_decodificador_adicional() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		LoginSteps.Click_decodificador_adicional();
	}

	@Then("^escribo numero de contrato$")
	public void escribo_numero_de_contrato() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		LoginSteps.Ingresar_numero_contrato();
	}

	@Then("^escribo numero de verificacion contrato$")
	public void escribo_numero_de_verificacion_contrato() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		LoginSteps.Ingresar_numero_verificacion();
	}

	@Then("^doy click y selecciono modalidad de contrato$")
	public void doy_click_y_selecciono_modalidad_de_contrato() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	  //  throw new PendingException();
		LoginSteps.Seleccion_modalidad_venta();
	}
	
	@Then("^siguiente pantalla programacion$")
	public void siguiente_pantalla_programacion() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		LoginSteps.Siguiente_Pantalla_Programacion();
	}	
	
	@Then("^escribo valor pago efectivo$")
	public void escribo_valor_pago_efectivo() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		LoginSteps.Ingresar_valor_pago_efectivo();
	}

	@Then("^doy click en el boton siguiente pantalla pagos$")
	public void doy_click_en_el_boton_siguiente_pantalla_pagos() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		LoginSteps.Click_siguiente_pantalla_pagos();
	}

	@Given("^escribo comentario orden de instalacion$")
	public void escribo_comentario_orden_de_instalacion() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		LoginSteps.Ingresar_comentario_orden_instalacion();
	}

	@Then("^doy click en el boton siguiente pantalla order instalacion$")
	public void doy_click_en_el_boton_siguiente_pantalla_order_instalacion() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		LoginSteps.Click_siguiente_pantalla_instalacion();
	}
	@Then("^doy click en finalizar pantalla resumen$")
	public void doy_click_en_finalizar_pantalla_resumen() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		LoginSteps.Click_finalizar_venta();
	}
	@Then("^doy click aceptar finalizar agendamiento$")
	public void doy_click_aceptar_finalizar_agendamiento() throws Throwable {
	    //throw new PendingException();
		LoginSteps.Click_boton_agendar();
	}	
	@Given("^valido el resultado finalizado del mensaje$")
	public void valido_el_resultado_finalizado_del_mensaje() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		LoginSteps.Validar_resultado_finalizar();
	}	
	@Then("^consulto la suscripcion en la pantalla home prepago$")
	public void consulto_la_suscripcion_en_la_pantalla_home_prepago() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	}
	
	
	
	
	
	
	
	
	
	
	
}
