package aut.funcional.rumbo.testcases;

import aut.funcional.rumbo.pages.RumboHomePageCrucero;
import framework.engine.selenium.DriverFactory;
import framework.engine.selenium.SeleniumTestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CruceroTest extends SeleniumTestBase {
    RumboHomePageCrucero rumboHomePageCrucero;

    @Test
    void despliegueBarraDeslizanteBC001() throws InterruptedException {
        rumboHomePageCrucero = new RumboHomePageCrucero(DriverFactory.getDriver());
        rumboHomePageCrucero.navegarAlHome();
        rumboHomePageCrucero.aceptarCookie();
        rumboHomePageCrucero.seleccionarVerMas();
        rumboHomePageCrucero.seleccionarCrucero();
        Assertions.assertEquals("Cruceros. Ofertas de cruceros baratos. Tu crucero en Rumbo", rumboHomePageCrucero.textoUrlTitulo());
        rumboHomePageCrucero.scrollPage(0, 1200);
        Thread.sleep(1000);
        rumboHomePageCrucero.navegarOfertas();
        rumboHomePageCrucero.verTodasLasOfertas();
        Assertions.assertEquals("Cruceros", rumboHomePageCrucero.textoUrlTitulo());
    }

    @Test
    void busquedaCruceroUnaPersonaAdultaBC002() throws InterruptedException {
        rumboHomePageCrucero = new RumboHomePageCrucero(DriverFactory.getDriver());
        rumboHomePageCrucero.navegarAlHome();
        rumboHomePageCrucero.aceptarCookie();
        rumboHomePageCrucero.seleccionarVerMas();
        rumboHomePageCrucero.seleccionarCrucero();
        rumboHomePageCrucero.seleccionarDestinoCrucero("Mediterráneo");
        rumboHomePageCrucero.seleccionPeriodo(2023, "jun");
        rumboHomePageCrucero.cualquierDuracion("más de 9 días");
        rumboHomePageCrucero.cualquierCompania("Costa Cruceros");
        //rumboHomePageCrucero.cualquierPuerto("Barcelona");
        rumboHomePageCrucero.seleccionarCasillero();
        rumboHomePageCrucero.seleccionarPuertoBarce();
        rumboHomePageCrucero.agregarAdultos(1);
        Thread.sleep(4000);
        rumboHomePageCrucero.buscarCrucero();
    }

    @Test
    void reservaDeCruceroBC003() throws InterruptedException {
        rumboHomePageCrucero = new RumboHomePageCrucero(DriverFactory.getDriver());
        rumboHomePageCrucero.navegarAlHome();
        rumboHomePageCrucero.aceptarCookie();
        rumboHomePageCrucero.seleccionarVerMas();
        rumboHomePageCrucero.seleccionarCrucero();
        rumboHomePageCrucero.seleccionarDestinoCrucero("Mediterráneo");
        rumboHomePageCrucero.seleccionPeriodo(2023, "feb");
        rumboHomePageCrucero.cualquierDuracion("De 6 a 9 días");
        rumboHomePageCrucero.cualquierCompania("Costa Cruceros");
        rumboHomePageCrucero.seleccionarCasillero();
        rumboHomePageCrucero.seleccionarPuertoBarce();
        Thread.sleep(1000);
        rumboHomePageCrucero.agregarAdultos(0);
        rumboHomePageCrucero.buscarCrucero();


    }

    @Test
    void reservaDeCruceroMaximaCantidadDePersonasDisponiblesBC004() throws InterruptedException {//ok funcionando, probar
        rumboHomePageCrucero = new RumboHomePageCrucero(DriverFactory.getDriver());
        rumboHomePageCrucero.navegarAlHome();
        rumboHomePageCrucero.aceptarCookie();
        rumboHomePageCrucero.seleccionarVerMas();
        rumboHomePageCrucero.seleccionarCrucero();
        rumboHomePageCrucero.seleccionarDestinoCrucero("Mediterráneo");
        rumboHomePageCrucero.seleccionPeriodo(0, "0");//Significa cualquier destino
        rumboHomePageCrucero.cualquierDuracion("Cualquier duración");
        rumboHomePageCrucero.cualquierCompania("Celebrity Cruises");
        rumboHomePageCrucero.esperaMillis(100);
        rumboHomePageCrucero.cualquierPuerto("Ravenna");
        rumboHomePageCrucero.agregarAdultos(15);
        rumboHomePageCrucero.esperaMillis(100);
        rumboHomePageCrucero.agregarJunior(14);
        rumboHomePageCrucero.esperaMillis(100);
        rumboHomePageCrucero.agregarNinos(14);
        rumboHomePageCrucero.esperaMillis(100);
        rumboHomePageCrucero.agregarBebes(14);
        rumboHomePageCrucero.esperaMillis(100);
        rumboHomePageCrucero.buscarCrucero();
    }

    @Test
    void cotizacionDeUnCruceroParaUnaFamiliaBC005() throws InterruptedException {//ok, funcionando, probar
        rumboHomePageCrucero = new RumboHomePageCrucero(DriverFactory.getDriver());
        rumboHomePageCrucero.navegarAlHome();
        rumboHomePageCrucero.aceptarCookie();
        rumboHomePageCrucero.seleccionarVerMas();
        rumboHomePageCrucero.seleccionarCrucero();
        rumboHomePageCrucero.seleccionarDestinoCrucero("Sudamérica");
        rumboHomePageCrucero.seleccionPeriodo(2023, "ene");
        rumboHomePageCrucero.cualquierDuracion("De 6 a 9 días");
        rumboHomePageCrucero.cualquierCompania("MSC Cruceros");
        rumboHomePageCrucero.cualquierPuerto("Buenos Aires");
        rumboHomePageCrucero.esperaMillis(100);
        rumboHomePageCrucero.agregarJunior(1);
        rumboHomePageCrucero.buscarCrucero();
    }

    @Test
    void navegacionCrucerosEnOfertaBC006() throws InterruptedException {

        rumboHomePageCrucero = new RumboHomePageCrucero(DriverFactory.getDriver());
        rumboHomePageCrucero.navegarAlHome();
        rumboHomePageCrucero.aceptarCookie();
        rumboHomePageCrucero.seleccionarVerMas();
        rumboHomePageCrucero.seleccionarCrucero();
        rumboHomePageCrucero.bscCruceros();
        Thread.sleep(2000);
        rumboHomePageCrucero.costaCruceros();
        rumboHomePageCrucero.filtrarRating();
        rumboHomePageCrucero.ingresarOpcion();
        rumboHomePageCrucero.carnivalHorizon();
        rumboHomePageCrucero.botonesDesplegables();
        rumboHomePageCrucero.seleccionarCompanhia();
        rumboHomePageCrucero.seleccionarPresupuesto();

    }

}
