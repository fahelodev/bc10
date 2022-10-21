package bc10.rllg.pom.base;
    /*
    clase base de selenium web driver, nos servira para
    enmascarar la tegnologia selenium - wrapper
     */

import bc10.earaya.webelements.WebElements;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SeleniumBase {
    //atributo
    private WebDriver driver;
    //contructor

    public SeleniumBase(WebDriver driver) {
        this.driver = driver;
    }
    //funciones de enmascarar o wrapper
    public void navegarAPagina(String url){
        driver.navigate().to(url);
    }
    public WebElement encontrarElemnto (By locator){
        return driver.findElement(locator);
    }

    public List<WebElement> encontrarElementos (By locator){
        return driver.findElements(locator);
    }

    public String obtenerTexto (By locator){
        return driver.findElement(locator).getText();
    }

    public void escribir(String inputText, By locator){
        driver.findElement(locator).sendKeys(inputText);
    }

    public void clikear(By locator){
        driver.findElement(locator).click();
    }

    public Boolean estaDesplegado(By locator) {
        try {
            return driver.findElement(locator).isDisplayed();
        } catch (org.openqa.selenium.NoSuchElementException e) {
            return false;
        }
    }
    public Boolean estaSeleccionado(By locator) {
        try {
            return driver.findElement(locator).isSelected();
        } catch (org.openqa.selenium.NoSuchElementException e) {
            return false;
        }
    }
    public void cambiarTamanhoDriver(int withd,int heigth){
        driver.manage().window().setSize(new Dimension(withd,heigth));
    }
    public int obtenerAltura(){
        return driver.manage().window().getSize().width;
    }
    public int obtenerAncho(){
        return driver.manage().window().getSize().height;
    }
    public WebDriver getDriver(){
        return driver;
    }
}
