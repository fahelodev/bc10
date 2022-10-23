package bc10.rllg.pom.base;
    /*
    clase base de selenium web driver, nos servira para
    enmascarar la tegnologia selenium - wrapper
     */

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class SeleniumBase {
    //atributo
    private WebDriver driver;

    //contructor
    public SeleniumBase(WebDriver driver) {
        this.driver = driver;
    }

    //funciones de enmascarar o wrapper
    public void navegarAPagina(String url) {
        driver.navigate().to(url);
    }

    public WebElement encontrarElemnto(By locator) {
        return driver.findElement(locator);
    }

    public String obtenerTexto(By locator) {
        return driver.findElement(locator).getText();
    }

    public void escribir(String inputText, By locator) {
        driver.findElement(locator).sendKeys(inputText);
    }

    public void clickear(By locator) {
        driver.findElement(locator).click();
    }

    public Boolean estaDesplegado(By locator) {
        try {
            return driver.findElement(locator).isDisplayed();
        } catch (org.openqa.selenium.NoSuchElementException e) {
            return false;
        }
    }

    public void cambiarTamanhoDriver(int withd, int heigth) {
        driver.manage().window().setSize(new Dimension(withd, heigth));
    }

    public int obtenerAltura() {
        return driver.manage().window().getSize().height;
    }

    public int obtenerAncho() {
        return driver.manage().window().getSize().width;
    }

    public WebDriver getDriver() {
        return driver;
    }

    public void maximizar() {
        driver.manage().window().maximize();
    }

    public void seleccionarTextoVisible(By locator, String dato) {
        WebElement elemento = driver.findElement(locator);
        Select seleccionar = new Select(elemento);
        seleccionar.selectByVisibleText(dato);
    }

}
