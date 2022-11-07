package aut.funcional.pages;

import framework.engine.selenium.SeleniumWrapper;
import org.openqa.selenium.*;


import java.io.IOException;

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
    By btnPrecioNormal= By.xpath("(//div[normalize-space()='Precio normal'])[1]");
    By btnPrecioNormal1= By.xpath("(//div[normalize-space()='Precio normal'])[2]");
    By btnElegirClassic = By.xpath("//button[@class='Button-sc-1bbve8d-0 jlNCZl']");
    By tiTitulo= By.xpath("//div[@class='welcome__claim-title']");
    By tbNombre= By.xpath("//input[@name='name']");
    By tbApellido= By.xpath("//input[@name='surname']");
    By tbEmail= By.xpath("//input[@id='contact-email']");
    By tbTelefono = By.xpath("//input[@data-test='input-phone']");

    By rbSr = By.xpath("//label[@id='radio-groups.1.travellers.1.title-MALE-label']");
    By tbQRDiaCumple = By.xpath("//input[@data-test='input-groups.1.travellers.1.dateOfBirth-day']");
    By liQRMesCumple = By.xpath("//option[@class='select-placeholder']");
    By btnNov = By.xpath("//option[@value='11']");
    By tbQRAnioCumple = By.xpath("//input[@placeholder='AAAA']");
//    By liTipoDocumento= By.xpath("//input[@aria-label='groups.1.travellers.1.documentType']");
    By laErrorEmail= By.xpath("//label[normalize-space()='Introduce un email válido']");
//    By tbDNI=By.xpath("//input[@name='groups.1.travellers.1.documentNumber']");
    By btnSig = By.xpath("//button[@class='btn btn-cta lead-generation-submit__btn ']");
    By laMasBarato = By.xpath("(//div[@class='sorting-tabs-view__amount'])[5]");
    //By liPrimerElemento = By.xpath("(//span[@color='var(--lmn-ds-colors-primary-400)'])[1]");

    By btnVuelosMasBuscados = By.xpath("//a[@href='https://www.rumbo.es/es/vuelos/top-destinos.html']");
    By tiVuelosBaratos = By.xpath("//h2[normalize-space()='Vuelos baratos a las localidades más solicitadas']");
   By btnNinguno = By.xpath("//span[@class='checkboxlist-filter-view__desc desc'][normalize-space()='Ninguna']");
    By btnEmpresa = By.xpath("//span[@class='desc--title'][normalize-space()='Air Europa']");
    By rbNoNecesito = By.xpath("(//span[@class='check'])[5]");
    By btnTarifaSinDescuento = By.xpath("//span[normalize-space()='Tarifa sin descuento Plus']");
    By btnNoGracias = By.xpath("//label[@class='insurance__noThanks-radio-label']");

    By btnBUscarVuelo= By.xpath("(//button[normalize-space()='Buscar'] )[1]");
    By tbDireccionPostal=By.xpath("//input[@name='address']");
    By tbNumeroDeCalle=By.xpath("//input[@name='houseNumber']");
    By tbCodigoPostal=By.xpath("//input[@name='postCode']");
    By tbCiudad=By.xpath("//input[@name='city']");
    By rbSinEquipaje1=By.xpath("(//span[normalize-space()='Sin equipaje facturado'])[1]");
    By rbSinEquipaje2=By.xpath("(//span[normalize-space()='Sin equipaje facturado'])[2]");
    public VuelosHomePage(WebDriver driver) {
        super(driver);
        driver.manage().window().maximize();
    }

    public void navegarAlHome() throws InterruptedException {
        navigateTo(BASE_URL_AUT);
        click(btnRechazarCookies);
        Thread.sleep(3000);
        click(btnVuelos);
        click(btnVuelosMasBuscados);
        cambiarPag();
        scroll(600,600);

    }

    public void NavegarAHomeYCampos() throws InterruptedException {
        navigateTo(BASE_URL_AUT);
        Thread.sleep(2000);
        click(btnRechazarCookies);
        click(btnVuelos);
        Thread.sleep(5000);
        click(tbOrigen);
        write("barc",tbOrigen);
        Thread.sleep(3000);
        click(btnBarcelona);
        click(tbDestino);
        write("madr",tbDestino);
        click(btnMadrid);
        Thread.sleep(3000);
        click(btnBUscarVuelo);
        cambiarPag(); //Demora
        Thread.sleep(25000);
        click(btnPrecioNormal1);
        Thread.sleep(17000);
        click(btnElegirClassic);
        Thread.sleep(10000);

    }

    public void LlegarAFormulario() throws InterruptedException {
        navigateTo(BASE_URL_AUT);
        waitElemtToBeClickable(3,btnRechazarCookies);
        click(btnRechazarCookies);
        click(btnVuelos);
        Thread.sleep(10000);
        click(tbOrigen);
        write("barc",tbOrigen);
        Thread.sleep(3000);
        click(btnBarcelona);
        click(tbDestino);
        write("madr",tbDestino);
        Thread.sleep(3000);
        click(btnMadrid);
        click(btnBUscarVuelo);
        Thread.sleep(25000);
        click(btnPrecioNormal);
        Thread.sleep(25000);
        click(btnElegirClassic);
        Thread.sleep(25000);
        write("Pehuen",tbNombre);
        write("Dias",tbApellido);
        write("fffasd@gmail.com",tbEmail);
        write("4567183",tbTelefono);
        click(rbSr);
        write("23",tbQRDiaCumple);
        click(liQRMesCumple);
        click(btnNov);
        write("1996",tbQRAnioCumple);
        write("1235",tbCodigoPostal);
        write("6371",tbDireccionPostal);
        write("31245",tbNumeroDeCalle);
        write("La Rioja",tbCiudad);
        click(rbNoNecesito);
        click(rbSinEquipaje1);
        Thread.sleep(3000);
        click(rbSinEquipaje2);
        click(btnSig);
        Thread.sleep(15000);
        click(btnNoGracias);
        click(btnTarifaSinDescuento);
        click(btnSig);
        Thread.sleep(10000);

    }

    public void ErrorEmail() throws InterruptedException {
        navigateTo(BASE_URL_AUT);
        Thread.sleep(10000);
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
        Thread.sleep(10000);
        click(btnPrecioNormal);
        Thread.sleep(15000);
        click(btnElegirClassic);
        Thread.sleep(10000);
        write("Pehuen",tbNombre);
        write("Dias",tbApellido);
        write("4567183",tbTelefono);
        click(btnSig);
        Thread.sleep(10000);
    }

    public void VueloBarato() throws InterruptedException {
        navigateTo(BASE_URL_AUT);
        Thread.sleep(10000);
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
        Thread.sleep(15000);
        click(laMasBarato);
        Thread.sleep(15000);
    }

    public void VueloDirecto() throws InterruptedException {
        navigateTo(BASE_URL_AUT);
        click(btnRechazarCookies);
        click(btnVuelos);
        Thread.sleep(10000);
        click(tbOrigen);
        write("barc",tbOrigen);
        Thread.sleep(3000);
        click(btnBarcelona);
        click(tbDestino);
        write("madr",tbDestino);
        Thread.sleep(3000);
        click(btnMadrid);
        click(btnBUscarVuelo);
        Thread.sleep(35000);
        click(btnEmpresa);
        Thread.sleep(8000);
        click(btnNinguno);
        Thread.sleep(8000);
        click(btnPrecioNormal);
        Thread.sleep(25000);
        click(btnElegirClassic);
        write("Pehuen",tbNombre);
        write("Dias",tbApellido);
        write("fffasd@gmail.com",tbEmail);
        write("4567183",tbTelefono);
        write("23",tbQRDiaCumple);
        click(liQRMesCumple);
        click(rbSr);
        click(btnNov);
        write("1996",tbQRAnioCumple);
        //Reg Error
        click(rbNoNecesito);
        click(btnSig);
        Thread.sleep(10000);
        click(btnNoGracias);
        click(btnTarifaSinDescuento);
        Thread.sleep(10000);
        click(btnSig);
        Thread.sleep(24000);
    }


    public String TituloTest1(){
        return getText(tiTitulo);
    }
    public String TituloTest2(){
        return getText(tiTitulo);
    }
    public String TituloTest3(){
        return getText(laErrorEmail);
    }


    public String TituloTest5() {return getText(tiVuelosBaratos);}
    public String TituloTest6(){
        return getText(tiTitulo);
    }

    public void screenShot() throws IOException {
        capturaPantalla("C:\\Users\\lucas.cabral\\IdeaProjects\\bc101\\src\\test\\java\\aut\\funcional\\testcases\\capturas","CapturaTest.png");
    }



}
