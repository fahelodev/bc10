Feature: tsoftglobal home page website
  revisaremos algunas caracteristicas de acceso de la pagina tsoftglobal

  @bc10 @regresion
  Scenario: Despliegue de paginas del boton SOLUCIONES de la barra navegadora de la home page de Tsoft
    Given que estoy en la home page de Tsoft
    When me posiciono en el boton soluciones
    Then se debe desplegar la siguiente lista de Links
      |Links a Desplegar|
      |BUILT-IN QUALITY |
      |BUSINESS SYSTEM TEAMS|
      |INNOVACION DIGITAL   |
      |OPERACION INTELIGENTE|
      |TRANSFORMACION TECNOLOGICA|
      |PLANIFICACION BIMODAL EMPRESARIAL|
      |PLATFORM SYSTEM TEAMS            |
      |VISIBILIDAD. INTELIGENCIA Y GOBIERNO|

