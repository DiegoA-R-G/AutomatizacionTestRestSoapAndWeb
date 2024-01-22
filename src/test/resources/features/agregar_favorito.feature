Feature: Agregar una pelicula como favorito
  Yo como usuario quiero agregar una pelicula a mis favoritos
  para ver mis favoritos

  @VerFavoritos
  Scenario: Agregar pelicula favorita
    Given que el usuario esta en la pagina de inicio
    When el usuario selecciona la pelicula
    Then el usuario da clic en el boton para agregar a favoritos