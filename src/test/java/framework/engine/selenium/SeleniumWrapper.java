package framework.engine.selenium;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.*;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Set;


public class SeleniumWrapper {

    public final WebDriver driver;

    //Constructor Base
    public SeleniumWrapper(WebDriver driver) {
        this.driver = driver;
    }

    //Wrappers Selenium
    public WebElement findElement(By locator) {
        return driver.findElement(locator);
    }

    public List<WebElement> findElements(By locator) {
        return driver.findElements(locator);
    }


    public void cambiarPag (){
        ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(0));
        driver.close();
        driver.switchTo().window(tabs2.get(1));}

    public void waitElemtToBeClickable(int tiempo,By locator){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(tiempo));
        wait.until(ExpectedConditions.elementToBeClickable(locator));
    }

    public void implicitlyWaitOfMillis(int millis){
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(millis));
    }


    public void scroll(int xPixeles, int yxPixeles){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy("+xPixeles+","+yxPixeles+")");
    }
    public String getText (By locator){
        return driver.findElement(locator).getText();
    }

    public void setSize(int width, int height){
        driver.manage().window().setSize(new Dimension(width, height));
    }

    public void write(String inputText, By locator){

    public String getText(By locator) {
        return driver.findElement(locator).getText();
    }

    public void write(String inputText, By locator) {

        isDisplayed(locator);
        driver.findElement(locator).sendKeys(inputText);
    }

    public void sendKeys(Keys key, By locator) {
        driver.findElement(locator).sendKeys(key);
    }

    public void click(By locator) {
        driver.findElement(locator).click();
    }

    public Boolean isDisplayed(By locator) {
        try {
            return driver.findElement(locator).isDisplayed();
        } catch (org.openqa.selenium.NoSuchElementException e) {
            return false;
        }
    }

    public Boolean isEnabled(By locator) {
        try {
            return driver.findElement(locator).isEnabled();
        } catch (org.openqa.selenium.NoSuchElementException e) {
            return false;
        }
    }

    public Boolean isSelected(By locator) {
        try {
            return driver.findElement(locator).isSelected();
        } catch (org.openqa.selenium.NoSuchElementException e) {
            return false;
        }
    }

    public void navigateTo(String url) {
        driver.navigate().to(url);

    }
    // Metodos Grupo 2 agregados

    public void changeTab() {
        driver.getWindowHandles().forEach(tab -> driver.switchTo().window(tab));
    }


    public void waitClick(By locator) {
        WebDriverWait waitme = new WebDriverWait(driver, Duration.ofSeconds(25));
        waitme.until(ExpectedConditions.elementToBeClickable(locator));
    }

    public void waitDisplayclick(By locator) {
        WebDriverWait waitD = new WebDriverWait(driver, Duration.ofSeconds(25));
        waitD.until(ExpectedConditions.visibilityOfElementLocated(locator)).click();
    }

    public void scrollDown() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,800)", "");
    }

    public void scrollup() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,-100)", "");
    }

    public void summit(By locator) {
        driver.findElement(locator).click();
    }

    public void screenShotP(String FileName) throws IOException {
        File File = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(File, new File("src\\test\\java\\equipo2.funcional\\testcases\\imagenes\\" + FileName + ".jpeg"));
    }

    public void implicitwait() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    public void actionsS(By locator) {
        Actions action = new Actions(driver);
        WebElement element = driver.findElement(locator);
        action.moveToElement(element).click().perform();
    }

    //Desde aqui se modifico y se agregaron las nuevas funciones para el equipo 1

    public void scroll(int horizontal, int vertical) {
        ((JavascriptExecutor) driver).executeScript("scroll(" + horizontal + "," + vertical + ")");
    }

    public void scrollEncuentra(By locator) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", findElement(locator));
    }

    public void clear(By locator) {
        WebElement areaDeEscritura = driver.findElement(locator);
        areaDeEscritura.clear();
    }

    public void select(By locator, String dato) {
        WebElement elemento = driver.findElement(locator);
        Select seleccionar = new Select(elemento);
        seleccionar.selectByVisibleText(dato);
    }


    public String getUrlTitle() {
        return driver.getTitle();
    }


    public void capturaPantalla(String direccion, String s) throws IOException {
        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile,new File(direccion,s));}

    public void cambiarPag (){
        ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(0));
        driver.close();
        driver.switchTo().window(tabs2.get(1));}

    public void waitElemtToBeClickable(int tiempo,By locator){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(tiempo));
        wait.until(ExpectedConditions.elementToBeClickable(locator));

    public void seleccionFechaIda(int diai, int mesi, int anhoi, int diav, int mesv, int anhov, By locator) {
        if (anhoi == (2022)) {
            if (mesi == 11) {
                click((By.xpath(("(//button[@type='button'][normalize-space()='" + diai + "'])[1]"))));
            } else if (mesi == 12) {
                click(locator);
                click((By.xpath(("(//button[@type='button'][normalize-space()='" + diai + "'])[2]"))));
            }
        } else if (anhoi == 2023) {
            int NumeroMes = mesi - 1;
            click(locator);
            for (int i = 0; i < 12; i++) {
                if (NumeroMes == i) {
                    click((By.xpath(("(//button[@type='button'][normalize-space()='" + diai + "'])[2]"))));
                    break;
                } else {
                    click(locator);
                }
            }
        }
        if (mesv == 11 && anhoi == 2022) {
            click((By.xpath(("(//button[@type='button'][normalize-space()='" + diav + "'])[1]"))));
        } else if (mesv == 12 && anhov == 2022) {
            click((By.xpath(("(//button[@type='button'][normalize-space()='" + diav + "'])[2]"))));
        } else if (mesi == mesv) {
            click((By.xpath(("(//button[@type='button'][normalize-space()='" + diav + "'])[2]"))));
        } else {
            click(locator);
            click((By.xpath(("(//button[@type='button'][normalize-space()='" + diav + "'])[2]"))));
        }
    }

    public void buscarCiudadTop(String ciudadTop) {
        click(By.xpath("//a[normalize-space()='Vuelos a " + ciudadTop + "']"));

    }

    public void seleccionarfechaIda(int diai, int mesi, int anhoi, By locator) {

        if (anhoi == (2022)) {
            if (mesi == 11) {
                click((By.xpath(("//div[@class='monthContainer monthContainerFirst']//div[@class='monthDay monthDayEnabled'][normalize-space()='" + diai + "']"))));
            } else if (mesi == 12) {
                click(locator);
                click((By.xpath(("//div[@class='monthContainer monthContainerFirst']//div[@class='monthDay monthDayEnabled'][normalize-space()='" + diai + "']"))));
            }
        } else if (anhoi == 2023) {
            int NumeroMes = mesi;
            click(locator);
            for (int i = 0; i < 12; i++) {
                if (NumeroMes == i) {
                    click((By.xpath(("//div[@class='monthContainer monthContainerFirst']//div[@class='monthDay monthDayEnabled'][normalize-space()='" + diai + "']"))));
                    break;
                } else {
                    click(locator);
                }
            }
        }
    }

    public void bajarPreciosTop() {

        WebElement barraslider = driver.findElement(By.xpath("//div[@class='price-filter-view__wrapper range-slider__wrapper']//div[@role='slider']"));
        WebElement to = driver.findElement(By.xpath("//div[@class='price-filter-view__wrapper range-slider__wrapper']//div[@class='lmnRangeSlider lmn-ui-range-slider']"));
        Actions action = new Actions(driver);
        int width = barraslider.getSize().getWidth();
        int xOffset1 = barraslider.getLocation().getX();
        int yOffset1 = barraslider.getLocation().getY();
        int xOffset = to.getLocation().getX();
        int yOffset = to.getLocation().getY();

        xOffset = (xOffset - xOffset1) + 10;
        yOffset = (yOffset - yOffset1) + 20;

        action.dragAndDropBy(barraslider, xOffset, yOffset).perform();

    }

    public void bajarEscalasTop() {

        WebElement barraslider = driver.findElement(By.xpath("//div[contains(@class,'stop-duration-filter-view__wrapper range-slider__wrapper')]//div[contains(@role,'slider')]"));
        WebElement to = driver.findElement(By.xpath("//div[contains(@class,'stop-duration-filter-view__wrapper range-slider__wrapper')]//div[contains(@class,'lmnRangeSlider lmn-ui-range-slider')]"));
        Actions action = new Actions(driver);
        int width = barraslider.getSize().getWidth();
        int xOffset1 = barraslider.getLocation().getX();
        int yOffset1 = barraslider.getLocation().getY();
        int xOffset = to.getLocation().getX();
        int yOffset = to.getLocation().getY();

        xOffset = (xOffset - xOffset1) + 10;
        yOffset = (yOffset - yOffset1) + 20;

        action.dragAndDropBy(barraslider, xOffset - 50, yOffset).perform();
    }

    public void cambiarAIframe() throws InterruptedException {
        click(By.xpath("//*[name()='path' and contains(@d,'M48.12109,')]"));

    }


    public void buscarIframe(By locator) {

        int size = driver.findElements(By.tagName("iframe")).size();
        for (int i = 0; i <= size; i++) {
            int contador = i;
            driver.switchTo().frame(i);
            if (isDisplayed(locator)) {
                System.out.println(contador);
            } else
                driver.switchTo().defaultContent();
        }
    }

    public void cambiarseIframe(By locator) throws InterruptedException {
        driver.switchTo().frame(findElement(locator));
        Thread.sleep(1500);

    }
    public void esperaMillis(int millis) throws InterruptedException {
        Thread.sleep(millis);
    }

    public void volverOriginal() throws InterruptedException {

        driver.switchTo().defaultContent();
        //Thread.sleep(2000);

    }

    public void hover(By locator) {
        Actions builder = new Actions(driver);
        builder.moveToElement(findElement(locator)).perform();
    }

    public void cambiarPestanha() {

        String mainTab = driver.getWindowHandle();
        String newTab = "";

        System.out.println("Main Tab: " + mainTab);

        Set<String> handles = driver.getWindowHandles();
        for (String actual : handles) {
            System.out.println("--Handle Id: " + actual);

            if (!actual.equalsIgnoreCase(mainTab)) {
                System.out.println("--Cambiando Tab --");
                driver.switchTo().window(actual);

                newTab = actual;
            }
        }
    }
    public void esperaPorLocator(By locator,int maxTime){
        WebElement esperarLocator = new WebDriverWait(DriverFactory.getDriver(),Duration.ofSeconds(maxTime))
                .until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
    public void esperaPorClick(By locator, int maxTime){
        WebElement esperarClick = new WebDriverWait(DriverFactory.getDriver(),Duration.ofSeconds(maxTime))
                .until(ExpectedConditions.elementToBeClickable(locator));
    }
    public void esperaImplicitaMillis(int timeEspera){
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(timeEspera));

    }


}
