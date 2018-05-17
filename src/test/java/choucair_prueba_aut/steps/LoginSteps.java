package choucair_prueba_aut.steps;


import choucair_prueba_aut.pageObjects.LoginPageObject;
import net.thucydides.core.annotations.Step;

public class LoginSteps {

	LoginPageObject LoginPageObject;
	
	@Step
	public void Browser() {
		// TODO Auto-generated method stub
		LoginPageObject.open();
	}

	@Step
	public void IngresoUsuario(String usuario) {
		// TODO Auto-generated method stub
		//System.out.println(usuario);
		LoginPageObject.InputUsuario(usuario);
	}

	@Step
	public void IngresoPassword(String password) {
		// TODO Auto-generated method stub
		LoginPageObject.InputPassword(password);
	}

	@Step
	public void ClickBotonIngresar() {
		// TODO Auto-generated method stub
		LoginPageObject.ClickIngresar();
	}

	@Step
	public void IngresoPortalPlanet() {
		// TODO Auto-generated method stub
		LoginPageObject.IngresoPortal();
	}

	
	/* SMART DEALER*/
	@Step
	public void browser_smartdealer() {
		// TODO Auto-generated method stub
		LoginPageObject.open();
	}

	public void Ingreso_Usuario_Smartdealer(String usuario_sd) {
		// TODO Auto-generated method stub
		LoginPageObject.Input_Usuario_Smartdealer(usuario_sd);
	}

	public void Ingreso_Contrasena_Smartdealer(String contrasena_sd) {
		// TODO Auto-generated method stub
		LoginPageObject.Input_Contrasena_Smartdealer(contrasena_sd);
	}

	public void Click_boton_aceptar() {
		// TODO Auto-generated method stub
		LoginPageObject.Click_Boton_Aceptar_Login_Smartdealer();
	}

	public void Click_Menu_Captura_Smartdealer() {
		// TODO Auto-generated method stub
		LoginPageObject.Click_Menu_Smardealer();
	}

	public void Click_Submenu_Captura_Smartdealer() {
		// TODO Auto-generated method stub
		LoginPageObject.Click_Submenu_Smardealer();
	}

	public void Click_Subitem_Captura_Smartdealer() {
		// TODO Auto-generated method stub
		LoginPageObject.Click_Subitem_Smardealer();
	}

	public void Seleccion_Punto_Venta_Smartdealer() {
		// TODO Auto-generated method stub
		LoginPageObject.Select_Punto_de_Venta();
	}

	public void Seleccion_Tipo_Documento_Smartdealer() {
		// TODO Auto-generated method stub
		LoginPageObject.Select_Tipo_documento();
	}

	public void Click_Calificar_Suscriptor() {
		// TODO Auto-generated method stub
		LoginPageObject.Click_Calificar_Suscriptor();
	}

	public void IngresoSmartdealer() {
		// TODO Auto-generated method stub
		LoginPageObject.IngresoSmartdealer();		
	}

	public void ClickCerrarSesionSmartdealer() {
		// TODO Auto-generated method stub
		LoginPageObject.Click_Cerrar_Sesion_Smartdealer();
	}

	public void ClickBotonSiguienteVendedor() {
		// TODO Auto-generated method stub
		LoginPageObject.Click_Boton_Siguiente_Vendedor();
	}

	public void Ingresar_Numero_Documento_suscriptor() {
		// TODO Auto-generated method stub
		LoginPageObject.Input_Numero_Documento_suscriptor();
	}

	public void Ingresar_Lugar_Expedicion_suscriptor() {
		// TODO Auto-generated method stub
		LoginPageObject.Input_Lugar_Expedicion_suscriptor();	
	}

	public void Ingresar_Nombre_suscriptor() {
		// TODO Auto-generated method stub
		LoginPageObject.Input_Nombre_suscriptor();
	}

	public void Ingresar_Apellido_suscriptor() {
		// TODO Auto-generated method stub
		LoginPageObject.Input_Apellido_suscriptor();
	}

	public void Seleccion_Genero_suscriptor() {
		// TODO Auto-generated method stub
		LoginPageObject.Select_Genero_suscriptor();
	}

	public void Seleccion_Actividad_Economica_suscriptor() {
		// TODO Auto-generated method stub
		LoginPageObject.Select_Actividad_Economica_suscriptor();
	}

	public void Ingresar_Referencia_Personal() {
		// TODO Auto-generated method stub
		LoginPageObject.Input_Referencia_Personal();
	}

	public void Seleccion_Parentesco() {
		// TODO Auto-generated method stub
		LoginPageObject.Select_Parentesco();
	}

	public void Ingresar_Indicativo_Telefono() {
		// TODO Auto-generated method stub
		LoginPageObject.Input_indicativo_Telefono();
	}

	public void Ingresar_Numero_Telefonico() {
		// TODO Auto-generated method stub
		LoginPageObject.Input_Numero_Telefonico();
	}

	public void Ingresar_Fecha_Nacimiento() {
		// TODO Auto-generated method stub
		LoginPageObject.Input_Fecha_Nacimiento();
	}

	public void Seleccion_Ciudad() {
		// TODO Auto-generated method stub
		LoginPageObject.Select_Ciudad();
	}

	public void Ingresar_Indicativo_Instalacion() {
		// TODO Auto-generated method stub
	}

	public void Ingresar_Numero_Instalacion() {
		// TODO Auto-generated method stub
		LoginPageObject.Input_Numero_Instalacion();
	}

	public void Ingresar_Indicativo_Operador() {
		// TODO Auto-generated method stub
		LoginPageObject.Input_Indicativo_Operador();
	}

	public void Ingresar_Numero_Celular() {
		// TODO Auto-generated method stub
		LoginPageObject.Input_Numero_Celular();
		
	}

	public void Ingresar_Indicativo_Otro() {
		// TODO Auto-generated method stub
		LoginPageObject.Input_Indicativo_Otro();
	}

	public void Ingresar_Telefonico_Otro() {
		// TODO Auto-generated method stub
		LoginPageObject.Input_Telefonico_Otro();
	}

	public void Ingresar_Numero_Extension_Otro() {
		// TODO Auto-generated method stub
		LoginPageObject.Input_Numero_Extension_Otro();
	}

	public void Seleccion_Vias_Acceso() {
		// TODO Auto-generated method stub
		LoginPageObject.Select_Vias_Acceso();
	}

	public void Ingresar_Direccion_instalacion() {
		// TODO Auto-generated method stub
		LoginPageObject.Input_Direccion_Instalacion();
	}

	public void Seleccion_Orientacion_Direccion() {
		// TODO Auto-generated method stub
		LoginPageObject.Select_Orientacion_Direccion();
	}

	public void Click_Boton_Generar_Direccion() {
		// TODO Auto-generated method stub
		LoginPageObject.Click_Boton_Generar_Direccion();
	}

	public void Click_Boton_Georeferenciar() {
		// TODO Auto-generated method stub
		LoginPageObject.Click_Boton_Georeferenciar();
	}

	public void Ingresar_Numero_Orientacion_uno() {
		// TODO Auto-generated method stub
		LoginPageObject.Input_Numero_Orientacion_Uno();
	}

	public void Ingresar_Numero_Orientacion_dos() {
		// TODO Auto-generated method stub
		LoginPageObject.Input_Numero_Orientacion_Dos();
	}

	public void Seleccion_Barrio() {
		// TODO Auto-generated method stub
		LoginPageObject.Select_Barrio();
	}

	public void Seleccion_Estrato() {
		// TODO Auto-generated method stub
		LoginPageObject.Select_Estrato();
	}

	public void Click_Email_Si() {
		// TODO Auto-generated method stub
		LoginPageObject.Click_Email_Si();
	}

	public void Ingresar_Email() {
		// TODO Auto-generated method stub
		LoginPageObject.Input_Email();
	}

	public void Ingreso_Dominio_Email() {
		// TODO Auto-generated method stub
		LoginPageObject.Input_Dominio_Email();
	}

	public void Seleccion_Pago_Inicial() {
		// TODO Auto-generated method stub
		LoginPageObject.Select_Pago_Inicial();
	}

	public void Seleccion_Pago_Mensual() {
		// TODO Auto-generated method stub
		LoginPageObject.Select_Pago_Mensual();
	}

	public void Click_Modalidad_Pago() {
		// TODO Auto-generated method stub
		LoginPageObject.Click_Modalidad_Pago();
	}

	public void Click_Oferta_Comercial() {
		// TODO Auto-generated method stub
		LoginPageObject.Click_Oferta_Comercial();
	}

	public void Click_Boton_Calificar() {
		// TODO Auto-generated method stub
		LoginPageObject.Click_Boton_Calificar();
	}

	public void Click_Boton_Grabar_ibs() {
		// TODO Auto-generated method stub
		LoginPageObject.Click_Boton_Grabar_Ibs();
	}

	public void Siguiente_Pantalla_Suscriptor() {
		// TODO Auto-generated method stub
		LoginPageObject.Click_Siguiente_Pantalla_Suscriptor();
	}

	public void Click_radio_button_plan_basico_familia() {
		// TODO Auto-generated method stub
		LoginPageObject.Click_radio_button_plan_basico_familia();
	}

	public void Click_prepago_favorito() {
		// TODO Auto-generated method stub
		LoginPageObject.Click_Prepago_Favorito();
	}

	public void Click_decodificador_principal() {
		// TODO Auto-generated method stub
		LoginPageObject.Click_decodificador_principal();
	}

	public void Click_decodificador_adicional() {
		// TODO Auto-generated method stub
		LoginPageObject.Click_decodificador_adicional();
	}

	public void Ingresar_numero_contrato() {
		// TODO Auto-generated method stub
		LoginPageObject.Ingresar_numero_contrato();
	}

	public void Ingresar_numero_verificacion() {
		// TODO Auto-generated method stub
		LoginPageObject.Ingresar_numero_verificacion();
	}

	public void Seleccion_modalidad_venta() {
		// TODO Auto-generated method stub
		LoginPageObject.Select_modalidad_venta();
	}

	public void Siguiente_Pantalla_Programacion() {
		// TODO Auto-generated method stub
		LoginPageObject.Click_Siguiente_Pantalla_Programacion();
	}

	public void Ingresar_valor_pago_efectivo() {
		// TODO Auto-generated method stub
		LoginPageObject.Ingresar_valor_pago_efectivo();
	}

	public void Click_siguiente_pantalla_pagos() {
		// TODO Auto-generated method stub
		LoginPageObject.Click_Siguiente_Pantalla_Pagos();
	}

	public void Ingresar_comentario_orden_instalacion() {
		// TODO Auto-generated method stub
		LoginPageObject.Ingresar_comentario_orden_instalacion();
	}

	public void Click_siguiente_pantalla_instalacion() {
		// TODO Auto-generated method stub
		LoginPageObject.Click_siguiente_pantalla_instalacion();
	}

	public void Click_finalizar_venta() {
		// TODO Auto-generated method stub
		LoginPageObject.Click_finalizar_venta();
	}
	public void Click_boton_agendar() {
		// TODO Auto-generated method stub
		LoginPageObject.Click_boton_agendar();
	}
	public void Validar_resultado_finalizar() {
		// TODO Auto-generated method stub
		LoginPageObject.Validar_resultado_finalizar();
	}
	

	





	
}
