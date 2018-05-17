package choucair_prueba_aut.pageObjects;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import java.util.*;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;	
import javax.swing.JOptionPane;


import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;


@DefaultUrl("http://172.21.141.103/SmartDealer/Pages/Public/Login.aspx")
//@DefaultUrl("http://172.21.141.92/SmartDealer/Pages/Public/Login.aspx")
/*
 * 
@DefaultUrl("http://planet.choucairtesting.com/bin/login/Main/WebHome?origurl=/")

*/

public class LoginPageObject extends PageObject {

	
	//Localizadores o mapeo de objetos
	String StrUsuario="username";
	String StrPassword="//*[@id='foswikiLogin']/div/form/div[3]/p[2]/input";
	String StrIngresar="//INPUT[@tabindex='4']";
	String StrMensaje="//*[@id='patternSideBarContents']/div[1]/a";
	String StrMenu="Hervin Camargo Carlier";		

	//Localizadores o mapeo de objetos smart dealer
	//lOGIN
	//String StrContrasena_sd="//INPUT[@id='lgnIngreso_Password']";
	//String StrBotonLogin="//INPUT[@id='lgnIngreso_LoginButton']";
	//String StrLoginSd="//INPUT[@id='lgnIngreso_Password']";
	//Menu
	//String StrMenuSd="//A[@class='ctl00_mnuMain_1 mainmenustyle ctl00_mnuMain_3'][text()='Captura']";
	//String StrSubMenuSd="//A[@class='ctl00_mnuMain_1 submenustyle ctl00_mnuMain_5'][text()='Prepago Ideal']";
	//String StrSubItemSd="(//A[@class='ctl00_mnuMain_1 submenustyle ctl00_mnuMain_5'][text()='Gestion Captura'][text()='Gestion Captura'])[1]";
	//***Pantalla vendedor***
	//String Str_Cmb_vendedor="//INPUT[@id='ctl00_mainContent_cmbVendedor_Input']";
	//String Str_cmb_punto_venta="//INPUT[@id='ctl00_mainContent_cmbPuntoVenta_Input']";
	//String Str_distrito="//SPAN[@id='ctl00_mainContent_lblDistrito']";
	//String Str_canal="//SPAN[@id='ctl00_mainContent_lblCanal']";
	//String Str_subcanal="//SPAN[@id='ctl00_mainContent_lblSUbcanal']";
	
	// bloque para declarar con la anotacion @findby
	//String StrUsuario_sd ="//INPUT[@id='lgnIngreso_UserName']";
	
	
	Random random = new Random();
	int numero_documento = Math.abs((111111111)+random.nextInt(99999999));
	String str_home_suscripcion="";
	String str_home_ibs="";
	String str_home_tipo="";
	String str_home_documento="";
	String str_home_apellido="";
	String str_home_nombre="";
	String str_home_estado="";
	String str_home_fecha="";
	String str_home_cliente="";
	String str_home_origen="";
	String str_home_tipo_susc="";
	
	
	
	String StrUsuario_sd_ini="//INPUT[@id='lgnIngreso_UserName']";
	@FindBy(xpath ="//INPUT[@id='lgnIngreso_UserName']")WebElementFacade StrUsuario_sd;
	@FindBy(xpath ="//INPUT[@id='lgnIngreso_Password']")WebElementFacade StrContrasena_sd;
	@FindBy(xpath ="//INPUT[@id='lgnIngreso_LoginButton']")WebElementFacade StrBotonLogin;
	@FindBy(xpath ="//A[@class='ctl00_mnuMain_1 mainmenustyle ctl00_mnuMain_3'][text()='Captura']")WebElementFacade StrMenuSd;
	@FindBy(xpath ="//A[@class='ctl00_mnuMain_1 submenustyle ctl00_mnuMain_5'][text()='Prepago Ideal']")WebElementFacade StrSubMenuSd;
	@FindBy(xpath ="(//A[@class='ctl00_mnuMain_1 submenustyle ctl00_mnuMain_5'][text()='Gestion Captura'][text()='Gestion Captura'])[1]")WebElementFacade StrSubItemSd;
	@FindBy(xpath ="//INPUT[@id='ctl00_mainContent_cmbVendedor_Input']")WebElementFacade Str_Cmb_vendedor;
	@FindBy(xpath ="//INPUT[@id='ctl00_mainContent_cmbPuntoVenta_Input']")WebElementFacade Str_punto_venta;
	@FindBy(xpath ="//SPAN[@id='ctl00_mainContent_lblDistrito']")WebElementFacade Str_distrito;
	@FindBy(xpath ="//SPAN[@id='ctl00_mainContent_lblCanal']")WebElementFacade Str_canal;
	@FindBy(xpath ="//SPAN[@id='ctl00_mainContent_lblSUbcanal']")WebElementFacade Str_subcanal;
	@FindBy(xpath ="//INPUT[@id='ctl00_mainContent_icoBorrar']")WebElementFacade Str_calificar_suscriptor;
	@FindBy(xpath = "//INPUT[@id='ctl00_mainContent_icoNext']")WebElementFacade Str_boton_sigiente_vendedor;
	@FindBy(xpath = "//A[@id='ctl00_lsLogout']")WebElementFacade StrCerrarSesion;
	@FindBy(xpath = "//INPUT[@id='ctl00_mainContent_cmbVendedor_Input']")WebElementFacade Str_vendedor;
	@FindBy(xpath = "//INPUT[@id='ctl00_mainContent_cmbPuntoVenta_Input']")WebElementFacade Str_punto_de_venta;
	@FindBy(xpath = "//DIV[@id='ctl00_mainContent_cmbPuntoVenta_c1']")WebElementFacade Str_item_punto_de_venta;
	@FindBy(xpath = "//INPUT[@id='ctl00_mainContent_cmbTipoDocumento_Input']")WebElementFacade Str_tipo_documento;
	@FindBy(xpath = "//DIV[@id='ctl00_mainContent_cmbTipoDocumento_c1']")WebElementFacade Str_item_tipo_documento;
	@FindBy(xpath = "//INPUT[@id='ctl00_mainContent_txtNumDocumentoPN']")WebElementFacade Str_numero_documento;
	@FindBy(xpath = "//INPUT[@id='ctl00_mainContent_txtLugarExpedicion']")WebElementFacade Str_lugar_expedicion;
	@FindBy(xpath = "//INPUT[@id='ctl00_mainContent_txtNombres']")WebElementFacade Str_nombre_suscriptor;
	@FindBy(xpath = "//INPUT[@id='ctl00_mainContent_txtApellidos']")WebElementFacade Str_apellido;
	@FindBy(xpath = "//INPUT[@id='ctl00_mainContent_cmbTipoSexo_Input']")WebElementFacade Str_genero_suscriptor;
	@FindBy(xpath = "//DIV[@id='ctl00_mainContent_cmbTipoSexo_c1']")WebElementFacade Str_item_genero_suscriptor;
	@FindBy(xpath = "//INPUT[@id='ctl00_mainContent_RadcmbCiiu_Input']")WebElementFacade Str_actividad_economicas;
	@FindBy(xpath = "//DIV[@id='ctl00_mainContent_RadcmbCiiu_c0']")WebElementFacade Str_item_actividad_economicas;
	@FindBy(xpath = "//INPUT[@id='ctl00_mainContent_txtContacto']")WebElementFacade Str_referencia_personal;	
	@FindBy(xpath = "//INPUT[@id='ctl00_mainContent_cmbParentesco_Input']")WebElementFacade Str_parentesco;
	@FindBy(xpath = "//DIV[@id='ctl00_mainContent_cmbParentesco_c1']")WebElementFacade Str_item_parentesco;
	@FindBy(xpath = "//INPUT[@id='ctl00_mainContent_txtIndicativoContacto']")WebElementFacade Str_indicativo_telefono;	
	@FindBy(xpath = "//INPUT[@id='ctl00_mainContent_txtTelefonoParentesco']")WebElementFacade Str_numero_telefonico;
	@FindBy(xpath = "//INPUT[@id='ctl00_mainContent_RdpFechaNacimiento_dateInput_text']")WebElementFacade Str_fecha_nacimiento;	
	@FindBy(xpath = "//INPUT[@id='ctl00_mainContent_cmbInstGeograficas_Input']")WebElementFacade Str_ciudad;
	@FindBy(xpath = "//DIV[@id='ctl00_mainContent_cmbInstGeograficas_c0']")WebElementFacade Str_item_ciudad;
	@FindBy(xpath = "//INPUT[@id='ctl00_mainContent_txtIndicativo']")WebElementFacade Str_indicativo_instalacion;
	@FindBy(xpath = "//DIV[@id='ctl00_mainContent_cmbInstGeograficas_c0']")WebElementFacade Str_item_indicativo_instalacion;
	@FindBy(xpath = "//INPUT[@id='ctl00_mainContent_txtTelefono']")WebElementFacade Str_numero_instalacion;	
	@FindBy(xpath = "//INPUT[@id='ctl00_mainContent_cmbOperadores_Input']")WebElementFacade Str_indicativo_operador;
	@FindBy(xpath = "//INPUT[@id='ctl00_mainContent_txtCelular']")WebElementFacade Str_numero_celular;
	@FindBy(xpath = "//INPUT[@id='ctl00_mainContent_txtIndicativoOficina']")WebElementFacade Str_indicativo_otro;	
	@FindBy(xpath = "//INPUT[@id='ctl00_mainContent_txtTelefonoOficina']")WebElementFacade Str_telefono_otro;
	@FindBy(xpath = "//INPUT[@id='ctl00_mainContent_txtExtension']")WebElementFacade Str_numero_extension_otro;	
	@FindBy(xpath = "//INPUT[@id='ctl00_mainContent_cmbViasAcceso_Input']")WebElementFacade Str_vias_acceso;
	@FindBy(xpath = "//INPUT[@id='ctl00_mainContent_txtAcceso1']")WebElementFacade Str_direccion_instalacion;	
	@FindBy(xpath = "//INPUT[@id='ctl00_mainContent_cmbTipoDocumento_Input']")WebElementFacade Str_orientacion_direccion;	
	@FindBy(xpath = "//INPUT[@id='ctl00_mainContent_icoPasarViaAcceso']")WebElementFacade Str_boton_generar_direccion;
	@FindBy(xpath = "//INPUT[@id='ctl00_mainContent_txtNumeral']")WebElementFacade Str_tipo_numero_orientacion;
	@FindBy(xpath = "//INPUT[@id='ctl00_mainContent_imgGeoreferenciar']")WebElementFacade Str_boton_georeferenciar;	
	@FindBy(xpath = "//INPUT[@id='ctl00_mainContent_txtNumeral2']")WebElementFacade Str_orientacion_dos;
	@FindBy(xpath = "//INPUT[@id='ctl00_mainContent_cmbBarriosLocalidad_Input']")WebElementFacade Str_barrio;
	@FindBy(xpath = "//DIV[@id='ctl00_mainContent_cmbBarriosLocalidad_c0']")WebElementFacade Str_item_barrio;
	@FindBy(xpath = "//INPUT[@id='ctl00_mainContent_cmbEstrato_Input']")WebElementFacade Str_estrato;
	@FindBy(xpath = "//INPUT[@id='ctl00_mainContent_rbtnSi']")WebElementFacade Str_email_si;	
	@FindBy(xpath = "//INPUT[@id='ctl00_mainContent_txtMail_txtName']")WebElementFacade Str_email;
	@FindBy(xpath = "//INPUT[@id='ctl00_mainContent_txtMail_txtDominios']")WebElementFacade Str_dominio_parcial;	
	@FindBy(xpath = "//INPUT[@id='ctl00_mainContent_cmbPagoInicial_Input']")WebElementFacade Str_pago_inicial;
	@FindBy(xpath = "//DIV[@id='ctl00_mainContent_cmbPagoInicial_c1']")WebElementFacade Str_item_pago_inicial;	
	@FindBy(xpath = "//INPUT[@id='ctl00_mainContent_radModPago_0']")WebElementFacade Str_modalidad_pago_espera_pago;
	@FindBy(xpath = "//INPUT[@id='ctl00_mainContent_radModPago_0']")WebElementFacade Str_modalidad_pago_vendedor;
	@FindBy(xpath = "//INPUT[@id='ctl00_mainContent_cmbPagoMensual_Input']")WebElementFacade Str_pago_mensual;
	@FindBy(xpath = "//DIV[@id='ctl00_mainContent_cmbPagoMensual_c1']")WebElementFacade Str_item_pago_mensual;
	@FindBy(xpath = "//INPUT[@id='ctl00_mainContent_rbtnTelevision']")WebElementFacade Str_oferta_comercial_tv;
	@FindBy(xpath = "//INPUT[@id='ctl00_mainContent_rbtnInternet']")WebElementFacade Str_oferta_comercial_internet;
	@FindBy(xpath = "//INPUT[@id='ctl00_mainContent_rbtnEmpaquetado']")WebElementFacade Str_oferta_comercial_bundle;
	@FindBy(xpath = "//INPUT[@id='ctl00_mainContent_icoGrabarIBS']")WebElementFacade Str_grabar_ibs;	
	@FindBy(xpath = "//INPUT[@id='ctl00_mainContent_icoBorrar']")WebElementFacade Str_boton_calificar;
	@FindBy(xpath = "//INPUT[@id='ctl00_mainContent_icoNext']")WebElementFacade Str_siguiente_pantalla_suscriptor;
	@FindBy(xpath = "//INPUT[@id='ctl00_mainContent_rblProgramacionBasica_0']")WebElementFacade Str_plan_basico;
	@FindBy(xpath = "//INPUT[@id='ctl00_mainContent_chk_favorito']")WebElementFacade Str_prepago_favorito;
	@FindBy(xpath = "//LABEL[@for='ctl00_mainContent_chk_principal'][text()='Principal']")WebElementFacade Str_deco_principal;	
	@FindBy(xpath = "//LABEL[@for='ctl00_mainContent_chk_espejo1'][text()='Adicional 1']")WebElementFacade Str_deco_adicional;	
	@FindBy(xpath = "//INPUT[@id='ctl00_mainContent_txtNumContrato']")WebElementFacade Str_numero_contrato;	
	@FindBy(xpath = "//INPUT[@id='ctl00_mainContent_txtDigitoVerificacion']")WebElementFacade Str_numero_verificacion;
	@FindBy(xpath = "//INPUT[@id='ctl00_mainContent_cmbCodOferta_Input']")WebElementFacade Str_modalidad_venta;
	@FindBy(xpath = "//DIV[@id='ctl00_mainContent_cmbCodOferta_c0']")WebElementFacade Str_item_modalidad_venta;
	@FindBy(xpath = "//INPUT[@id='ctl00_mainContent_imgbtnSiguiente']")WebElementFacade Str_siguiente_programacion;	
	@FindBy(xpath = "//INPUT[@id='ctl00_mainContent_txtValorEfectivo']")WebElementFacade Str_pago_efectivo;
	@FindBy(xpath = "//INPUT[@id='ctl00_mainContent_icoNext']")WebElementFacade Str_siguiente_pantalla_pagos;	
	@FindBy(xpath = "//TEXTAREA[@id='ctl00_mainContent_txtComentarioInstalacion']")WebElementFacade Str_comentario_orden_instalacion;
	@FindBy(xpath = "//INPUT[@id='ctl00_mainContent_icoNext']")WebElementFacade Str_siguiente_pantalla_instalacion;	
	@FindBy(xpath = "//INPUT[@id='ctl00_mainContent_icoNext']")WebElementFacade Str_finalizar_venta;	
	@FindBy(xpath = "//SPAN[@id='ctl00_mainContent_lblOkCaptura']")WebElementFacade Str_resultado_finalizar;		
	@FindBy(xpath = "//INPUT[@id='ctl00_mainContent_btnFinalizarCaptura']")WebElementFacade Str_aceptar_agendamiento;	
	@FindBy(xpath = "//INPUT[@id='ctl00_mainContent_btnFinalizarCaptura']")WebElementFacade Str_mensaje_finalizar_captura;	
	@FindBy(xpath = "(//A[@class='ctl00_mnuMain_1 submenustyle ctl00_mnuMain_5'][text()='Home'][text()='Home'])[1]")WebElementFacade Str_home_prepago;	
	/* home */
	@FindBy(xpath = "//INPUT[@id='ctl00_mainContent_txtNumDocumentoCaptura']")WebElementFacade Str_input_numero_documento_home;
	@FindBy(xpath = "//INPUT[@id='ctl00_mainContent_icoSearchCaptura']")WebElementFacade Str_btn_buscar;
	@FindBy(xpath = "//SPAN[@id='ctl00_mainContent_gvCaptura_ctl02_lblCodSuscrpcion']")WebElementFacade lbl_home_numero_documento;
	@FindBy(xpath = "//SPAN[@id='ctl00_mainContent_gvCaptura_ctl02_lblCodClienteIBS']")WebElementFacade lbl_home_suscripcion;
	@FindBy(xpath = "//SPAN[@id='ctl00_mainContent_gvCaptura_ctl02_lblEstado']")WebElementFacade lbl_home_estado;
	
	String Str_resultado="//SPAN[@id='ctl00_mainContent_lblOkCaptura']";
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//*********************************************************************************
		
	public boolean Consulta_Estado_Suscripcion() throws AWTException {
		Robot robot = new Robot();
		
		try {
			robot.keyPress(KeyEvent.VK_PAGE_UP);
			robot.keyPress(KeyEvent.VK_HOME);
			/* menu home prepago */
			waitFor(StrMenuSd).click();	
			waitFor(StrSubMenuSd).click();	
			waitFor(Str_home_prepago).click();
			
			/* filtra por documento y estado */	
			
			waitFor(Str_input_numero_documento_home).sendKeys(Integer.toString(numero_documento));
			waitFor(Str_btn_buscar).click();
			
			
			return false;
			
		}catch(Exception e) {
			return false;
			}
		}	
	public void InputUsuario(String usuario) {
		// TODO Auto-generated method stub
		try {
			find(By.name(StrUsuario)).sendKeys(usuario);			
		}catch(Exception e) {
			
		}
	}
	
	public void InputPassword(String password) {
		// TODO Auto-generated method stub
		find(By.xpath(StrPassword)).sendKeys(password);
	}

	public void ClickIngresar() {
		// TODO Auto-generated method stub
		find(By.xpath(StrIngresar)).click();
	}

	public void IngresoPortal() {
		// TODO Auto-generated method stub
		if(StrMenu.equals(findBy(StrMensaje).getText().trim())){
			System.out.println("Login Correcto");
		}else{
			System.out.println("Login Incorrecto");
		}		
	}
	
	
	/* smart dealer prepago*/
	public void Input_Usuario_Smartdealer(String usuario_sd) {
		// TODO Auto-generated method stub
		
		try {
			
			waitFor(StrUsuario_sd).sendKeys(usuario_sd);
			//find(By.xpath(StrUsuario_sd)).click();
			//find(By.xpath(StrUsuario_sd)).click();
			/*
			Boolean existe_objecto;
			
			//waitFor(StrUsuario_sd).isDisplayed();
			
			existe_objecto= find(By.xpath(StrUsuario_sd_ini)).isDisplayed();
			
			JOptionPane.showMessageDialog(null, existe_objecto);
			if (existe_objecto==true )
			    {
				JOptionPane.showMessageDialog(null, "si existe");
			    }else if(existe_objecto==false )			    {
			    	JOptionPane.showMessageDialog(null, "no existe");
			    }

			*/
		}catch(Exception e) {
			waitFor(StrCerrarSesion).click();
		}
	}

	public void Input_Contrasena_Smartdealer(String contrasena_sd) {
		// TODO Auto-generated method stub
		try {
			
			waitFor(StrContrasena_sd).sendKeys(contrasena_sd);
			
		}catch(Exception e) {
			waitFor(StrCerrarSesion).click();
		}
		
	}

	public void Click_Boton_Aceptar_Login_Smartdealer() {
		// TODO Auto-generated method stub
		try {
			waitFor(StrBotonLogin).click();			
		}catch(Exception e) {
			waitFor(StrCerrarSesion).click();
		}
		
	}
	
	public void Click_Menu_Smardealer() {
		// TODO Auto-generated method stub
		try {
			waitFor(StrMenuSd).click();			
		}catch(Exception e) {
			waitFor(StrCerrarSesion).click();
		}
	}
	
	public void Click_Submenu_Smardealer() {
		// TODO Auto-generated method stub
		try {
			waitFor(StrSubMenuSd).click();			
		}catch(Exception e) {
			waitFor(StrCerrarSesion).click();
		}
	}
	public void Click_Subitem_Smardealer() {
		// TODO Auto-generated method stub
		try {
			waitFor(StrSubItemSd).click();
		}catch(Exception e) {
			waitFor(StrCerrarSesion).click();
		}
		
	}

	public void Click_Calificar_Suscriptor() {
		// TODO Auto-generated method stub

		try {
			waitFor(Str_calificar_suscriptor).click();
			Thread.sleep(6000);
		}catch(Exception e) {
			waitFor(StrCerrarSesion).click();
			
		}
	}
	
	public void IngresoSmartdealer() {
		// TODO Auto-generated method stub
		
		try {
				/*
			String valor="1";
			if(valor=="1"){
				System.out.println("Login Correcto");
				find(By.xpath(StrCerrarSesion)).click();
			}else{
				System.out.println("Login Incorrecto");
				find(By.xpath(StrCerrarSesion)).click();
			}
			*/
				
		}catch(Exception e) {
			waitFor(StrCerrarSesion).click();				
		}
			
	}
	
	public void Click_Cerrar_Sesion_Smartdealer() {
		// TODO Auto-generated method stub
		try {
			waitFor(StrCerrarSesion).click();
						
		}catch(Exception e) {
			waitFor(StrCerrarSesion).click();
		}
		
	}
	
	public void Select_Punto_de_Venta() {
		// TODO Auto-generated method stub
		try {
			
			if(waitFor(Str_vendedor).isDisplayed()) {
				//JOptionPane.showMessageDialog(null, "uno..");				
				if(waitFor(Str_vendedor).isEnabled()) {
					//JOptionPane.showMessageDialog(null, "dos..");
					waitFor(Str_vendedor).typeAndTab("45621311");
				}else {
					//JOptionPane.showMessageDialog(null, "tres..");			
				}
				
			}else {
				//JOptionPane.showMessageDialog(null, "cuatro..");			
			}
			Thread.sleep(2500);
			waitFor(Str_punto_de_venta).click();
			Thread.sleep(2500);
			waitFor(Str_item_punto_de_venta).click();
			
		}catch(Exception e) {
			waitFor(StrCerrarSesion).click();			
		}
	}
	
	public void Click_Boton_Siguiente_Vendedor() {
		// TODO Auto-generated method stub
				
		try {	
			
			waitFor(Str_boton_sigiente_vendedor).click();	

			Alert alert = ExpectedConditions.alertIsPresent().apply(getDriver());
			   
			    if(alert != null) {
			    	getDriver().switchTo().alert().accept();
			    }
			    else {
			    	System.out.println("continuar");
			    }
					
		}catch(Exception e) {
			
			waitFor(StrCerrarSesion).click();			
		}		
	}

	public void Select_Tipo_documento() {
		// TODO Auto-generated method stub
		try {
			
			waitFor(Str_tipo_documento).click();
			waitFor(Str_item_tipo_documento).click();
			
		}catch(Exception e){
			waitFor(StrCerrarSesion).click();
		}

	}

	public void Input_Numero_Documento_suscriptor() {
		// TODO Auto-generated method stub
		/*
		Random random = new Random();
		int numero_documento = Math.abs((111111111)+random.nextInt(99999999));
		*/
		try {
	
			waitFor(Str_numero_documento).sendKeys(Integer.toString(numero_documento));
				
		}catch(Exception e) {
			waitFor(StrCerrarSesion).click();			
		}
		
	}

	public void Input_Lugar_Expedicion_suscriptor() {
		// TODO Auto-generated method stub
		try {
			
			waitFor(Str_lugar_expedicion).sendKeys("Cali");
			
		}catch(Exception e) {
			waitFor(StrCerrarSesion).click();			
		}
		
	}

	public void Input_Nombre_suscriptor() {
		// TODO Auto-generated method stub
		try {
			
			waitFor(Str_nombre_suscriptor).typeAndTab("Manuel Fernando");
						
		}catch(Exception e) {
			waitFor(StrCerrarSesion).click();			
		}
		
	}

	public void Input_Apellido_suscriptor() {
		// TODO Auto-generated method stub
		try {
			
			waitFor(Str_apellido).typeAndTab("Ramirez Espinoza");
			
			
		}catch(Exception e) {
			waitFor(StrCerrarSesion).click();			
		}
		
	}

	public void Select_Genero_suscriptor() {
		// TODO Auto-generated method stub
		try {
			
			waitFor(Str_genero_suscriptor).click();
			waitFor(Str_item_genero_suscriptor).click();
			
		}catch(Exception e) {
			waitFor(StrCerrarSesion).click();			
		}
		
	}

	public void Select_Actividad_Economica_suscriptor() {
		// TODO Auto-generated method stub
		try {

			waitFor(Str_actividad_economicas).sendKeys("0112");
			Thread.sleep(1500);
			waitFor(Str_item_actividad_economicas).click();

		}catch(Exception hg){
			waitFor(StrCerrarSesion).click();
		}

	}

	public void Input_Referencia_Personal() {
		// TODO Auto-generated method stub
		try {
			
			waitFor(Str_referencia_personal).sendKeys("Juan Moreno");
			
		}catch(Exception e) {
			waitFor(StrCerrarSesion).click();			
		}
		
	}

	public void Select_Parentesco() {
		// TODO Auto-generated method stub
		try {
			waitFor(Str_parentesco).click();
			waitFor(Str_item_parentesco).click();
			
		}catch(Exception e) {
			waitFor(StrCerrarSesion).click();			
		}
	
	}

	public void Input_indicativo_Telefono() {
		// TODO Auto-generated method stub
		try {
			
			waitFor(Str_indicativo_telefono).sendKeys("1");
						
		}catch(Exception e) {
			waitFor(StrCerrarSesion).click();			
		}
		
	}

	public void Input_Numero_Telefonico() {
		// TODO Auto-generated method stub
		try {
			
			waitFor(Str_numero_telefonico).sendKeys("2136598");
						
		}catch(Exception e) {
			waitFor(StrCerrarSesion).click();			
		}
		
	}

	public void Input_Fecha_Nacimiento() {
		// TODO Auto-generated method stub
		try {
			
			waitFor(Str_fecha_nacimiento).sendKeys("3/2/1978");
			
		}catch(Exception e) {
			waitFor(StrCerrarSesion).click();			
		}
		
	}

	public void Select_Ciudad() {
		// TODO Auto-generated method stub
		try {
			/*
			waitFor(Str_ciudad).sendKeys("SANTA FE DE BOGOTA");
			waitFor(Str_item_ciudad).sendKeys("SANTA FE DE BOGOTA");	
			*/
			//waitFor(Str_ciudad).sendKeys("MEDELLIN");
			waitFor(Str_ciudad).sendKeys("SANTA FE DE BOGOTA");
			waitFor(Str_item_ciudad).click();
			
		}catch(Exception e) {
			waitFor(StrCerrarSesion).click();			
		}
		
		
	}

	public void Input_Indicativo_Instalacion() {
		// TODO Auto-generated method stub
		try {
			waitFor(Str_indicativo_instalacion).sendKeys("1");
			waitFor(Str_indicativo_instalacion).click();			
		}catch(Exception e) {
			waitFor(StrCerrarSesion).click();			
		}
		
	}

	public void Input_Numero_Instalacion() {
		// TODO Auto-generated method stub
		try {
			
			waitFor(Str_numero_instalacion).sendKeys("2366598");			
		}catch(Exception e) {
			waitFor(StrCerrarSesion).click();			
		}
	}

	public void Input_Indicativo_Operador() {
		// TODO Auto-generated method stub
		try {
			
			waitFor(Str_indicativo_operador).typeAndTab("303");
								
		}catch(Exception e) {
			waitFor(StrCerrarSesion).click();			
		}
	}

	public void Input_Numero_Celular() {
		// TODO Auto-generated method stub
		try {
			waitFor(Str_numero_celular).sendKeys("3246598");					
		}catch(Exception e) {
			waitFor(StrCerrarSesion).click();			
		}
	}

	public void Input_Indicativo_Otro() {
		// TODO Auto-generated method stub
		try {
			
			waitFor(Str_indicativo_otro).sendKeys("1");
			
		}catch(Exception e) {
			waitFor(StrCerrarSesion).click();			
		}
		
	}

	public void Input_Telefonico_Otro() {
		// TODO Auto-generated method stub
		try {			
			waitFor(Str_telefono_otro).sendKeys("3265689");						
		}catch(Exception e) {
			waitFor(StrCerrarSesion).click();			
		}
		
	}

	public void Input_Numero_Extension_Otro() {
		// TODO Auto-generated method stub
		try {		
			waitFor(Str_numero_extension_otro).sendKeys("2541");						
		}catch(Exception e) {
			waitFor(StrCerrarSesion).click();			
		}

	}

	public void Select_Vias_Acceso() {
		// TODO Auto-generated method stub
		try {		
			waitFor(Str_vias_acceso).typeAndEnter("CARRERA");						
		}catch(Exception e) {
			waitFor(StrCerrarSesion).click();			
		}

	}

	public void Input_Direccion_Instalacion() {
		// TODO Auto-generated method stub
		try {			
			waitFor(Str_direccion_instalacion).sendKeys("106A");						
		}catch(Exception e) {
			waitFor(StrCerrarSesion).click();			
		}

	}

	public void Select_Orientacion_Direccion() {
		// TODO Auto-generated method stub
		try {
			
			//waitFor(Str_orientacion_direccion).sendKeys("NORTE");
						
		}catch(Exception e) {
			waitFor(StrCerrarSesion).click();			
		}	
	}

	public void Click_Boton_Generar_Direccion() {
		// TODO Auto-generated method stub
		try {
			waitFor(Str_boton_generar_direccion).click();		
		}catch(Exception e) {
			waitFor(StrCerrarSesion).click();			
		}
	}
	
	public void Input_Numero_Orientacion_Uno() {
		// TODO Auto-generated method stub
		try {
			waitFor(Str_tipo_numero_orientacion).sendKeys("142");

		}catch(Exception e) {
			waitFor(StrCerrarSesion).click();			
		}	
	}

	public void Input_Numero_Orientacion_Dos() {
		// TODO Auto-generated method stub
		try {
			waitFor(Str_orientacion_dos).sendKeys("00");
			
		}catch(Exception e) {
			waitFor(StrCerrarSesion).click();			
		}
	}
	
	public void Click_Boton_Georeferenciar() {
		// TODO Auto-generated method stub
		try {	
			
			Robot robot = new Robot();
			waitFor(Str_boton_georeferenciar).click();
			Thread.sleep(7000);
			robot.keyPress(KeyEvent.VK_PAGE_UP);
			
		}catch(Exception e) {
			waitFor(StrCerrarSesion).click();			
		}	
	}


	public void Select_Barrio() {
		// TODO Auto-generated method stub
		try {
			waitFor(Str_barrio).sendKeys("Lombardia");
			Thread.sleep(1200);
			waitFor(Str_barrio).click();
							
		}catch(Exception e) {
			waitFor(StrCerrarSesion).click();			
		}
	}

	public void Select_Estrato() {
		// TODO Auto-generated method stub
		try {
			waitFor(Str_estrato).typeAndTab("2");
			
		}catch(Exception e) {
			waitFor(StrCerrarSesion).click();			
		}
	}

	public void Click_Email_Si() {
		// TODO Auto-generated method stub
		try {			
			waitFor(Str_email_si).click();						
		}catch(Exception e) {
			waitFor(StrCerrarSesion).click();			
		}
	}

	public void Input_Email() {
		// TODO Auto-generated method stub
		try {
			
			waitFor(Str_email).sendKeys("JUANCHO");
			
			
		}catch(Exception e) {
			waitFor(StrCerrarSesion).click();			
		}
	}

	public void Input_Dominio_Email() {
		// TODO Auto-generated method stub
		try {
			
			waitFor(Str_dominio_parcial).sendKeys("@outlook.com");
						
		}catch(Exception e) {
			waitFor(StrCerrarSesion).click();			
		}		
	}

	public void Select_Pago_Inicial() {
		// TODO Auto-generated method stub
		try {

			waitFor(Str_pago_inicial).click();
			waitFor(Str_item_pago_inicial).click();
					
		}catch(Exception e) {
			waitFor(StrCerrarSesion).click();			
		}
	}

	public void Select_Pago_Mensual() {
		// TODO Auto-generated method stub
		try {
			waitFor(Str_pago_mensual).click();
			Thread.sleep(1000);
			waitFor(Str_item_pago_mensual).click();
		}catch(Exception e) {
			waitFor(StrCerrarSesion).click();			
		}		
	}

	public void Click_Modalidad_Pago() {
		// TODO Auto-generated method stub
		try {
			
			if(waitFor(Str_modalidad_pago_espera_pago).isDisplayed()) {
				//System.out.println("1");
				//JOptionPane.showMessageDialog(null, "1");
				if(waitFor(Str_modalidad_pago_espera_pago).isEnabled()) {
					//JOptionPane.showMessageDialog(null, "2");
					//System.out.println("2");
					waitFor(Str_modalidad_pago_espera_pago).click();
				}
			}
			/*
			if(waitFor(Str_modalidad_pago_vendedor).isDisplayed()) {
				//JOptionPane.showMessageDialog(null, "3");
				System.out.println("3");
				if(waitFor(Str_modalidad_pago_vendedor).isEnabled()) {
					//JOptionPane.showMessageDialog(null, "4");
					
					waitFor(Str_modalidad_pago_vendedor).click();
					System.out.println("4");
				}
			}			
			*/
		}catch(Exception e) {
			waitFor(StrCerrarSesion).click();			
		}
	}

	public void Click_Oferta_Comercial() {
		// TODO Auto-generated method stub
		try {
		
			waitFor(Str_oferta_comercial_tv).click();
			
			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_PAGE_UP);
			
		}catch(Exception e) {
			waitFor(StrCerrarSesion).click();			
		}		
	}

	public void Click_Boton_Calificar() {
		// TODO Auto-generated method stub
		try {
			
			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_HOME);
			waitFor(Str_boton_calificar).click();
			//Thread.sleep(10000);
						
		}catch(Exception e) {
			waitFor(StrCerrarSesion).click();			
		}	
	}

	public void Click_Boton_Grabar_Ibs() {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(6000);
			Robot robot = new Robot();
			waitFor(Str_grabar_ibs).click();
			
			robot.keyPress(KeyEvent.VK_PAGE_UP);
			
		}catch(Exception e) {
			waitFor(StrCerrarSesion).click();			
		}		
	}

	public void Click_Siguiente_Pantalla_Suscriptor() {
		// TODO Auto-generated method stub
		try {
			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_PAGE_UP);
			robot.keyPress(KeyEvent.VK_PAGE_UP);
			
			Thread.sleep(13000);
			waitFor(Str_siguiente_pantalla_suscriptor).click();
			Thread.sleep(6000);
		}catch(Exception e) {
			waitFor(StrCerrarSesion).click();			
		}		
	}

	public void Click_radio_button_plan_basico_familia() {
		// TODO Auto-generated method stub
		try {			
			waitFor(Str_plan_basico).click();			
		}catch(Exception e) {
			waitFor(StrCerrarSesion).click();			
		}
	}

	public void Click_Prepago_Favorito() {
		// TODO Auto-generated method stub
		
		try {
			waitFor(Str_prepago_favorito).click();			
		}catch(Exception e) {
			waitFor(StrCerrarSesion).click();			
		}
		
	}

	public void Click_decodificador_principal() {
		// TODO Auto-generated method stub
		try {
			waitFor(Str_deco_principal).click();			
		}catch(Exception e) {
			waitFor(StrCerrarSesion).click();			
		}
	}

	public void Click_decodificador_adicional() {
		// TODO Auto-generated method stub
		try {
			waitFor(Str_deco_adicional).click();
		}catch(Exception e) {
			waitFor(StrCerrarSesion).click();			
		}
	}

	public void Ingresar_numero_contrato() {
		// TODO Auto-generated method stub
		Random random = new Random();
		int rand = Math.abs((11111111)+random.nextInt(99999999));
		
		try {
			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_PAGE_DOWN);
			
			waitFor(Str_numero_contrato).sendKeys(Integer.toString(rand));
			
		}catch(Exception e) {
			waitFor(StrCerrarSesion).click();			
		}
	}

	public void Ingresar_numero_verificacion() {
		// TODO Auto-generated method stub
		Random random = new Random();
		int rand = Math.abs((1)+random.nextInt(9));

		try {
			waitFor(Str_numero_verificacion).sendKeys(Integer.toString(rand));
		}catch(Exception e) {
			waitFor(StrCerrarSesion).click();			
		}
	}

	public void Select_modalidad_venta() {
		// TODO Auto-generated method stub

		try {
			
			waitFor(Str_modalidad_venta).click();
			waitFor(Str_item_modalidad_venta).click();	
					
		}catch(Exception e) {
			waitFor(StrCerrarSesion).click();			
		}
		
	}
		
	public void Click_Siguiente_Pantalla_Programacion() {
		// TODO Auto-generated method stub
		getDriver();
		
		try {
			
			waitFor(Str_siguiente_programacion).click();
			//Thread.sleep(3000);
			getDriver().switchTo().alert().accept();
				        
		}catch(Exception e) {
			waitFor(StrCerrarSesion).click();			
		}
	}

	public void Ingresar_valor_pago_efectivo() {
		// TODO Auto-generated method stub
		try {
			waitFor(Str_pago_efectivo).sendKeys("0");				        
		}catch(Exception e) {
			waitFor(StrCerrarSesion).click();			
		}
	}

	public void Click_Siguiente_Pantalla_Pagos() {
		// TODO Auto-generated method stub
		try {
			
			waitFor(Str_siguiente_pantalla_pagos).click();
			
		}catch(Exception e) {
			waitFor(StrCerrarSesion).click();			
		}
	}

	public void Ingresar_comentario_orden_instalacion() {
		// TODO Auto-generated method stub
	try {
			waitFor(Str_comentario_orden_instalacion).sendKeys("Deco prepago sd");
			        
		}catch(Exception e) {
			
			waitFor(StrCerrarSesion).click();
			
		}
	}

	public void Click_siguiente_pantalla_instalacion() {
		// TODO Auto-generated method stub
	try {	
			waitFor(Str_siguiente_pantalla_instalacion).click();
		}catch(Exception e) {		
			waitFor(StrCerrarSesion).click();
		}
	}

	public void Click_finalizar_venta() {
		// TODO Auto-generated method stub
	try {		
			waitFor(Str_finalizar_venta).click();
				        
		}catch(Exception e) {			
			waitFor(StrCerrarSesion).click();			
		}

	}
	public void Click_boton_agendar() {
		// TODO Auto-generated method stub
		
		try {
			waitFor(Str_aceptar_agendamiento).click();	
			Thread.sleep(3000);
		
		}catch(Exception e){
			waitFor(StrCerrarSesion).click();		
		}

	}
	public void Validar_resultado_finalizar() {
		// TODO Auto-generated method stub
	try {
			String str_validar,str_validar_2;
			Boolean resul_consulta=false;
			//Thread.sleep(5000);
			str_validar_2= find(By.xpath(Str_resultado)).getText().trim();
			str_validar=waitFor(Str_resultado_finalizar).getText().toString();
			String StrResultadoFinalizado="El proceso de Captura Finalizó correctamente";	
			System.out.println("el resultado de str_validar:_" + str_validar +"_");
			System.out.println("el resultado de str_validar_2_:" + str_validar_2 +"_");
			System.out.println("el resultado de StrResultadoFinalizado:_" + StrResultadoFinalizado +"_");
			if(StrResultadoFinalizado.equals(str_validar)){
			//if(str_validar==StrResultadoFinalizado) {
				
				resul_consulta=Consulta_Estado_Suscripcion();
				
				if(Consulta_Estado_Suscripcion()==true) {
					System.out.println("validacion exitosa!!");
				}else {
					System.out.println("error generado durante la validacion en el home");
				}
				
				System.out.println("validacion exitosa!!");
			}else {
				System.out.println("error generado durante la validacion en el home");
			}
		}catch(Exception e) {		
			waitFor(StrCerrarSesion).click();			
		}

	}
	
	
	
	}
	