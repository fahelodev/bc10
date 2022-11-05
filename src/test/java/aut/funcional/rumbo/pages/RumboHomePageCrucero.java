package aut.funcional.rumbo.pages;

import framework.engine.selenium.DriverFactory;
import framework.engine.selenium.SeleniumWrapper;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static framework.engine.utils.Constants.BASE_URL_AUT;

public class RumboHomePageCrucero extends SeleniumWrapper {

    public RumboHomePageCrucero(WebDriver driver) {
        super(driver);
    }

    //locators
    By BtnaceptarCookiesLocator = By.xpath("//button[@class='iubenda-cs-accept-btn iubenda-cs-btn-primary']");
    By verMasLocator = By.xpath("//body/div/div[contains(@class,'e19fnmvl0 display-r41hps-HubRow-withBoxModel-withBoxModel e1gf7ux32')]/div[contains(@class,'mobile e1gf7ux30 display-bpt8tl-Container-HubRow eg3h3jz0')]/div[contains(@class,'e5okb9y0 hub-no-gutters display-j4ga9b-Row-styles e1sskiuc0')]/div[contains(@class,'hub-col-md-12 hub-col-12 hub-col display-1k9w8js-Column-styles-Column-styles e1i8mjyc0')]/div[contains(@class,'e19fnmvl0 content-wrapper display-9axkc6-HubColumn-styles-withBoxModel-withBoxModel e1151aq91')]/div[contains(@class,'notranslate e19fnmvl0 display-14wpwcp-HubNavigation-styled-HubNavigation-styled-withBoxModel-withBoxModel e1k86xxr1')]/div[contains(@class,'display-kixg3l-HubNavigation-styled e1k86xxr0')]/div[contains(@class,'display-1dpcy4y-HubNavigationMenu-styled e10w470p3')]/div[contains(@class,'display-1dsq6h9-HubNavigationMenu-styled e10w470p2')]/ul[contains(@class,'display-5ue5gp-HubNavigationMenu-styled e10w470p1')]/li[contains(@class,'display-1eyezhb-HubNavigationMenu-styled-HubNavigationMenu-styled e10w470p0')]/div[1]");
    By crucerosLocator = By.xpath("//div[contains(@class,'display-1dpcy4y-HubNavigationMenu-styled e10w470p3')]//a[contains(@title,'Cruceros')][normalize-space()='Cruceros']");
    By navegarOfertasLocator = By.xpath("//body/div[@class='container container-home']/crs-home-offers/section[@class='crs-offers']/header[@class='crs-offers__header']/div[@class='crs-offers__utils']/crs-btn[@classname='crs-offers-btn-next']/button[@class='crs-btn crs-btn--secondary crs-btn--small crs-btn--outline crs-btn--icon crs-offers-btn-next ng-star-inserted']/span[@class='crs-icon ng-star-inserted']/*[1]//*[name()='svg']");
    By verTodasLasOfertasLocator = By.xpath("//a[@title='Ver todas las ofertas']");
    By buscarLocator = By.xpath("//button[@class='crs-btn crs-btn--cta crs-btn--contain crs-btn--block ng-star-inserted']");
    By destinoCruceroLocator = By.xpath("//div[@class='p-multiselect-label ng-tns-c52-3 p-placeholder']");
    By cualquierDestinoBusquedaLocator = By.xpath("//input[@role='textbox']");
    By cualquierPeriodoLocator = By.xpath("//span[normalize-space()='Cualquier periodo']");

    By cualquierDuracionLocator = By.xpath("//span[@id='pr_id_1_label']");
    By cualquierCompaniaLocator = By.xpath("//div[@class='ng-tns-c52-5 crs_field--cruiseline p-multiselect p-component']");
    By companiaTextBoxLocator = By.xpath("//input[@role='textbox']");
    By cualquierPuertoLocator = By.xpath("//div[@class='ng-tns-c52-6 crs_field--ports p-multiselect p-component']");
    By puertoTextBoxLocator = By.xpath("//input[@role='textbox']");
    By pasajerosLocator = By.xpath("//div[@class='crs-field-dd-occupancy crs_field--occupancy']//div[@class='p-dropdown p-component']");
    By agregarAdultoLocator = By.xpath("(//button[contains(text(),'+')])[1]");
    By agregarJuniorLocator = By.xpath("(//button[contains(text(),'+')])[2]");
    By agregarNinoLocator = By.xpath("(//button[contains(text(),'+')])[3]");
    By agregarBebeLocator = By.xpath("(//button[contains(text(),'+')])[4]");
    By cierrePasajerosLocator = By.xpath("//div[@class='crs-field-dd-occupancy crs_field--occupancy']//div[@class='p-dropdown p-component']");
    By mscCrucerosLocator = By.xpath("//div[@id='merchandise-1-msc-cruceros']//div[@class='text-price']");
    By verMasCruceroMscLocator = By.xpath("//span[@class='btn btn-exp']");
    By crucerosPorElMediterraneoLocator = By.xpath("//a[normalize-space()='cruceros por el Mediterráneo']");
    By crucerosDevolverLocator = By.xpath("//a[normalize-space()='cruceros']");
    By costaCrucerosLocator = By.xpath("//span[@class='date'][normalize-space()='Costa Cruceros']");
    By cruceroPorIslasGriegas = By.xpath("//a[@title='crucero islas griegas ofertas']");
    By reiniciarBusquedaLocator = By.xpath("//span[normalize-space()='Reiniciar búsqueda']");
    By buscarCruceroLocator = By.xpath("//span[normalize-space()='Buscar']");
    By recomendadosLocator = By.xpath("//span[@class='p-dropdown-trigger-icon ng-tns-c43-8 pi pi-chevron-down']");
    By ratingLocator = By.xpath("//li[@aria-label='Rating']");
    By cargarMasResultado = By.xpath("//span[normalize-space()='Cargar más resultados']");
    By volverArribaLocator = By.xpath("//span[normalize-space()='Volver arriba']");
    By selectorMoverLocator = By.xpath("//crs-carousel[@class='crs-card-departure-dates__carousel swiper-initialized swiper-horizontal swiper-pointer-events swiper-free-mode']//div[@class='crs-card-departure-date crs-card-departure-date--active']");
    By descubreElItinirerioLocator = By.xpath("//div[@role='link']//span[@crstextresource='generic.itinerary'][normalize-space()='Itinerario']");
    By dia1 = By.xpath("//button[@aria-label='Expand or collapse itinerary day 1']");
    //By dia2 = By.xpath("");
    By dia3 = By.xpath("//button[@aria-label='Expand or collapse itinerary day 3']");
    By dia4 = By.xpath("//button[@aria-label='Expand or collapse itinerary day 4']");
    By dia5 = By.xpath("//button[@aria-label='Expand or collapse itinerary day 5']");
    //By dia6 = By.xpath("");
    By dia7 = By.xpath("//button[@aria-label='Expand or collapse itinerary day 7']//span[@class='icon icon-arrow_down']");
    By companhiaLocator = By.xpath("//span[normalize-space()='Compañia']");
    By solicitarPresupuesto  = By.xpath("//button[@class='crs-btn crs-btn--cta crs-btn--contain crs-btn--block ng-star-inserted']//span[@class='crs-label ng-star-inserted'][normalize-space()='Solicitar presupuesto']");
    By barraInsertaNombreLocator = By.xpath("//input[@id='firstname_1667603166336']");
    By barraApellidoLocator = By.xpath("//input[@id='lastname_1667603166336']");
    By barraEmailLocator = By.xpath("//input[@id='email_1667603166336']");



    //methods
    public void aceptarCookie() {
        if (isDisplayed(BtnaceptarCookiesLocator) == true) {
            WebElement esperaCookie = findElement(BtnaceptarCookiesLocator);
            WebDriverWait esperar = new WebDriverWait(DriverFactory.getDriver(), Duration.ofSeconds(5));
            esperar.until(ExpectedConditions.elementToBeClickable(esperaCookie));
            click(BtnaceptarCookiesLocator);
        }
    }

    public void seleccionarVerMas() {
        click(verMasLocator);
    }

    public void seleccionarCrucero() {
        click(crucerosLocator);
    }

    public String textoUrlTitulo() {
        return getUrlTitle();
    }

    public void navegarOfertas() {
        for (int i = 0; i < 3; i++) {
            click(navegarOfertasLocator);
        }
    }

    public void verTodasLasOfertas() {
        click(verTodasLasOfertasLocator);
    }

    public void buscarCrucero() {
        click(buscarLocator);
    }

    public void scrollPage(int horizontal, int vertical) {
        scroll(horizontal, vertical);
    }

    public void seleccionarDestinoCrucero(String cruceroDestino) {
        WebElement esperaDestino = findElement(destinoCruceroLocator);
        WebDriverWait esperar = new WebDriverWait(DriverFactory.getDriver(), Duration.ofSeconds(5));
        esperar.until(ExpectedConditions.elementToBeClickable(esperaDestino));
        click(destinoCruceroLocator);
        clear(cualquierDestinoBusquedaLocator);
        write(cruceroDestino, cualquierDestinoBusquedaLocator);
        click(By.xpath("//li[@aria-label='" + cruceroDestino + "']"));
    }

    public void seleccionPeriodo(int anio, String mes) {
        WebElement esperaPeriodo = findElement(cualquierPeriodoLocator);
        WebDriverWait esperar = new WebDriverWait(DriverFactory.getDriver(), Duration.ofSeconds(5));
        esperar.until(ExpectedConditions.elementToBeClickable(esperaPeriodo));
        click(cualquierPeriodoLocator);
        if (anio == 0) {
            click(By.xpath("//span[normalize-space()='Cualquier periodo']"));
        }
        if (anio == 2022) {
            click(By.xpath("//span[normalize-space()='"+mes+"'][2]"));
        }
        if (anio == 2023) {
            click(By.xpath("//button[contains(@class,'p-datepicker-next')]"));
            click(By.xpath("//span[normalize-space()='" + mes + "'][2]"));
        }
    }

    public void cualquierDuracion(String duracionViaje) {
        WebElement esperaDuracion = findElement(cualquierDuracionLocator);
        WebDriverWait esperar = new WebDriverWait(DriverFactory.getDriver(), Duration.ofSeconds(5));
        esperar.until(ExpectedConditions.elementToBeClickable(esperaDuracion));
        click(cualquierDuracionLocator);
        click(By.xpath("//li[@aria-label='" + duracionViaje + "']"));
    }

    public void cualquierCompañia(String nombreCompania) {
        WebElement esperacompania = findElement(cualquierCompaniaLocator);
        WebDriverWait esperar = new WebDriverWait(DriverFactory.getDriver(), Duration.ofSeconds(5));
        esperar.until(ExpectedConditions.elementToBeClickable(esperacompania));
        click(cualquierCompaniaLocator);
        click(companiaTextBoxLocator);
        clear(companiaTextBoxLocator);
        write(nombreCompania, companiaTextBoxLocator);
        click(By.xpath("//li[@aria-label='" + nombreCompania + "']"));

    }

    public void cualquierPuerto(String nombrePuerto) {
        WebElement esperaPuerto = findElement(cualquierPuertoLocator);
        WebDriverWait esperar = new WebDriverWait(DriverFactory.getDriver(), Duration.ofSeconds(5));
        esperar.until(ExpectedConditions.elementToBeClickable(esperaPuerto));
        click(cualquierPuertoLocator);
        click(puertoTextBoxLocator);
        clear(puertoTextBoxLocator);
        write(nombrePuerto, puertoTextBoxLocator);
        esperar.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//li[@aria-label='" + nombrePuerto + "']")));
        click(By.xpath("//li[@aria-label='" + nombrePuerto + "']"));
    }

    public void agregarAdultos(int nAdultos) {
        WebElement esperaPasajero = findElement(pasajerosLocator);
        WebDriverWait esperar = new WebDriverWait(DriverFactory.getDriver(), Duration.ofSeconds(5));
        esperar.until(ExpectedConditions.elementToBeClickable(esperaPasajero));
        if (nAdultos > 1) {
            click(pasajerosLocator);
            for (int i = 0; i < nAdultos; i++) {
                click(agregarAdultoLocator);
            }
        }
        click(cierrePasajerosLocator);
    }

    public void agregarJunior(int nJunior) {
        WebElement esperaPasajero = findElement(pasajerosLocator);
        WebDriverWait esperar = new WebDriverWait(DriverFactory.getDriver(), Duration.ofSeconds(5));
        esperar.until(ExpectedConditions.elementToBeClickable(esperaPasajero));
        if (nJunior > 1) {
            click(pasajerosLocator);
            for (int i = 0; i < nJunior; i++) {
                click(agregarJuniorLocator);
            }
        }
        click(cierrePasajerosLocator);
    }

    public void agregarNinos(int nNinos) {
        WebElement esperaPasajero = findElement(pasajerosLocator);
        WebDriverWait esperar = new WebDriverWait(DriverFactory.getDriver(), Duration.ofSeconds(5));
        esperar.until(ExpectedConditions.elementToBeClickable(esperaPasajero));
        if (nNinos > 1) {
            click(pasajerosLocator);
            for (int i = 0; i < nNinos; i++) {
                click(agregarNinoLocator);
            }
        }
        click(cierrePasajerosLocator);
    }

    public void agregarBebes(int nBebes) {
        WebElement esperaPasajero = findElement(pasajerosLocator);
        WebDriverWait esperar = new WebDriverWait(DriverFactory.getDriver(), Duration.ofSeconds(5));
        esperar.until(ExpectedConditions.elementToBeClickable(esperaPasajero));
        if (nBebes > 1) {
            click(pasajerosLocator);
            for (int i = 0; i < nBebes; i++) {
                click(agregarBebeLocator);
            }
        }
        click(cierrePasajerosLocator);
    }


    public void navegarAlHome() {
        navigateTo(BASE_URL_AUT);
    }

    public void bscCruceros(){

        click(mscCrucerosLocator);
        click(verMasCruceroMscLocator);
        click(crucerosPorElMediterraneoLocator);
        click(crucerosDevolverLocator);

    }
    public void costaCruceros() throws InterruptedException {

        click(costaCrucerosLocator);
        click(verMasCruceroMscLocator);
        Thread.sleep(2000);
        click(cruceroPorIslasGriegas);
        Thread.sleep(4000);
        click(reiniciarBusquedaLocator);
        click(buscarLocator);

    }
    public void filtrarRating() throws InterruptedException {

        click(recomendadosLocator);
        click(ratingLocator);
        Thread.sleep(2000);
        click(cargarMasResultado);
        Thread.sleep(2000);
        click(volverArribaLocator);
        Thread.sleep(2000);
    }

    public void ingresarOpcion(){

        click(selectorMoverLocator);


    }

    public void carnivalHorizon(){


    }
    public void botonesDesplegables(){

        click(dia1);
        click(dia1);
        click(dia3);
        click(dia3);
        click(dia4);
        click(dia4);
        click(dia5);
        click(dia5);
        click(dia7);
        click(dia7);

    }

    public void seleccionarCompanhia(){

        click(companhiaLocator);

    }
    public void seleccionarPresupuesto(){

        click(solicitarPresupuesto);

    }
    public void llenarDatos(){

        click(barraInsertaNombreLocator);
        click(barraApellidoLocator);
        click(barraEmailLocator);

    }



}