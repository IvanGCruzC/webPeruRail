Feature: Feature search

  @estable
  Scenario: Mostrar error al superar 9 pasajeros
    Given que he seleccionado el destino "Machu Picchu"
    And he seleccionado la ruta "Cusco > Machu Picchu"
    When ingreso 9 adultos y 1 niño como pasajeros
    Then se motrará mensaje diciendo "ONLY UP TO 9 TICKETS"
