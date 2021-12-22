Feature: Feature Cabins

  @estable
  Scenario: Mostrar mensajes de error cuando no hay cabinas disponibles
    Given que he seleccionado el destino "Cusco"
    And he seleccionado la ruta "Arequipa > Puno > Cusco"
    When doy click en search
    Then se mostrará el mensaje "No cabins available for the selected date"


  @estable
  Scenario: Mostrar mensajes de cuando solo se ha seleccionado niños como pasajeros
    Given que he seleccionado la ruta
      | destino | ruta         | tren                             | mes_año  | dia |
      | Cusco   | Puno > Cusco | Andean Explorer, A Belmond Train | May 2022 | 4   |
    And he seleccionado "1 CABIN" "SUITE" con 2 pasajeros niños
    When doy click en continuar en la página de cabinas
    Then se mostrará un popup con el mensaje "You must select at least 1 adult"

  @pending
  Scenario: Mostrar mensajes de cuando solo se ha seleccionado 9 cabinas
    Given que he seleccionado la ruta
      | destino | ruta         | tren                             | mes_año  | dia |
      | Cusco   | Puno > Cusco | Andean Explorer, A Belmond Train | May 2022 | 4   |
    And he seleccionado "5 CABINS" "SUITE" con 2 pasajeros niños
    When selecciono "4 CABINS" "TWIN"
    Then se mostrará un popup con el mensaje "The maximum total of passengers is 9 (Maximum Occupancy 2 Pers / Cab)"