#language: en
Feature: Feature Payment
         Como Cliente
         Quiero ver el monto a pagar
         Para poder realizar el papo

  @estable
  Scenario Outline: Happy path hasta mostrar el monto a pagar en página de pago
    Given que he seleccionado la ruta
      | destino   | ruta   | tren   | mes_año   | dia   |
      | <destino> | <ruta> | <tren> | <mes_año> | <dia> |
    And seleccionado la cabina
      | cabina   | cantidad   |
      | <cabina> | <cantidad> |
    And ingresado la informacion de los pasajeros
      | nombre   | apellidos   | nacionalidad   | tipo_documento   | num_documento   | sexo   | telefono   | correo   |
      | <nombre> | <apellidos> | <nacionalidad> | <tipo_documento> | <num_documento> | <sexo> | <telefono> | <correo> |
    When doy click en continuar en la página de data de pasajero
    Then se mostrará la pantalla de pago "PAYMENT METHOD"
    And en la opción purchase summary mostrará el total "<total>"
    Examples:
      | destino | ruta         | tren                             | mes_año  | dia | cabina | cantidad | nombre | apellidos | nacionalidad | tipo_documento      | num_documento | sexo | telefono  | correo       | total    |
      | Cusco   | Puno > Cusco | Andean Explorer, A Belmond Train | May 2022 | 4   | SUITE  | 1 CABIN  | Luis   | Paz       | Peru         | Identification Card | 44556677      | Male | 999777666 | luis@abc.com | 2,415.00 |
