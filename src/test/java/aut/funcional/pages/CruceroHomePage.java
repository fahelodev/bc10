package aut.funcional.pages;

import framework.engine.selenium.SeleniumWrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static framework.engine.utils.Constants.BASE_URL_AUT;

public class CruceroHomePage extends SeleniumWrapper {



    //Localizadores
    By btnVerMasLoc = By.xpath("//li[@class = \"display-1eyezhb-HubNavigationMenu-styled-HubNavigationMenu-styled e10w470p0\"]/div");
    //800x600
    By btnDeslisarOpcionesAlInicioLoc = By.xpath("//div[@class = \"nav-offscreen-cta display-808dil-HubNavigationCta-styled ecnhbug3\"]");
    By btnVerMas800x600Loc = By.xpath("(//div[@class=\"display-iu1hq3-MenuLink evvzyi81\"])[26]");
    //Fin

    By btnAceptarCookiesLoc = By.xpath("//button[@class = \"iubenda-cs-accept-btn iubenda-cs-btn-primary\"]");
    By btnCruceroLoc = By.xpath("//a[@title = \"Cruceros\"]");

    By btnCrucero800x600Loc = By.xpath("(//div[@class=\"display-iu1hq3-MenuLink evvzyi81\"])[28]");
    By btnBuscarDestinoLoc = By.xpath("//div[@class = \"p-multiselect-label ng-tns-c52-3 p-placeholder\"]");
    By clickEnDestinoMediterraneoLoc = By.xpath("//p-multiselectitem[1]");
    By clickEnFechaLoc = By.xpath("(//span[@class = \"p-dropdown-label p-inputtext ng-star-inserted\"])[1]");
    By clickEnFechaDicLoc = By.xpath("(//span[normalize-space() = \"dic\"])[2]");
    By CickEnSeleccionarPasajeroLoc = By.xpath("(//span[@class = \"p-dropdown-label p-inputtext ng-star-inserted\"])[2]");
    By clikEnsSumarJuniorLoc = By.xpath("(//button[@class = \"crs-number-select__btn\"])[4]");
    By clikEnsSumarNinioLoc = By.xpath("(//button[@class = \"crs-number-select__btn\"])[6]");
    By clikEnsSumarBebeLoc = By.xpath("(//button[@class = \"crs-number-select__btn\"])[8]");
    By btnBuscarEnFormularioLoc = By.xpath("//button[@class = \"crs-btn crs-btn--cta crs-btn--contain crs-btn--block ng-star-inserted\"]");
    By textoACompararDespuesDelFormLoc = By.xpath("//header[@class = \"crs_search_box__header ng-star-inserted\"]/h1");
    By clickEnDescubreOfertaLoc = By.xpath("(//a[@class = \"more\"])[1]");
    By clickEnDetalleDeCruceroLoc = By.xpath("(//button[@class = \"crs-btn crs-btn--cta crs-btn--small crs-btn--contain\"])[1]");
    By clikEnDetalleDeCruceroDelFormLoc = By.xpath("(//button[@class = \"crs-btn crs-btn--cta crs-btn--small crs-btn--contain ng-star-inserted\"])[1]");
    By btnSolicitarProsupuestoLoc = By.xpath("//button[@class = \"crs-btn crs-btn--cta crs-btn--contain crs-btn--block ng-star-inserted\"]");
    By campoNombreLoc = By.xpath("//input[@placeholder=\"Inserta tu nombre\"]");
    By campoApellidoLoc = By.xpath("//input[@placeholder=\"Inserta tu apellido\"]");
    By campoTelefonoLoc = By.xpath("//input[@placeholder=\"Inserta tu número de teléfono\"]");
    By aceptarPoliticaDePrivacidad = By.xpath("(//span[@class = \"check\"])[3]");
    By btnAceptarFormLoc = By.xpath("//button[@class = \"btn btn-cta btn-lg btn-block\"]");
    By textErrorAcompararLoc = By.xpath("(//span[normalize-space() = \"Campo obligatorio\"])[4]");
    By precioDeDescubreLoc = By.xpath("//h2/b");
    By btnDescubreLoc = By.xpath("//a[@class = \"btn btn-cta crs_landing_preview__cta\"]");
    By precioACompararDeDescubreLoc = By.xpath("//header[@class = \"crs-pd-estimate__header\"]//span[@class = \"crs-price__value\"]");
    By clickEnElegirOpcionesDeOrdenarLoc = By.xpath("//div[@class = \"p-dropdown-trigger ng-tns-c43-9\"]");
    By elegirPrecioMasBajoPrimeroLoc = By.xpath("//li[@aria-label = \"Precio (más bajo primero)\"]");
    By textoAcompararParaPrecioMasBajoPrimeroLoc = By.xpath("//span[@id = \"pr_id_2_label\"]");
    // Para vereficar el comportamiento de las opciones
    By clickOpcion1Loc = By.xpath("(//nav[@class = \"swiper-wrapper crs-pd-nav\"]/div)[1]");
    By clickOpcion2Loc = By.xpath("(//nav[@class = \"swiper-wrapper crs-pd-nav\"]/div)[2]");
    By clickOpcion3Loc = By.xpath("(//nav[@class = \"swiper-wrapper crs-pd-nav\"]/div)[3]");
    By clickOpcion4Loc = By.xpath("(//nav[@class = \"swiper-wrapper crs-pd-nav\"]/div)[4]");
    By clickOpcion5Loc = By.xpath("(//nav[@class = \"swiper-wrapper crs-pd-nav\"]/div)[5]");
    By verifecarMovimientoDeOpcion5Loc = By.xpath("//div[@class = \"swiper-slide crs-pd-nav__item crs-pd-nav__item--active\"]");

    public CruceroHomePage(WebDriver driver) {
        super(driver);
    }

    //Test1
    public void hacerPrimerFormYBsucar(){
        click(btnAceptarCookiesLoc);
        click(btnVerMasLoc);
        click(btnCruceroLoc);
        click(btnBuscarDestinoLoc);
        click(clickEnDestinoMediterraneoLoc);
        click(clickEnFechaLoc);
        click(clickEnFechaDicLoc);
        click(CickEnSeleccionarPasajeroLoc);
        click(clikEnsSumarJuniorLoc);
        click(clikEnsSumarNinioLoc);
        click(clikEnsSumarBebeLoc);
        click(btnBuscarEnFormularioLoc);

    }

    public String textoACompararDespuesDelForm(){
        return getText(textoACompararDespuesDelFormLoc);
    }
    //Fin Test1

    //Test3
    public void llegarAlUltimoFormYSemicompletar(){
        click(btnAceptarCookiesLoc);
        click(btnVerMasLoc);
        click(btnCruceroLoc);
        click(clickEnDescubreOfertaLoc);
        click(clickEnDetalleDeCruceroLoc);
        cambiarPag();
        waitElemtToBeClickable(15,btnSolicitarProsupuestoLoc);
        click(btnSolicitarProsupuestoLoc);
        waitElemtToBeClickable(15,campoNombreLoc);
        click(campoNombreLoc);
        write("ka",campoNombreLoc);
        write("Ki",campoApellidoLoc);
        write("111111",campoTelefonoLoc);
        click(aceptarPoliticaDePrivacidad);
        click(btnAceptarFormLoc);
    }

    public String textoACompararDelFormIncompleto(){
        return getText(textErrorAcompararLoc);
    }
    //Fin Test3

    //Test2
    public void recorridoDeOpcionesDeCrucero(){
        click(btnAceptarCookiesLoc);
        click(btnVerMasLoc);
        click(btnCruceroLoc);
        click(clickEnDescubreOfertaLoc);
        click(clickEnDetalleDeCruceroLoc);
        cambiarPag();
        click(clickOpcion2Loc);
        click(clickOpcion3Loc);
        click(clickOpcion4Loc);
        click(clickOpcion5Loc);
    }



    //Test4
    public void recorridoDeOpcionesDeCrucero800x600() {
        setSize(800,600);
        click(btnAceptarCookiesLoc);
        click(btnDeslisarOpcionesAlInicioLoc);
        click(btnVerMas800x600Loc);
        click(btnCrucero800x600Loc);
        click(clickEnDescubreOfertaLoc);
        waitElemtToBeClickable(20,clickEnDetalleDeCruceroLoc);
        click(clickEnDetalleDeCruceroLoc);
        cambiarPag();
        scroll(0,1200);
        click(clickOpcion2Loc);
        click(clickOpcion3Loc);
        click(clickOpcion4Loc);
        click(clickOpcion5Loc);
    }
    public Boolean elementoEncontradoAldarLaOpcion(){
        return isDisplayed(verifecarMovimientoDeOpcion5Loc);
    }
    //Fin test 2 y 4

    //Test5
    public void llegarHastaElBtnDescubre(){
        click(btnAceptarCookiesLoc);
        click(btnVerMasLoc);
        click(btnCruceroLoc);
        click(clickEnDescubreOfertaLoc);
    }
    public String textoDelDescubreACompara(){
        return getText(precioDeDescubreLoc);
    }
    public void clikEnDescubre(){
        click(btnDescubreLoc);
        cambiarPag();
    }

    public String textoDelPrecioDelCrucero(){
        return getText(precioACompararDeDescubreLoc);
    }
    //Fin Test5

    //Test6
    public void filtrarPrecioMasBajoPrimero(){
        click(clickEnElegirOpcionesDeOrdenarLoc);
        click(elegirPrecioMasBajoPrimeroLoc);
    }

    public String textoDePrecioMasBajoPrimero(){
        return getText(textoAcompararParaPrecioMasBajoPrimeroLoc);
    }
    //Fin Test6

    public void navegarAlHome(){
        navigateTo(BASE_URL_AUT);
    }


}
