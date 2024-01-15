Feature: Obtener datos del usuario
  yo como usuario de la aplicación de req res
  quiero registrarme en la pagina de req res
  para poder iniciar sesion

  @PostRegistrarUsuario
  Scenario: Obtener informacion del usuario
    Given que el usuario quiera crear su cuenta en req res
    When hago la peticion de tipo Post
    Then el resultado deberia ser un codigo 200
    And un json con el token del usuario
