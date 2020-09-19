package com.cedaniel200.app.stepdefinitions;

import com.cedaniel200.app.palabras.ContadorCaracteres;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

import java.util.List;

public class ContarCaracteresStepDefinitions {
    private ContadorCaracteres contador;
    private int resultado;

    @Given("^quiero contar caracteres$")
    public void prepararConteoCaracteres() {
        contador = new ContadorCaracteres();
    }

    @When("^cuento los caracteres de la palabra (.*)$")
    public void contarCaracteres(String palabra) {
        resultado = contador.contar(palabra);
    }

    @When("^cuento los caracteres del listado$")
    public void cuentoLosCaracteresDelListado(List<String> palabras) {
        resultado = contador.contar(palabras);
    }

    @Then("^deberia ver que el numero de caracteres es (\\d+)$")
    public void verificarResultado(int arg1) {
        Assert.assertEquals(arg1, resultado);
    }
}
