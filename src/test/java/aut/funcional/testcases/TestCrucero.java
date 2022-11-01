package aut.funcional.testcases;

import aut.funcional.pages.CruceroHomePage;
import framework.engine.selenium.DriverFactory;
import framework.engine.selenium.SeleniumTestBase;
import gherkin.lexer.Sr_cyrl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestCrucero extends SeleniumTestBase {

    CruceroHomePage cruceroHomePage;

    @Test
    public void DisponibilidadDeCruceros(){
        cruceroHomePage = new CruceroHomePage(DriverFactory.getDriver());
        cruceroHomePage.navegarAlHome();
        cruceroHomePage.hacerPrimerFormYBsucar();
        Assertions.assertEquals("Mediterráneo con Cualquier compañia",cruceroHomePage.textoACompararDespuesDelForm());
    }

    @Test
    public void OpcionesDeCrucero(){
        cruceroHomePage = new CruceroHomePage(DriverFactory.getDriver());
        cruceroHomePage.navegarAlHome();
        cruceroHomePage.recorridoDeOpcionesDeCrucero();
        Assertions.assertTrue(cruceroHomePage.elementoEncontradoAldarLaOpcion());
    }

    @Test
    public void formularioDeSolicitarPresupuestoIncompleto(){
        cruceroHomePage = new CruceroHomePage(DriverFactory.getDriver());
        cruceroHomePage.navegarAlHome();
        cruceroHomePage.llegarAlUltimoFormYSemicompletar();
        Assertions.assertEquals("Campo obligatorio",cruceroHomePage.textoACompararDelFormIncompleto());
    }

    @Test
    public void opcionesDeDrucero800x600()  {
        cruceroHomePage = new CruceroHomePage(DriverFactory.getDriver());
        cruceroHomePage.navegarAlHome();
        cruceroHomePage.recorridoDeOpcionesDeCrucero800x600();
        Assertions.assertTrue(cruceroHomePage.elementoEncontradoAldarLaOpcion());
    }


    @Test
    public void opciónDescubre(){
        cruceroHomePage = new CruceroHomePage(DriverFactory.getDriver());
        cruceroHomePage.navegarAlHome();
        cruceroHomePage.llegarHastaElBtnDescubre();
        String precioDelDescubre = cruceroHomePage.textoDelDescubreACompara();
        cruceroHomePage.clikEnDescubre();
        String precioDelCrucero = cruceroHomePage.textoDelPrecioDelCrucero();
        Assertions.assertEquals(precioDelDescubre,precioDelCrucero);
    }

    @Test
    public void precioMásBajoPrimero(){
        cruceroHomePage = new CruceroHomePage(DriverFactory.getDriver());
        cruceroHomePage.navegarAlHome();
        cruceroHomePage.hacerPrimerFormYBsucar();
        cruceroHomePage.filtrarPrecioMasBajoPrimero();
        Assertions.assertEquals("Precio (más bajo primero)",cruceroHomePage.textoDePrecioMasBajoPrimero());

    }


}
