package aut.funcional.testcases;

import aut.funcional.pages.CruceroHomePage;
import framework.engine.selenium.DriverFactory;
import framework.engine.selenium.SeleniumTestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestCrucero extends SeleniumTestBase {

    CruceroHomePage cruceroHomePage;

    @Test
    public void OpcionesDeCrucero(){
        cruceroHomePage = new CruceroHomePage(DriverFactory.getDriver());
        cruceroHomePage.navegarAlHome();
        cruceroHomePage.recorridoDeOpcionesDeCrucero();
        Assertions.assertTrue(cruceroHomePage.elementoEncontradoAldarLaOpcion());
    }

    @Test
    public void OpcionesDeDrucero800x600(){
        cruceroHomePage = new CruceroHomePage(DriverFactory.getDriver());
        cruceroHomePage.navegarAlHome();
        cruceroHomePage.recorridoDeOpcionesDeCrucero800x600();
        Assertions.assertTrue(cruceroHomePage.elementoEncontradoAldarLaOpcion());
    }

    @Test
    public void DisponibilidadDeCruceros(){
        cruceroHomePage = new CruceroHomePage(DriverFactory.getDriver());
        cruceroHomePage.navegarAlHome();
        cruceroHomePage.hacerPrimerFormYBsucar();
        Assertions.assertEquals("Mediterráneo con Cualquier compañia",cruceroHomePage.textoACompararDespuesDelForm());
    }

    @Test
    public void formularioDeSolicitarPresupuestoIncompleto() throws InterruptedException {
        cruceroHomePage = new CruceroHomePage(DriverFactory.getDriver());
        cruceroHomePage.navegarAlHome();
        cruceroHomePage.llegarAlUltimoFormYSemicompletar();
    }

}
