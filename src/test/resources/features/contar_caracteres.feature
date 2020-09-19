Feature: Contar Caracteres
  Yo como escritor
  Quiero contar caracteres
  Para conocer el numero de caracteres que tienen las palabras

  Scenario: Contar caracteres de una palabra
    Given quiero contar caracteres
    When cuento los caracteres de la palabra Mama
    Then deberia ver que el numero de caracteres es 4

  Scenario: Contar caracteres de un listado de palabras
    Given quiero contar caracteres
    When cuento los caracteres del listado
      | mama |
      | papa |
    Then deberia ver que el numero de caracteres es 8