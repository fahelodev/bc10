package aut.funcional.testcases;

import aut.funcional.pages.RumboHomePage;
import framework.engine.selenium.DriverFactory;
import framework.engine.selenium.SeleniumTestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static framework.engine.utils.Constants.BASE_URL_AUT;


public class RBO_002VB extends SeleniumTestBase {
    RumboHomePage rumbo;
    @Test
    public void pruebaVuelo2(){
        rumbo = new RumboHomePage(DriverFactory.getDriver());
        rumbo.navigateTo(BASE_URL_AUT);
        rumbo.acceptarCookies();
        rumbo.clickVuelos();
        rumbo.viajeros();
        rumbo.agregarNinios();
        rumbo.clickbucar();
        Assertions.assertEquals("El número de bebés (edad 0-1) no puede ser superior al de adultos.",rumbo.alertaNinio());
        Assertions.assertEquals("Introduce ciudad o aeropuerto de destino", rumbo.alertaVuelo());



    }
}