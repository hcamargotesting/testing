@tag
Feature: Title of your feature
  :: Venta prepago desde smart dealer ::

  @Venta_prepago_nuevo_smartdealer
  Scenario Outline: Ingreso aplicativo smart dealer
    Given Ingreso aplicativo smartdealer ventas prepago
    And ingreso de usuario smartdealer <usuario>
    And ingreso de contrasena usuario smartdealer <contrasena>
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
  	#And doy click no tiene email
  	And escribo email
  	And escribo dominio email
  	#And doy click en contrato fisico
  	And selecciono pago inicial
  	And selecciono pago mensual
  	And doy click en modalidad de pago
  	And doy click en oferta comercial
   	And doy click en calificar suscriptor 	
  	And doy click en boton grabar ibs
  	And siguiente pantalla suscriptor  	
  	And doy click en plan basico familia
	  #And doy click en prepago favorito  			
  			
  	And doy click en decodificador principal
		And doy click en decodificador adicional
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
		
	
		#And consulto la suscripcion en la pantalla home prepago
		
    
		
    
    Examples: 
      | usuario  | contrasena | 
      | "alemon" | "1"        |

      # alemon
      # angval
      # LUAN
      # omaech
      # johsaa
      # meroro
      # roslon
      # MAUMOR
      # ERIGON
      # angoro
      # omaroz