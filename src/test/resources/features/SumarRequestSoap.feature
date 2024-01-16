Feature: Obtener la suma de un servicio soap
  Yo como usuario quiero sumar 2 numeros
  para saber el resultado de la suma

  @SumarSoap
  Scenario: Obtener la suma de un servicio soap
    Given que el usuario quiera sumar un numero a servicio soap
    When hago la suma de 1 y 2
    Then obtengo la suma de el servicio soap
