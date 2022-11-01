package aut.funcional.pages;

import framework.engine.selenium.SeleniumWrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import static framework.engine.utils.Constants.BASE_URL_AUT;

public class CruceroHomePage extends SeleniumWrapper {

    public CruceroHomePage(WebDriver driver) {
        super(driver);
    }

    //Localizadores
    By btnVerMasLoc = By.xpath("//li[@class = \"display-1eyezhb-HubNavigationMenu-styled-HubNavigationMenu-styled e10w470p0\"]/div");
    //800x600
    By btnDeslisarOpcionesAlInicioLoc = By.xpath("//div[@class = \"nav-offscreen-cta display-808dil-HubNavigationCta-styled ecnhbug3\"]");
    By btnVerMas800x600Loc = By.xpath("(//a[@title=\"Ver más\"])[2]");
    //Fin

    By btnAceptarCookiesLoc = By.xpath("//button[@class = \"iubenda-cs-accept-btn iubenda-cs-btn-primary\"]");
    By btnCruceroLoc = By.xpath("//a[@title = \"Cruceros\"]");
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
    By campoNombreLoc = By.xpath("(//input[@class = \"form-control ng-untouched ng-pristine ng-valid\"])[1]");
    By campoApellidoLoc = By.xpath("(//input[@class = \"form-control ng-untouched ng-pristine ng-valid\"])[2]");
    By campoTelefonoLoc = By.xpath("//input[@class = \"form-control ng-star-inserted\"]");
    By aceptarPoliticaDePrivacidad = By.xpath("(//span[@class = \"check\"])[3]");
    By btnAceptarFormLoc = By.xpath("//button[@class = \"btn btn-cta btn-lg btn-block\"]");
    By textErrorAcomparar = By.xpath("(//span[normalize-space() = \"Campo obligatorio\"])[4]");
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

    public void llegarAlUltimoFormYSemicompletar() throws InterruptedException {
        click(btnAceptarCookiesLoc);
        click(btnVerMasLoc);
        click(btnCruceroLoc);
        click(clickEnDescubreOfertaLoc);
        click(clickEnDetalleDeCruceroLoc);
        cambiarPag();
        click(btnSolicitarProsupuestoLoc);
        Thread.sleep(500);
        write("ka",campoNombreLoc);
        write("Ki",campoApellidoLoc);
        write("111111",campoTelefonoLoc);
        click(aceptarPoliticaDePrivacidad);
        click(btnAceptarFormLoc);


    }
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




    public void recorridoDeOpcionesDeCrucero800x600(){
        //setSize(800,600);
        click(btnAceptarCookiesLoc);
        click(btnDeslisarOpcionesAlInicioLoc);
        click(btnVerMas800x600Loc);
        click(btnCruceroLoc);
        click(clickEnDescubreOfertaLoc);
        click(clickEnDetalleDeCruceroLoc);
        cambiarPag();
        click(clickOpcion2Loc);
        click(clickOpcion3Loc);
        click(clickOpcion4Loc);
        click(clickOpcion5Loc);
    }
    public Boolean elementoEncontradoAldarLaOpcion(){
        return isDisplayed(verifecarMovimientoDeOpcion5Loc);
    }

    public void navegarAlHome(){
        navigateTo(BASE_URL_AUT);
    }


}
