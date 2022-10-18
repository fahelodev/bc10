package bc10.drebolledo.webElements;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExplicitWaits {

    WebDriver driver;
    //locators
    By link1 = By.xpath("//a[normalize-space()='Example 1: Element on page that is hidden']");
    By botonS = By.xpath("//button[normalize-space()='Start']");
    By helloASync = By.xpath("//h4[normalize-space()='Hello World!']");

    @BeforeEach
    void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1500));
    }




    @Test
    void  waits(){
        driver.get("https://the-internet.herokuapp.com/dynamic_loading");
        WebElement codigo1 = driver.findElement(link1);
        codigo1.click();
        WebElement start = driver.findElement(botonS);
        start.click();
        // Espera explicito
        /*WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(helloASync));*/

        Wait<WebDriver> fluentwait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(10)).pollingEvery(Duration.ofMillis(100))
                .ignoring(NoSuchElementException.class);

        fluentwait.until(ExpectedConditions.elementToBeClickable(helloASync));

        Assertions.assertEquals("Hello World!",driver.findElement(helloASync).getText());
    }

}
