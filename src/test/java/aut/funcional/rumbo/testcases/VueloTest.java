package aut.funcional.rumbo.testcases;

import aut.funcional.rumbo.pages.RumboHomePageVuelo;
import framework.engine.selenium.DriverFactory;
import framework.engine.selenium.SeleniumTestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class VueloTest extends SeleniumTestBase {

    RumboHomePageVuelo rumboHomePageHomeVuelo;

    @Test
    void buscaVueloVacioBV001() {
        rumboHomePageHomeVuelo = new RumboHomePageVuelo(DriverFactory.getDriver());
        rumboHomePageHomeVuelo.navegarAlHome();
        rumboHomePageHomeVuelo.aceptarCookie();
        rumboHomePageHomeVuelo.selectorVuelos();
        rumboHomePageHomeVuelo.aceptarCookie();
        rumboHomePageHomeVuelo.buscarVuelo();
        Assertions.assertEquals("Introduce ciudad o aeropuerto de destino", rumboHomePageHomeVuelo.mensajesDeErrores());
        Assertions.assertEquals("Vuelos baratos | Buscador de vuelos | Rumbo", rumboHomePageHomeVuelo.textoUrlTitulo());

    }

    @Test
    void compraDeVueloTopMasBaratoBV002() throws InterruptedException {

        rumboHomePageHomeVuelo = new RumboHomePageVuelo(DriverFactory.getDriver());
        rumboHomePageHomeVuelo.navegarYAceptarCookies();
        rumboHomePageHomeVuelo.clickearFechaIda();
        rumboHomePageHomeVuelo.buscaridaYVuelta(18, 4, 2023, 10, 5, 2023);

    }

    @Test
    void comprarDeVueloTopMasBaratoBV003() throws InterruptedException {
        rumboHomePageHomeVuelo = new RumboHomePageVuelo(DriverFactory.getDriver());
        rumboHomePageHomeVuelo.navegarAlHome();
        Thread.sleep(1000);
        rumboHomePageHomeVuelo.aceptarCookie();
        rumboHomePageHomeVuelo.selectorVuelos();
        rumboHomePageHomeVuelo.origenDestinoSeleccion("arturo merino","mendoza");
        rumboHomePageHomeVuelo.buscaridaYVuelta(6,11,2022,29,11,2022);
        rumboHomePageHomeVuelo.agregarAdultos(1);
        rumboHomePageHomeVuelo.agregarNino("10 años");
        rumboHomePageHomeVuelo.agregarAdultos(1);
        rumboHomePageHomeVuelo.agregarNino("Bebé, 0-11 meses");
        rumboHomePageHomeVuelo.selectorDeClase("Turista");
        rumboHomePageHomeVuelo.buscarVuelo();
        Thread.sleep(15000);
        rumboHomePageHomeVuelo.escalasIda("ninguna");
        rumboHomePageHomeVuelo.escalasIda("1 escala");
        rumboHomePageHomeVuelo.escalasIda("2 o mas");
        rumboHomePageHomeVuelo.escalasVuelta("ninguna");
        rumboHomePageHomeVuelo.escalasVuelta("1 escala");
        rumboHomePageHomeVuelo.escalasVuelta("2 o mas");
        rumboHomePageHomeVuelo.mejorBaratoRaido("Más barato");
        rumboHomePageHomeVuelo.mejorBaratoRaido(" Más rápido");
        rumboHomePageHomeVuelo.mejorBaratoRaido("El mejor");
        Thread.sleep(5000);

    }

    @Test
    void viajeEnPrimeraClaseBV004() throws InterruptedException {
        rumboHomePageHomeVuelo = new RumboHomePageVuelo(DriverFactory.getDriver());
        rumboHomePageHomeVuelo.navegarAlHome();
        rumboHomePageHomeVuelo.aceptarCookie();
        rumboHomePageHomeVuelo.selectorVuelos();
        rumboHomePageHomeVuelo.origenDestinoSeleccion("cancun", "egipto");
        rumboHomePageHomeVuelo.buscaridaYVuelta(21,11,2022,27,11,2022);
        rumboHomePageHomeVuelo.agregarAdultos(3);
        rumboHomePageHomeVuelo.selectorDeClase("Primera");
        rumboHomePageHomeVuelo.buscarVuelo();
    }

    @Test
    void funcionalidadMultidestinoBV005() {
    }

    @Test
    void cantidadDePasajeroMasBebeBV006() {
    }
}
