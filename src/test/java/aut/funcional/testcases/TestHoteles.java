package aut.funcional.testcases;

import aut.funcional.pages.HotelesHomePage;
import framework.engine.selenium.DriverFactory;
import framework.engine.selenium.SeleniumTestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestHoteles extends SeleniumTestBase {
    HotelesHomePage hotelesHomePage;



    @Test
    public void DisponibilidadDeHoteles(){
        hotelesHomePage = new HotelesHomePage(DriverFactory.getDriver());
        hotelesHomePage.navegarAlHome();
        hotelesHomePage.aceptarCoockies();
        hotelesHomePage.HotelesDisponibles();
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
    public void RealizarBusquedaConVariosFiltros(){
        hotelesHomePage = new HotelesHomePage(DriverFactory.getDriver());
        hotelesHomePage.navegarAlHome();
        hotelesHomePage.aceptarCoockies();
        hotelesHomePage.HotelesDisponibles();
        hotelesHomePage.VariosFiltros();
    }
    @Test
    public void VisualizarFormularioDeReservaDeCombo() throws InterruptedException {
        hotelesHomePage = new HotelesHomePage(DriverFactory.getDriver());
        hotelesHomePage.navegarAlHome();
        hotelesHomePage.aceptarCoockies();
        hotelesHomePage.FormularioCombo();

    }
    @Test
    public void RecorrerPaginaDeHotel(){
        hotelesHomePage = new HotelesHomePage(DriverFactory.getDriver());
        hotelesHomePage.navegarAlHome();
        hotelesHomePage.aceptarCoockies();
        hotelesHomePage.RecorrerPagina();
    }
    @Test
    public void ConsultaInformacionLlamando(){
        hotelesHomePage = new HotelesHomePage(DriverFactory.getDriver());
        hotelesHomePage.navegarAlHome();
        hotelesHomePage.aceptarCoockies();
        hotelesHomePage.Llamanos();
    }
}
