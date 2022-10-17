package bc10.drebolledo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class SwitchingTest2 {

    WebDriver driver;


    @BeforeEach
    void setUp() {
        WebDriverManager.chromedriver().setup();
    }

    @Test
    void browserSwitchingTest() {
        driver = new ChromeDriver();

        String link1 = "https://www.selenium.dev/";
        String link2 = "https://www.youtube.com/";
        String link3 = "https://www.facebook.com/";
        String link4 = "http://www.koalastothemax.com/";
        JavascriptExecutor js = (JavascriptExecutor) driver;

        driver.get(link1);
        js.executeScript("window.open('https://www.google.com/');");
        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get(link2);
        js.executeScript("window.open('http://www.koalastothemax.com/');");











    }
}
