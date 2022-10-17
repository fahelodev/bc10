package bc10.drebolledo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

public class SwitchingTest {

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
        driver.switchTo().newWindow(WindowType.TAB);
        driver.switchTo().newWindow(WindowType.WINDOW);
        Set<String> handles = driver.getWindowHandles();
        Iterator<String> it = handles.iterator();
        String paW = it.next();
        String cHW = it.next();
        String sCW = it.next();
        driver.switchTo().window(cHW);
        driver.get(link2);
        driver.switchTo().window(sCW);
        driver.get(link3);
        js.executeScript("window.open('https://www.google.com/');");












        /*driver.get(link1);
        js.executeScript("window.open();");


        driver.switchTo().newWindow(WindowType.WINDOW);

        js.executeScript("window.open();");*/




        /*for (String h: all) {
            System.out.println("the handles is " + h);


        }
        System.out.println(all.size());*/
    }
    }

