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
        rumboHomePageHomeVuelo.selectorVuelos();
        rumboHomePageHomeVuelo.scroll(0, 4000);
        Thread.sleep(2000);
        rumboHomePageHomeVuelo.clickTopCiudades();
        rumboHomePageHomeVuelo.buscarCiudadTop("Bruselas");
        rumboHomePageHomeVuelo.buscarIdaViajeTop("chile");
        rumboHomePageHomeVuelo.clickearAropuerto();
        rumboHomePageHomeVuelo.agregarPersonas(4, 3, 2);
        rumboHomePageHomeVuelo.modificarFechaIda(20, 3, 2023);
        rumboHomePageHomeVuelo.buscar();
        Thread.sleep(5000);
        rumboHomePageHomeVuelo.seleccionarMasBarato();
        Thread.sleep(5000);
        rumboHomePageHomeVuelo.bajarPrecio();
        Thread.sleep(3000);
        rumboHomePageHomeVuelo.bajarEscalaTop();
        Thread.sleep(3000);
        rumboHomePageHomeVuelo.limpiarFiltros();
        rumboHomePageHomeVuelo.informacion();
        rumboHomePageHomeVuelo.cambiarIframe();
        rumboHomePageHomeVuelo.informacionYClick();
        rumboHomePageHomeVuelo.clickearPrecio();
    }

    @Test
    void busquedaDeVueloFamiliarBV003() {//Funcionando OK, probar y dar visto bueno
        rumboHomePageHomeVuelo = new RumboHomePageVuelo(DriverFactory.getDriver());
        rumboHomePageHomeVuelo.navegarAlHome();
        rumboHomePageHomeVuelo.aceptarCookie();
        rumboHomePageHomeVuelo.selectorVuelos();
        rumboHomePageHomeVuelo.aceptarCookie();
        rumboHomePageHomeVuelo.origenDestinoSeleccion("arturo merino", "mendoza");
        rumboHomePageHomeVuelo.buscaridaYVuelta(7, 11, 2022, 30, 11, 2022);
        rumboHomePageHomeVuelo.agregarAdultos(1);
        rumboHomePageHomeVuelo.agregarNino("10 años");
        rumboHomePageHomeVuelo.agregarAdultos(1);
        rumboHomePageHomeVuelo.agregarNino("Bebé, 0-11 meses");
        rumboHomePageHomeVuelo.selectorDeClase("Turista");
        rumboHomePageHomeVuelo.buscarVuelo();
        rumboHomePageHomeVuelo.escalasIda("ninguna");
        rumboHomePageHomeVuelo.escalasVuelta("2 o mas");
        rumboHomePageHomeVuelo.mejorBaratoRaido("Más barato");
    }

    @Test
    void viajeEnPrimeraClaseBV004() {//Funcionando OK, probar y dar visto bueno
        rumboHomePageHomeVuelo = new RumboHomePageVuelo(DriverFactory.getDriver());
        rumboHomePageHomeVuelo.navegarAlHome();
        rumboHomePageHomeVuelo.aceptarCookie();
        rumboHomePageHomeVuelo.selectorVuelos();
        rumboHomePageHomeVuelo.aceptarCookie();
        rumboHomePageHomeVuelo.origenDestinoSeleccion("cancun", "egipto");
        rumboHomePageHomeVuelo.buscaridaYVuelta(21, 11, 2022, 27, 11, 2022);
        rumboHomePageHomeVuelo.agregarAdultos(3);
        rumboHomePageHomeVuelo.selectorDeClase("Primera");
        rumboHomePageHomeVuelo.buscarVuelo();
    }

    @Test
    void funcionalidadMultidestinoBV005() throws InterruptedException {

    }

    @Test
    void cantidadDePasajeroMasBebeBV006() {

    }
}