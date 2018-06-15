
@tag
Feature: Title of your feature
  I want to use this template for my feature file

  @ingreso_planet
  Scenario Outline: Login Correcto
    Given Ingreso a planet con la url correspondiente
    And ingreso de usuario <usuario>
    And ingreso de password <contrasena>
    And doy click en botón Ingresar 
    Then Ingreso al portal de planet
    
        Examples: 
      | usuario  | contrasena | 
      | "hcamargo" | "Danna*2011" |

      
 @Venta_prepago_nuevo_smartdealer_ambiente_uat
  Scenario Outline: Ingreso aplicativo smart dealer
   
    Given Ingreso aplicativo smartdealer ventas prepago 
    And utilizo el caso de prueba prepago numero de caso <ID_CASO> <TIPO_CAPTURA>
    And ingreso de usuario smartdealer ""
    And ingreso de contrasena usuario smartdealer ""
    And doy click en el boton aceptar
    And doy click al menu captura smartdealer
    And doy click en el sub menu Prepago ideal
    And doy click en el sub item Captura Prepago
    And selecciono punto de venta pagina vendedor
  	And doy click en el boton siguiente pantalla vendedor
    And selecciono tipo de documento suscriptor
  	And escribo numero de documento suscriptor
  	And escribo indicativo operador celular
  	And escribo numero de celular		
  	And doy click en calificar suscriptor
  	And validar mensaje despues de calificar suscriptor "Usted Puede continuar con el proceso de captura de esta suscripción"
  	And escribo lugar de expedicion suscriptor
  	And escribo nombre suscriptor
  	And escribo apellido de suscriptor
  	And escribo fecha nacimiento suscriptor
  	And selecciono genero suscriptor
  	And selecciono actividad economica suscriptor
  	And escribo referencia personal
  	And selecciono parentesco
  	And escribo indicativo telefono
  	And escribo numero telefono
  	And selecciono ciudad
  	And escribo indicativo instalacion
  	And escribo numero de telefono de instalacion
  	And escribo indicativo otro numero
  	And escribo numero telefonico otro
  	And escribo numero extension otro
  	And seleccciono vias acceso
  	And escribo direccion instalacion
  	And selecciono orienteacion direccion
  	And escribo numero de orientacion uno
  	And escribo numero de orientacion dos
  	And selecciono orienteacion tres
  	And doy click en el boton generar direccion
  	And doy click en boton georeferenciar
  	And selecciono barrio
  	And selecciono estrato
  	And doy click si tiene email
  	And escribo email
  	And escribo dominio email
  	And selecciono pago inicial
  	And selecciono pago mensual
  	And doy click en modalidad de pago
  	And doy click en oferta comercial
   	And doy click en calificar suscriptor
   	And validar resultado de la calificacion "APROBADO" 	
  	And doy click en boton grabar ibs
  	And siguiente pantalla suscriptor  	
  	And doy click en plan basico familia			  			
  	And doy click en decodificador principal
		And doy click en decodificador adicional
		And doy click en velocidad internet
		And escribo numero de contrato
		And escribo numero de verificacion contrato
		And doy click y selecciono modalidad de contrato
		And siguiente pantalla programacion
		And escribo valor pago efectivo
		And doy click en el boton siguiente pantalla pagos
		And escribo comentario orden de instalacion
		And doy click en el boton siguiente pantalla order instalacion
		And doy click en finalizar pantalla resumen
		And doy click aceptar finalizar agendamiento
		And valido el resultado finalizado del mensaje  	
  	Then doy click cerrar sesion Prepago
  	
  
        Examples: 
			|ID_CASO|TIPO_CAPTURA|
			|'64'|cliente_nuevo_prepago|
			|'71'|cliente_nuevo_prepago|
			|'156'|cliente_nuevo_prepago|
			|'241'|cliente_nuevo_prepago|
			|'351'|cliente_nuevo_prepago|
			|'352'|cliente_nuevo_prepago|
			|'352'|cliente_nuevo_prepago|
			|'358'|cliente_nuevo_prepago|
			|'379'|cliente_nuevo_prepago|
			|'380'|cliente_nuevo_prepago|
			|'381'|cliente_nuevo_prepago|





      
 
