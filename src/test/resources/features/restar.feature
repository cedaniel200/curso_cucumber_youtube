Feature: Restar
  Yo como matematico
  Quiero restar
  Para no errar en el calculo

  Scenario Outline: Restar numeros enteros
    Given quiero restar
    When resto <primerNumero> menos <SegundoNumero>
    Then deberia ver que el resultado de la resta es <restultado>
    Examples:
    |primerNumero|SegundoNumero|restultado|
    |4           |2            |2         |
    |2           |2            |0         |


