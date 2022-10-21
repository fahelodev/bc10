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

    //funciones o acciones que podemos desarrollar en la pagina
    public void IrAhomePage() {
        navegarAPagina(urlHome);
    }

    public void redimensionar(int withd, int heigth) {
        cambiarTamanhoDriver(withd, heigth);
    }

    public void validarDespliegueBotones() {
        estaDesplegado(btnFiltrarLocalizador);
        estaDesplegado(btnAddLocalizador);
    }

    public void validarDespliegueColumnas() {
        estaDesplegado(colComputerNameLocalizador);
        estaDesplegado(colIntroducedLocalizador);
        estaDesplegado(colDiscontinuedLocalizador);
        estaDesplegado(colCompanyLocalizador);
    }

}

