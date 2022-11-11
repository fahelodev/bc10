package aut.funcional.testcases;

import aut.funcional.pages.HotelesHomePage;
import framework.engine.selenium.DriverFactory;
import framework.engine.selenium.SeleniumTestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;

public class TestHoteles extends SeleniumTestBase {
    HotelesHomePage hotelesHomePage;



    @Test
    public void DisponibilidadDeHoteles(){
        hotelesHomePage = new HotelesHomePage(DriverFactory.getDriver());
        hotelesHomePage.navegarAlHome();
        hotelesHomePage.aceptarCoockies();
        hotelesHomePage.HotelesDisponibles();
        Assertions.assertEquals("Alojamientos para cualquier destino",hotelesHomePage.mensajeAlojamientosParaCualquierDestino());
    }

    @Test
    public void ComprobarFaltaDeTextoDelFormulario(){
        hotelesHomePage = new HotelesHomePage(DriverFactory.getDriver());
        hotelesHomePage.navegarAlHome();
        hotelesHomePage.aceptarCoockies();
        hotelesHomePage.FaltaTexto();
        Assertions.assertEquals("Introduce, por ejemplo, una ciudad, una isla, una región...",hotelesHomePage.mensajeError());

    }

    @Test
    public void RealizarBusquedaConVariosFiltros() throws InterruptedException, IOException {
        hotelesHomePage = new HotelesHomePage(DriverFactory.getDriver());
        hotelesHomePage.navegarAlHome();
        hotelesHomePage.aceptarCoockies();
        hotelesHomePage.HotelesDisponibles();
        hotelesHomePage.VariosFiltros();
        Thread.sleep(5000);
        hotelesHomePage.capturaPantalla();
    }
    @Test
    public void VisualizarFormularioDeReservaDeCombo() throws InterruptedException {
        hotelesHomePage = new HotelesHomePage(DriverFactory.getDriver());
        hotelesHomePage.navegarAlHome();
        hotelesHomePage.aceptarCoockies();
        hotelesHomePage.FormularioCombo();
        Assertions.assertEquals("Diseña tu viaje añadiendo los servicios que necesites",hotelesHomePage.mensajeValidacionAForm());
    }
    @Test
    public void RecorrerPaginaDeHotel(){
        hotelesHomePage = new HotelesHomePage(DriverFactory.getDriver());
        hotelesHomePage.navegarAlHome();
        hotelesHomePage.aceptarCoockies();
        hotelesHomePage.RecorrerPagina();
        Assertions.assertEquals("Pago fraccionado",hotelesHomePage.mensajeRecorrePag());
    }
    @Test
    public void ConsultaInformacionLlamando(){
        hotelesHomePage = new HotelesHomePage(DriverFactory.getDriver());
        hotelesHomePage.navegarAlHome();
        hotelesHomePage.aceptarCoockies();
        hotelesHomePage.Llamanos();
        Assertions.assertEquals("Nos encontrarás de lunes a viernes, de 9:00 h a 20:00 h y los sábados y domingos de 10:00 h a 19:00 h.",hotelesHomePage.mensajeParaValidarLlamanos());
    }
}
