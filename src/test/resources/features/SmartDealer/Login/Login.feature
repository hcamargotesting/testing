
@tag
Feature: Title of your feature
  I want to use this template for my feature file

  @ingreso_planet
  Scenario: Login Correcto
    Given Ingreso a planet con la url correspondiente
    And ingreso de usuario "hcamargo"
    And ingreso de password "Danna*2011"
    And doy click en botón Ingresar 
    Then Ingreso al portal de planet


