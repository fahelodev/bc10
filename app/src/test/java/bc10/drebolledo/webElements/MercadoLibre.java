package bc10.drebolledo.webElements;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MercadoLibre {

    WebDriver driver;

    @BeforeEach
    void setUp() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.get("https://www.mercadolibre.com.ar/");


    }

    @Test
    void mercadolibreTest(){
        //By enviarA = By.xpath("/html/body/header/div/div[2]/ul/li[1]/a");
        //WebElement enVI = driver.findElement(enviarA);
        driver.findElement(By.xpath("/html/body/header/div/div[2]/ul/li[1]/a")).click();
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@src,'addresses-hub')]")));
        driver.findElement(By.name("zipcode")).sendKeys("1234");
        //enVI.click();






    }

    @AfterEach
    void terminalPrograms(){
        //driver.quit();
    }
}
