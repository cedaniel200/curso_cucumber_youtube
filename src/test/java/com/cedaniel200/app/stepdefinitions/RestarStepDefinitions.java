package com.cedaniel200.app.stepdefinitions;

import com.cedaniel200.app.calculo.Resta;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class RestarStepDefinitions {

    private Resta restador;
    private int resultado;

    @Given("^quiero restar$")
    public void prepararResta() {
        restador = new Resta();
    }

    @When("^resto (\\d+) menos (\\d+)$")
    public void restar(int arg1, int arg2) {
        resultado = restador.restar(arg1, arg2);
    }

    @Then("^deberia ver que el resultado de la resta es (\\d+)$")
    public void verificarResta(int arg1) {
        Assert.assertEquals(arg1, resultado);
    }


}
