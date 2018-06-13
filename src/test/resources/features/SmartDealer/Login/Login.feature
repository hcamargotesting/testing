
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
