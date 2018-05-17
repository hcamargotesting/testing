
@tag
Feature: Title of your feature
  I want to use this template for my feature file

  @rutacritica
  Scenario: Login Correcto
    Given Ingreso a planet con la url correspondiente
    And Ingreso de usuario "hcamargo"
    And Ingreso de password "Danna*2011"
    And doy click en botón Ingresar 
    Then Ingreso al portal de planet

    
 @regresiones
  Scenario: Login Correcto
    Given Ingreso a planet con la url correspondiente
    And Ingreso de usuario "hcamargo"
    And Ingreso de password "Danna*2011"
    And doy click en botón Ingresar 
    Then Ingreso al portal de planet   
    
    
    @regresiones  @rutacritica
    Scenario: Login Correcto
    Given Ingreso a planet con la url correspondiente
    And Ingreso de usuario "hcamargo"
    And Ingreso de password "Danna*2011"
    And doy click en botón Ingresar 
    Then Ingreso al portal de planet   
    
    @tag2
  Scenario: Login Correcto
    Given Ingreso a planet con la url correspondiente
    And Ingreso de usuario "hcamargo"
    And Ingreso de password "Danna*2011"
    And doy click en botón Ingresar 
    Then Ingreso al portal de planet   