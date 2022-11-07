package aut.funcional.testcases;

import aut.funcional.pages.VuelosHomePage;
import framework.engine.selenium.DriverFactory;
import framework.engine.selenium.SeleniumTestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;

public class TestVuelos extends SeleniumTestBase {
    VuelosHomePage vuelosHomePage;

    @Test //Paso
    public void Test1Vuelos() throws InterruptedException {
        vuelosHomePage = new VuelosHomePage(DriverFactory.getDriver());
        vuelosHomePage.NavegarAHomeYCampos();
        Assertions.assertEquals("Ya casi has terminado: introduce los datos de los pasajeros",vuelosHomePage.TituloTest1());
    }

    @Test //Paso
    public void Test2Vuelos() throws InterruptedException {
        vuelosHomePage = new VuelosHomePage(DriverFactory.getDriver());
        vuelosHomePage.LlegarAFormulario();
        Assertions.assertEquals("¡Listo! Elige cómo pagar ¡y a viajar!",vuelosHomePage.TituloTest2());
    }
    @Test //Paso
    public void Test3Vuelos() throws InterruptedException {
        vuelosHomePage = new VuelosHomePage(DriverFactory.getDriver());
        vuelosHomePage.ErrorEmail();
        Assertions.assertEquals("Introduce un email válido",vuelosHomePage.TituloTest3());
    }
    @Test //Aprobado
    public void Test4Vuelos() throws InterruptedException, IOException {
        vuelosHomePage = new VuelosHomePage(DriverFactory.getDriver());
        vuelosHomePage.VueloBarato();
        vuelosHomePage.screenShot();
    }

    @Test //Paso
    public void Test5Vuelos() throws InterruptedException {
        vuelosHomePage = new VuelosHomePage(DriverFactory.getDriver());
        vuelosHomePage.navegarAlHome();
        Assertions.assertEquals("Vuelos baratos a las localidades más solicitadas",vuelosHomePage.TituloTest5());
    }

    @Test
    public void Test6Vuelos() throws InterruptedException {
        vuelosHomePage = new VuelosHomePage(DriverFactory.getDriver());
        vuelosHomePage.VueloDirecto();
        Assertions.assertEquals("¡Listo! Elige cómo pagar ¡y a viajar!",vuelosHomePage.TituloTest6());
    }




}
