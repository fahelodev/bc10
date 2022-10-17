package bc10.drebolledo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserSizing {

    WebDriver driver;

    @BeforeEach
    void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.google.cl");
        driver.manage().window().maximize();
        driver.manage().window().minimize();
        driver.manage().window().fullscreen();
        driver.manage().window().setSize(new Dimension(800,600));
    }

   /* @Test
    void browserSize(){

        int width = driver.manage().window().getSize().width;
        int heigth = driver.manage().window().getSize().height;

        System.out.println(width);
        System.out.println(heigth);


        //dimesiones

        Dimension dimension = driver.manage().window().getSize();
        int witdh2 = dimension.getWidth();
        int heigth2 = dimension.getHeight();

        System.out.println(witdh2);
        System.out.println(heigth2);

        // cambiar el tamaño

        driver.manage().window().setSize(new Dimension(600,400));

    }*/

    @Test
    void browserPosition(){
        int x = driver.manage().window().getPosition().getX();
        int y = driver.manage().window().getPosition().getY();

        System.out.println(x);
        System.out.println(y);

        //point

        Point posicion = driver.manage().window().getPosition();

        int x1 = posicion.x;
        int y2 = posicion.y;

        System.out.println(x1);
        System.out.println(y2);

        // modificar posicion y ventana

        driver.manage().window().setPosition(new Point(500,20));


    }

}
