package aut.funcional.rumbo.testcases;

import aut.funcional.rumbo.pages.RumboHomePageHotel;
import framework.engine.selenium.DriverFactory;
import framework.engine.selenium.SeleniumTestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HotelTest extends SeleniumTestBase {

    RumboHomePageHotel rumboHomePageHotel;

    @Test
    void funcionalidadPagoFraccionadoBH001() {//funcionando
        rumboHomePageHotel = new RumboHomePageHotel(DriverFactory.getDriver());
        rumboHomePageHotel.navegarAlHome();
        rumboHomePageHotel.aceptarCookie();
        rumboHomePageHotel.selectorHotel();
        rumboHomePageHotel.aceptarCookie();
        rumboHomePageHotel.selecionarFraccionado();
        rumboHomePageHotel.echaleUnVistazo();
        Assertions.assertEquals("Pago fraccionado | Rumbo", rumboHomePageHotel.textoUrlTitulo());
        rumboHomePageHotel.selectorHotel();
        Assertions.assertEquals("Hoteles | Ofertas de Hoteles baratos | Rumbo", rumboHomePageHotel.textoUrlTitulo());

    }

    @Test
    void encontrarAlojamientoDisponiblesBH002() throws InterruptedException {//ok funcionando,
        rumboHomePageHotel = new RumboHomePageHotel(DriverFactory.getDriver());
        rumboHomePageHotel.navegarAlHome();
        rumboHomePageHotel.aceptarCookie();
        rumboHomePageHotel.selectorHotel();
        rumboHomePageHotel.aceptarCookie();
        rumboHomePageHotel.buscarAlojamientoEn("Buenos Aires");
        rumboHomePageHotel.buscaridaYVuelta(10, 11, 2022, 13, 11, 2022);
        rumboHomePageHotel.agregarNino("5 años");
        rumboHomePageHotel.buscarHotel();
        rumboHomePageHotel.filtroEstrellas(4);
    }

    @Test
    void registrarFechaDeEntradaBH003() throws InterruptedException {
        rumboHomePageHotel = new RumboHomePageHotel(DriverFactory.getDriver());
        rumboHomePageHotel.navegarAlHome();
        Thread.sleep(2000);
        rumboHomePageHotel.aceptarCookie();
        rumboHomePageHotel.selectorHotel();
        rumboHomePageHotel.seleccionarhotelSpa();
        Thread.sleep(2000);
        //cambiarPag();
        rumboHomePageHotel.seleccionarhotelMiro();
        rumboHomePageHotel.elegirTipoHabitacion();
        Thread.sleep(2000);
        rumboHomePageHotel.seleccionarSoloHabitacionDouble();

    }


    @Test
    void buscarHotelBH004() throws InterruptedException { // okey
        rumboHomePageHotel = new RumboHomePageHotel(DriverFactory.getDriver());
        rumboHomePageHotel.navegarAlHome();
        rumboHomePageHotel.aceptarCookie();
        rumboHomePageHotel.selectorHotel();
        rumboHomePageHotel.aceptarCookie();
        rumboHomePageHotel.ningunDestino();
        rumboHomePageHotel.buscaridaYVuelta(20, 11, 2022, 2, 12, 2022);
        rumboHomePageHotel.agregarAdultos(3);
        rumboHomePageHotel.agregarNino("2 años");
        rumboHomePageHotel.buscarHotel();
        rumboHomePageHotel.filtroDinero();
        rumboHomePageHotel.filtroAlojamiento();
        rumboHomePageHotel.filtroCancelacionGratuita();
        rumboHomePageHotel.filtrowifiGratis();
        Thread.sleep(2000);
        rumboHomePageHotel.filtroValoracion();
        Thread.sleep(2000);
        rumboHomePageHotel.filtroRegimen();
        rumboHomePageHotel.seleccionarPais();
        rumboHomePageHotel.limpiarFiltro();
        rumboHomePageHotel.seleccionarHotel();
        rumboHomePageHotel.valoraciones();


    }

    @Test
    void verMejoresOfertasEnHotelesBH005() throws InterruptedException {
        rumboHomePageHotel = new RumboHomePageHotel(DriverFactory.getDriver());
        rumboHomePageHotel.navegarAlHome();
        Thread.sleep(2000);
        rumboHomePageHotel.aceptarCookie();
        rumboHomePageHotel.selectorHotel();
        rumboHomePageHotel.seleccionHotelesRurales();
        Thread.sleep(4000);
        cambiarPag();
        rumboHomePageHotel.seleccionHotelFincaLosLlanos();
      //  rumboHomePageHotel.seleccionarTipoHabitacion();
        rumboHomePageHotel.elegirTipoHabitacion();
        //Thread.sleep(2000);
        //rumboHomePageHotel.aplicarFiltrosHabitacion();
        //Thread.sleep(2000);
        //rumboHomePageHotel.detallesHabitacion();
       // rumboHomePageHotel.valoraciones();

    }


    @Test
    void reservarHotelesQueAdmitenPerrosBH006() throws InterruptedException {
        rumboHomePageHotel = new RumboHomePageHotel(DriverFactory.getDriver());
        rumboHomePageHotel.navegarAlHome();
        rumboHomePageHotel.aceptarCookie();
        rumboHomePageHotel.selectorHotel();
        rumboHomePageHotel.aceptarCookie();
        rumboHomePageHotel.scroll(0,1700);
        rumboHomePageHotel.navegarPerros();
        rumboHomePageHotel.quienReserva("Leonel","Godoy","leonelgodoy@gmail.com","56","987654321");
        rumboHomePageHotel.husped("Jordan","Jimenez");

    }
}