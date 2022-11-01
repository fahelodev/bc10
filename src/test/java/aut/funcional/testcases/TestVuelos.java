package aut.funcional.testcases;

import aut.funcional.pages.VuelosHomePage;
import framework.engine.selenium.DriverFactory;
import framework.engine.selenium.SeleniumTestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import static framework.engine.utils.Constants.BASE_URL_AUT;

public class TestVuelos extends SeleniumTestBase {
    VuelosHomePage vuelosHomePage;

    @Test
    public void Test1Vuelos() throws InterruptedException {
        vuelosHomePage = new VuelosHomePage(DriverFactory.getDriver());
        vuelosHomePage.NavegarAHomeYCampos();
        Assertions.assertEquals("Ya casi has terminado: introduce los datos de los pasajeros",vuelosHomePage.TituloTest1());
    }

    @Test
    public void Test2Vuelos() throws InterruptedException {
        vuelosHomePage = new VuelosHomePage(DriverFactory.getDriver());
        vuelosHomePage.LlegarAFormulario();
    //    Assertions.assertEquals("¡Listo! Elige cómo pagar ¡y a viajar!",vuelosHomePage.TituloTest1());
    }




    @Test
    public void Test5Vuelos(){
        vuelosHomePage = new VuelosHomePage(DriverFactory.getDriver());
        vuelosHomePage.navegarAlHome();
        Assertions.assertEquals("Vuelos baratos a las localidades más solicitadas",vuelosHomePage.TituloTest5());
    }


}
