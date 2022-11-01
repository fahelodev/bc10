package aut.funcional.pages;

import framework.engine.selenium.SeleniumWrapper;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import static framework.engine.utils.Constants.BASE_URL_AUT;

public class HotelesHomePage extends SeleniumWrapper {

    By botonHotelesEnNavbarLoc = By.xpath("(//a[@class=\"evvzyi82 display-1xmtdkn-HubAnchor-styles-MenuLink e89md6u0\"])[2]");

    By clickearParaAbrirDesplegableElegirDestinoHOTELESLoc = By.xpath("//input[@placeholder=\"¿Adónde quieres ir?\"]");
    By clickearDestinoElegidoHOTELESLoc = By.xpath("//li[@id=\"mui-1-option-0\"]");
    By desplegableFechaEntradaHOTELES = By.xpath(" (//button[@class=\"display-q24bix-DateInput-styled\"])[1]");
    By clickearDiaDeFechaEntradaHOTELES = By.xpath("(//div[@aria-labelledby=\"11\"]//button[@class=\"display-s2qfcl-Day-styled-Day-styled-Day-styled\"])[1]");
    By desplegableFechaSalidaHOTELES = By.xpath(" (//button[@class=\"display-q24bix-DateInput-styled\"])[2]");
    By clickearDiaDeFechaSalidaHOTELES = By.xpath("(//div[@aria-labelledby=\"11\"]//button[@class=\"display-s2qfcl-Day-styled-Day-styled-Day-styled\"])[31]");
    By desplegableDePasajerosHOTELES = By.xpath("//span[@class=\"display-19d528r-Dropdown-styled-textOverflowEllipsis-Dropdown-styled\"]");

    By clickearBotonBuscarHOTELES = By.xpath("(//button[@class=\"display-joffoz-Button\"])[1]");

    By clickearBotonBuscarHotelesVUELOS = By.xpath("(//button[@class=\"display-joffoz-Button\" and @type=\"submit\"])[2]");


    By botonParaFiltrosCancelacionGratuita = By.xpath("(//div[@class=\"styled__Text-sc-ncpwe6-1 dKelni\"])[1]");
    By botonParaFiltrosWifiGratis = By.xpath("(//div[@class=\"styled__Text-sc-ncpwe6-1 dKelni\"])[2]");
    By desplegableParaFiltrosEstrellas = By.xpath(" //span[normalize-space()=\"Estrellas\"]");
    By checkboxParaSeleccionar5Estrellas = By.xpath("(//div[@class='sc-jIZahH jGWyuJ'])[1]");
    By botonAplicarPara5Estrellas = By.xpath("//button[normalize-space()=\"Aplicar\"]");

    By botonVueloHotel = By.xpath("(//button[@class=\"display-1fkqqxl-TabButton\"])[2]");
    By inputBuscarOrigenHotelesVUELOS = By.xpath("//input[@id=\"mui-2\"]");
    By desplegableDestinoHotelesVUELOS = By.xpath("(//input[@placeholder=\"¿Adónde quieres ir?\"])[2]");
    By clickearUnaOpcionDeDestinoHotelesVUELOS = By.xpath("//div[@class=\"display-wpcrn3-Autocompleter-styled\"]");
    By clickearParaAbrirDesplegableFechaEntradaHotelesVUELOS = By.xpath("(//button[@class=\"display-q24bix-DateInput-styled\"])[3]");
    By clickearParaAbrirDesplegableFechaSalidaHotelesVUELOS = By.xpath("(//button[@class=\"display-q24bix-DateInput-styled\"])[4]");
    By desplegableDePasajerosHotelesVUELOS = By.xpath("(//button[@class=\"display-vu9q0w-Dropdown-styled\"])[2]");
    By clickearParaRestarPasajerosHotelesVUELOS = By.xpath("//button[@class=\"display-17x5pjv-Counter-styled\"][1]");

    By desplegableParaElegirClaseHotelesVUELOS = By.xpath("(//button[@class=\"display-vu9q0w-Dropdown-styled\"])[3]");
    By clickearParaElegirOpcionTuristaEnClaseHotelesVUELOS = By.xpath("(//div[@class=\"display-1q5nlab-Radio-styled\"])[2]");
    By clickearLaPrimeraOpcionDeHotelesVUELOS = By.xpath("(//div[@class=\"sc-jIAOiI dgepDH\"]//a)");
    By clickearLaPrimeraOpcionDeHotelesVUELOSOtraVez = By.xpath("//a[@class=\"sc-idiyUo hAMAFs\"]");
    By clickearEnBotonContinuarAbajoEnOpcionDeElegir = By.xpath("(//div[@class=\"RoomPanelMealPlan___StyledDiv2-sc-u6tmcf-18 bUeODJ\"])[1]");
    By clickearEnEligeTRAVELExtra = By.xpath("//button[@class=\"Button-sc-1bbve8d-0 hFahzb\"]");


    By clickearUnaAppParTodoHOTELES = By.xpath("(//a[@class=\"e1sg15nx0 display-56ziaz-HubAnchor-styles-HubGroup e89md6u0\"])[1]");

    By clickearOfertasMiniprecioHOTELES = By.xpath("(//a[@class=\"e1sg15nx0 display-56ziaz-HubAnchor-styles-HubGroup e89md6u0\"])[2]");
    By clickearPagoFraccionadoHOTELES = By.xpath("(//a[@class=\"e1sg15nx0 display-56ziaz-HubAnchor-styles-HubGroup e89md6u0\"])[3]");
    By clickearEchaleUnVistazoHOTELES = By.xpath("(//a[@class=\"e1f10jx50 display-1d0nha6-HubAnchor-styles-HubButton-styles e89md6u0\"])[1]");

    By clickearEnOfertaVacacionesPorEspaniaHOTELES = By.xpath("(//div[@class=\"display-1aslju6-HubFeatureCard-styled e1apqt34\"])[2]");
    By clickearLaOpcionLlamanos1 = By.xpath("(//a[@class=\"e1sg15nx0 display-nezr33-HubAnchor-styles-HubGroup e89md6u0\"])[1]");
    By clickearLaOpcionLlamanos2 = By.xpath("//a[normalize-space()='¡Llámanos!']");

    By btnAceptarCookiesLoc = By.xpath("//button[@class = \"iubenda-cs-accept-btn iubenda-cs-btn-primary\"]");

    By mensajeDondeFaltaTexto = By.xpath("//span[@class=\"display-1jbu58d-ValidationMessage-styled-ValidationMessage-styled-ValidationMessage-styled\"]");

    By mensajeAlojamientoParaCualquierDestino = By.xpath("//div[@class=\"sc-gsnTZi cxinWN openx-ui-main-title\"]");

    By mensajeParaValidarQueLlegoAlFormulario = By.xpath("//div[@class=\"welcome__claim-title\"]");

    By mensajeParaValidadQueSeRecorrioLaPag = By.xpath("//h2[normalize-space()='Pago fraccionado']");

    By mensajeParaValidarQueEstamosEnLLAMANOS = By.xpath("//span[normalize-space()='Nos encontrarás de lunes a viernes, de 9:00 h a 20:00 h y los sábados y domingos de 10:00 h a 19:00 h.']");

    public HotelesHomePage(WebDriver driver) {
        super(driver);
    }
    public void navegarAlHome(){
        navigateTo(BASE_URL_AUT);
    }
    public void aceptarCoockies(){
        click(btnAceptarCookiesLoc);
    }

    public String mensajeError(){
        return getText(mensajeDondeFaltaTexto);
    }

    public String mensajeAlojamientosParaCualquierDestino(){
        return getText(mensajeAlojamientoParaCualquierDestino);
    }

    public String mensajeValidacionAForm(){
        return getText(mensajeParaValidarQueLlegoAlFormulario);
    }

    public String mensajeRecorrePag() {
        return getText(mensajeParaValidadQueSeRecorrioLaPag);
    }

    public String mensajeParaValidarLlamanos(){
        return getText(mensajeParaValidarQueEstamosEnLLAMANOS);
    }
    public void capturaPantalla() throws IOException {
        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile,new File("C:\\Users\\florencia.lorenzati\\IdeaProjects\\bc101\\src\\test\\java\\aut\\funcional\\testcases\\capturas","VariosFiltros.png"));
    }

    public void HotelesDisponibles(){
        click(botonHotelesEnNavbarLoc);
        click(clickearParaAbrirDesplegableElegirDestinoHOTELESLoc);
        click(clickearDestinoElegidoHOTELESLoc);
        click(desplegableDePasajerosHOTELES);
        click(clickearParaRestarPasajerosHotelesVUELOS);
        click(desplegableDePasajerosHOTELES);
        click(clickearBotonBuscarHOTELES);
    }

    public void FaltaTexto(){
        click(botonHotelesEnNavbarLoc);
        click(desplegableDePasajerosHOTELES);
        click(clickearParaRestarPasajerosHotelesVUELOS);
        click(desplegableDePasajerosHOTELES);
        click(clickearBotonBuscarHOTELES);
    }

    public void VariosFiltros() {
        click(botonParaFiltrosCancelacionGratuita);
        click(botonParaFiltrosWifiGratis);
        click(desplegableParaFiltrosEstrellas);
        click(checkboxParaSeleccionar5Estrellas);
        click(botonAplicarPara5Estrellas);
    }

    public void FormularioCombo() throws InterruptedException {
        click(botonHotelesEnNavbarLoc);
        click(botonVueloHotel);
        click(desplegableDestinoHotelesVUELOS);
        click(clickearUnaOpcionDeDestinoHotelesVUELOS);
        click(desplegableDePasajerosHotelesVUELOS);
        click(clickearParaRestarPasajerosHotelesVUELOS);
        click(clickearBotonBuscarHotelesVUELOS);
        click(clickearLaPrimeraOpcionDeHotelesVUELOS);
        waitElemtToBeClickable(10,clickearLaPrimeraOpcionDeHotelesVUELOSOtraVez);
        click(clickearLaPrimeraOpcionDeHotelesVUELOSOtraVez);
        cambiarPag();
        waitElemtToBeClickable(10,clickearEnBotonContinuarAbajoEnOpcionDeElegir);
        click(clickearEnBotonContinuarAbajoEnOpcionDeElegir);
        waitElemtToBeClickable(10,clickearEnEligeTRAVELExtra);
        click(clickearEnEligeTRAVELExtra);
    }

    public void RecorrerPagina(){
        click(botonHotelesEnNavbarLoc);
        click(clickearUnaAppParTodoHOTELES);
        driver.navigate().back();
        click(clickearOfertasMiniprecioHOTELES);
        driver.navigate().back();
        click(clickearPagoFraccionadoHOTELES);
    }

    public void Llamanos(){
        click(botonHotelesEnNavbarLoc);
        click(clickearEnOfertaVacacionesPorEspaniaHOTELES);
        cambiarPag();
        waitElemtToBeClickable(5,clickearLaOpcionLlamanos1);
        click(clickearLaOpcionLlamanos1);
        cambiarPag();
        waitElemtToBeClickable(5,clickearLaOpcionLlamanos2);
        click(clickearLaOpcionLlamanos2);
    }
}
