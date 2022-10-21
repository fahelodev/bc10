package bc10.rllg.pom.pages;

import bc10.rllg.pom.base.SeleniumBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GoogleHomePage extends SeleniumBase {
    public GoogleHomePage(WebDriver driver) {
        super(driver);
    }
    //Atributos y localizadores
    String url ="https://www.google.com/";
    By barraBusquedaLocator = By.name("q");
    By btnBuscarConGoogleLocator = By.name("btnK");
    By btnVoyATenerSuerteLocator = By.name("btnI");
    public void irAHome(){
        navegarAPagina(url);
    }

    //Metodos y funciones de pagina
    public void buscarEnBarraConBotonBuscarConGoogle(String texto){
        escribir(texto,barraBusquedaLocator);
        clickear(btnBuscarConGoogleLocator);
    }
    public void buscarEnBarraConBotonVoyATenerSuerte(String texto){
        escribir(texto,barraBusquedaLocator);
        clickear(btnVoyATenerSuerteLocator);
    }
}
