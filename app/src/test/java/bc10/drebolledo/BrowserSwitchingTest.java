package bc10.drebolledo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;

public class BrowserSwitchingTest {

    WebDriver driver;
    //WebDriver driver2;

    @BeforeEach
    void setUp(){
        WebDriverManager.chromedriver().setup();
    }


    @Test
    void browserSwitchingTest(){
        driver = new ChromeDriver();
       /* driver2 = new ChromeDriver();

        String originalWindows = driver.getWindowHandle();
        driver.navigate().to("https://www.google.cl");
        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.navigate().to("https://www.facebook.com");
        String newWIndow = driver.getWindowHandle();

        //driver.switchTo().window(originalWindows).navigate().to("http://www.youtube.com");
        driver.switchTo().window(newWIndow);
        driver.switchTo().newWindow(WindowType.TAB);
        driver.navigate().to("https://www.selenium.dev/");

        driver.switchTo().window(newWIndow);
        driver.switchTo().newWindow(WindowType.TAB);
        driver.navigate().to("https://www.selenium.dev/");*/
        String link1 = "https://www.youtube.com/";
        driver.get(link1);
        String originalWindows = driver.getWindowHandle();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.open();");



        ArrayList<String> all = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(all.get(1));
        String link2 ="https://www.facebook.com/";
        driver.get(link2);

        driver.switchTo().newWindow(WindowType.WINDOW).get("http://www.koalastothemax.com/");
        js.executeScript("window.open();");
        driver.switchTo().window(all.get(0));
        driver.get(link2);
        //driver.switchTo().window(all.get(0));
        /*String link3 = "https://www.portalnet.cl/";
        driver.get(link3);
*/
       /* for (String h: all) {
            System.out.println("the handles is " + h);


        }
        System.out.println("Handle original " +  originalWindows);
        System.out.println("Tamaño " + all.size());

*/







    }



  /*  @AfterEach
    void close(){
        driver.quit();
    }*/
}
