package bc10.drebolledo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserActionsTest {

    WebDriver driver;

    @BeforeEach
    void setUp(){
        WebDriverManager.chromedriver().setup();
    }

    @Test
    void browserActionsTest(){
        String titulo;
        driver = new ChromeDriver();
        driver.get("https://www.google.cl");
        titulo = driver.getTitle();
        System.out.println("El titulo de la url abierto es:  " + titulo);
        driver.navigate().to("https://www.selenium.dev");
        titulo = driver.getTitle();
        System.out.println("El titulo de la url abierto es:  " + titulo);

        driver.navigate().back();
        titulo = driver.getTitle();
        System.out.println("El titulo de la url abierto es:  " + titulo);
        driver.navigate().forward();
        titulo = driver.getTitle();
        System.out.println("El titulo de la url abierto es:  " + titulo);
        driver.navigate().refresh();

    }



    @AfterEach
    void close(){
        driver.quit();
    }
}
