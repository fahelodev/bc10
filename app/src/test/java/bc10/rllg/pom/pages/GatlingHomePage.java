package bc10.rllg.pom.pages;

import bc10.rllg.pom.base.SeleniumBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GatlingHomePage extends SeleniumBase {

    public GatlingHomePage(WebDriver driver) {
        super(driver);
    }

    //Localizadores
    String urlHome = "https://computer-database.gatling.io/computers";
    By btnFiltrarLocalizador = By.id("searchsubmit");
    By btnAddLocalizador = By.id("add");
    By colComputerNameLocalizador = By.xpath("//a[text()='Computer name']");
    By colIntroducedLocalizador = By.xpath("//a[text()='Introduced']");
    By colDiscontinuedLocalizador = By.xpath("//a[text()='Discontinued']");
    By colCompanyLocalizador = By.xpath("//a[text()='Company']");
    By nombreComputerVacioLocalizador = By.xpath("//span[@class='help-inline'and text()='Failed to refine type : Predicate isEmpty() did not fail.']");
    By btnCreateComputerLocalizador = By.xpath("//input[@class='btn primary']");

    By nombreLocalizador = By.id("name");
    By introducirLocalizador = By.id("introduced");
    By descontinuadoLocalizador = By.id("discontinued");
    By companiaLocalizador = By.id("company");
    By confirmacionLocalizador = By.xpath("//strong[normalize-space()='Done !']");

    //funciones o acciones que podemos desarrollar en la pagina
    public void IrAhomePage() {
        navegarAPagina(urlHome);
    }

    public void redimensionar(int withd, int heigth) {
        cambiarTamanhoDriver(withd, heigth);
    }

    public boolean validarDespliegueBotones() {
        boolean ok = true;
        if (estaDesplegado(btnAddLocalizador) == false || estaDesplegado(btnAddLocalizador) == false || estaDesplegado(btnCreateComputerLocalizador) == false) {
            ok = false;
        }
        return ok;
    }

    public boolean validarDespliegueColumnas() {
        boolean ok = true;
        if (estaDesplegado(colComputerNameLocalizador) == false || estaDesplegado(colIntroducedLocalizador) == false || estaDesplegado(colDiscontinuedLocalizador) == false || estaDesplegado(colCompanyLocalizador) == false) {
            ok = false;
        }
        return ok;
    }

    public String validarIngresoVacio() {
        return obtenerTexto(nombreComputerVacioLocalizador);
    }

    public void agregraNuevoPc() {
        clickear(btnAddLocalizador);
    }

    public void crearNuevoPc() {
        clickear(btnCreateComputerLocalizador);
    }

    public void escribirComputerName(String dato) {
        escribir(dato, nombreLocalizador);
    }

    public void escribirIntroduced(String dato) {
        escribir(dato, introducirLocalizador);
    }

    public void escribirDiscontinued(String dato) {
        escribir(dato, descontinuadoLocalizador);
    }

    public void seleccionCompany(String dato) {
        seleccionarTextoVisible(companiaLocalizador, dato);
    }

    public void addNewComputer() {
        clickear(btnCreateComputerLocalizador);
    }
    public String validarCreaccionNuevoPc(){
        return obtenerTexto(confirmacionLocalizador);
    }
}


