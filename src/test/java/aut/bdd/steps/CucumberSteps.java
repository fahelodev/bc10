package aut.bdd.steps;

import aut.bdd.pages.CucumberHomePage;
import framework.engine.selenium.DriverFactory;
import io.cucumber.datatable.DataTable;
import io.cucumber.java8.En;
import org.junit.jupiter.api.Assertions;

import java.sql.SQLOutput;
import java.util.List;

public class CucumberSteps implements En {

    //Solicitamos las pages no instaciadas
    CucumberHomePage cucumberHomePage;

    //Constructor -> le vamos a pasar las pages con las que interactua
    public CucumberSteps(CucumberHomePage cucumberHomePage){
        this.cucumberHomePage = cucumberHomePage;

        When("the Maker starts a game", () -> {
            DriverFactory.initDriver();
            cucumberHomePage.navegarAlHome();
        });

        Then("the Maker waits for a Breaker to join", () -> {
            // Write code here that turns the phrase above into concrete actions
            Assertions.assertTrue(true);
        });

        Given("the Maker has started a game with the word {string}", (String string) -> {
            // Write code here that turns the phrase above into concrete actions
            Assertions.assertTrue(true);
        });
        When("the Breaker joins the Maker's game", () -> {
            // Write code here that turns the phrase above into concrete actions
            Assertions.assertTrue(true);
        });

        Then("the Breaker must guess a word with {int} characters", (Integer int1) -> {
            // Write code here that turns the phrase above into concrete actions
            Assertions.assertTrue(true);
        });
        Given("^que estoy en la home page de Tsoft$", () -> {
            Assertions.assertTrue(true);
        });
        When("^me posiciono en el boton soluciones$", () -> {
            Assertions.assertTrue(true);
        });

        Then("^se debe desplegar la siguiente lista de Links$", (DataTable table) -> {

            //Crear una Lista de Listas : List<List<String>>
            List<List<String>> data = table.asLists();
            String link1 = data.get(0).get(0);
            String valor1 = data.get(0).get(1);

            System.out.println("Flag "+link1+" "+valor1);

        });


    }


}
