package aut.funcional.pages;

import framework.engine.selenium.SeleniumWrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import static framework.engine.utils.Constants.BASE_URL_AUT;

public class VuelosHomePage extends SeleniumWrapper {
    //Localizadores
    By btnRechazarCookies = By.xpath("//button[@class = 'iubenda-cs-accept-btn iubenda-cs-btn-primary']");
    By btnVuelos = By.xpath("//a[@class='evvzyi82 display-1xmtdkn-HubAnchor-styles-MenuLink e89md6u0']");
    By btnSoloIda = By.xpath("//div[@class='display-xi36x7-ToggleGroup-ToggleGroup']");
    By tbOrigen = By.xpath("(//input[@placeholder='Ciudad o aeropuerto'])[1]");
    By tbDestino= By.xpath("(//input[@placeholder='Ciudad o aeropuerto'])[2]");
    By btnBarcelona= By.xpath("//li[@data-option-index='0']");
    By btnMadrid = By.xpath("//span[@class='display-1okygcz-Autocompleter-styled']");
    By btnCalentario = By.xpath("//button[@class='display-19sl708-DateInput-styled-DateInput-styled']");
    By btnDesplazarCalendario = By.xpath("//button[@aria-label='Next month']");
    By btnMes= By.xpath("//button[@class='display-silvgf-Day-styled-Day-styled-Day-styled-Day-styled']");
    By btnBuscar= By.xpath("//button[@class='display-joffoz-Button']");
    By btnPrecioNormal= By.xpath("(//div[@class='FullTripCard__AvailablePricesContainer-sc-z8znd4-6 ciYfDV'])[1]");
    By btnElegirClassic = By.xpath("//button[@class='Button-sc-1bbve8d-0 jlNCZl']");
    By tiTitulo= By.xpath("//div[@class='welcome__claim-title']");
    By tbNombre= By.xpath("//input[@name='name']");
    By tbApellido= By.xpath("//input[@name='surname']");
    By tbEmail= By.xpath("//input[@id='contact-email']");
    By tbTelefonoCar= By.xpath("//div[@title='Argentina: +54']");
    By tbTelefono = By.xpath("//input[@data-test='input-phone']");
    By tbDireccionPostal = By.xpath("//input[@name='address']");
    By tbCalle = By.xpath("//input[@name='houseNumber']");
    By tbCodigoPostal = By.xpath("//input[@name='postCode']");
    By tbCiudad = By.xpath("//input[@name='city']");
    By liPais = By.xpath("//div[@class='selected-flag']");
    By btnArg = By.xpath("//div[@class='flag ar']");
    By rbSr = By.xpath("//label[@id='radio-groups.1.travellers.1.title-MALE-label']");
    By tbQRNombre = By.xpath("//input[@data-test='input-name']");
    By tbQRApellido = By.xpath("//input[@name='groups.1.travellers.1.surname']");
    By tbQRDiaCumple = By.xpath("//input[@data-test='input-groups.1.travellers.1.dateOfBirth-day']");
    By liQRMesCumple = By.xpath("//option[@class='select-placeholder']");
    By btnNov = By.xpath("//option[@value='11']");
    By tbQRAnioCumple = By.xpath("//input[@placeholder='AAAA']");
    By liTipoDocumento= By.xpath("//div[@class=' css-13wifi2']");
    By liPasaporte = By.xpath("//option[@value='PA']");

    By tbDNI=By.xpath("//input[@name='groups.1.travellers.1.documentNumber']");
    By btnSig = By.xpath("//button[@class='btn btn-cta lead-generation-submit__btn ']");
    By laIngreseEmail = By.xpath("(//label[@class='form-elements-2__error-label  '])[3]");
    By laMasBarato = By.xpath("(//div[@class='sorting-tabs-view__label'][normalize-space()='Más barato'])[2]");
    By liPrimerElemento = By.xpath("(//span[@class='TripCardPrice__FinalPrice-sc-1d8mdrx-5 rCnqw Tooltip___StyledMuiTooltip-sc-ya8k7d-3 jAgUJM'])[1]");
    By btnVuelosMasBuscados = By.xpath("//a[@href='https://www.rumbo.es/es/vuelos/top-destinos.html']");
    By tiVuelosBaratos = By.xpath("//h2[normalize-space()='Vuelos baratos a las localidades más solicitadas']");
    By btnFecha = By.xpath("//button[@class='display-silvgf-Day-styled-Day-styled-Day-styled-Day-styled']");
    By btnNinguno = By.xpath("//span[@class='checkboxlist-filter-view__desc desc'][normalize-space()='Ninguna']");
    By btnEmpresa = By.xpath("//span[@class='desc--title'][normalize-space()='Air Europa']");
    By rbNoNecesito = By.xpath("//div[@class='css-853par']");
    By btnSiguiente = By.xpath("//button[@class='btn btn-cta lead-generation-submit__btn ']");
    By btnTarifaSinDescuento = By.xpath("//span[@class='sc-jhLFZp bRQiXF']");
    By btnNoGracias = By.xpath("//div[@class='insurance__noThanks-expandable-container']");

    By btnBUscarVuelo= By.xpath("(//button[normalize-space()='Buscar'] )[1]");

    public VuelosHomePage(WebDriver driver) {
        super(driver);
        driver.manage().window().maximize();
    }

    public void navegarAlHome(){
        navigateTo(BASE_URL_AUT);

        click(btnRechazarCookies);
        click(btnVuelos);
        click(btnVuelosMasBuscados);
        cambiarPag();

    }

    public void NavegarAHomeYCampos() throws InterruptedException {
        navigateTo(BASE_URL_AUT);
        click(btnRechazarCookies);
        click(btnVuelos);
        click(btnSoloIda);
        click(tbOrigen);
        write("barc",tbOrigen);
        click(btnBarcelona);
        click(tbDestino);
        write("madr",tbDestino);
        click(btnMadrid);
        click(btnBUscarVuelo);
        cambiarPag();
        click(btnPrecioNormal);
        Thread.sleep(7000);

    }

    public void LlegarAFormulario() throws InterruptedException {
        navigateTo(BASE_URL_AUT);
        click(btnRechazarCookies);
        click(btnVuelos);
        Thread.sleep(10000);
        click(btnSoloIda);
        click(tbOrigen);
        write("barc",tbOrigen);
        Thread.sleep(3000);
        click(btnBarcelona);
        click(tbDestino);
        write("madr",tbDestino);
        Thread.sleep(3000);
        click(btnMadrid);
        click(btnBUscarVuelo);
        Thread.sleep(20000);
        click(btnPrecioNormal);
        click(tbNombre);
        write("Pehuen",tbNombre);
        write("Dias",tbApellido);
        write("fffasd@gmail.com",tbEmail);
        write("4567183",tbTelefono);
        write("5400",tbDireccionPostal);
        write("123",tbCalle);
        write("3455",tbCodigoPostal);
        write("La Rioja",tbCiudad);
        click(rbSr);
        write("23",tbQRDiaCumple);
        click(liQRMesCumple);
        click(btnNov);
        write("1996",tbQRAnioCumple);
        click(liTipoDocumento);
        click(liPasaporte);
        write("341513452",tbDNI);
        click(btnNoGracias);
        click(btnSig);


    }



    public String TituloTest5(){
        return getText(tiVuelosBaratos);
    }

    public String TituloTest1(){
        return getText(tiTitulo);
    }


}
