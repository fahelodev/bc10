package bc10.earaya.webelements;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import org.openqa.selenium.support.ui.Select;


import java.time.Duration;
import java.util.List;

public class WebElements {
    WebDriver driver;

    @FindBy(name = "q")
    WebElement barraBusqueda;

    @FindBy(name = "btnK")
    WebElement btnBuscarConGoogle;

    @FindBy(css = ".andes-modal-dialog > iframe:nth-child(1)")
    WebElement iframe;

    By iframeLocalizador = By.cssSelector(".andes-modal-dialog > iframe:nth-child(1)");

    @FindBy(id = "dropdown")
    WebElement dropdown;

    @FindBy(id = "ui-id-3")
    WebElement Enables;

    @FindBy(id = "ui-id-4")
    WebElement downloads;

    @FindBy(id = "ui-id-5")
    WebElement elultimo;

    @FindBy(xpath = "//input[1]")
    WebElement check1;

    @FindBy(xpath = "//input[2]" )
    WebElement check2;



    @BeforeEach
    void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

        PageFactory.initElements(driver, this);//Para crear una instancia de los elementos

        PageFactory.initElements(driver,this);

    }

    @Test
    void busquedaGoogle() throws InterruptedException {

        driver.get("https://www.google.com");
        //Con WebElement capturamos el elemento, a traves de sus atributos
        barraBusqueda.clear();
        barraBusqueda.sendKeys("Tsoft");
        barraBusqueda.sendKeys(Keys.ESCAPE);
        Thread.sleep(500);
        btnBuscarConGoogle.click();
        Assertions.assertEquals("Tsoft - Buscar con Google",driver.getTitle());
    }
    @Test
    void busquedaMercadoLibre() throws InterruptedException {

        driver.get("https://www.mercadolibre.com.ar/");
        driver.findElement(By.xpath("(//li[@class='nav-menu-item']/a)[1]")).click();
        driver.switchTo().frame(driver.findElement(iframeLocalizador));
        Thread.sleep(1500);
        driver.findElement(By.xpath("/html/body/main/div/div[2]/form/div/div/div/div[1]/label/div/input")).sendKeys("5300");
        driver.findElement(By.xpath("/html/body/main/div/div[2]/form/div/div/div/div[1]/label/div/div/button/span")).click();

    }

  /*  @Test
    public  void dropdown (){
        driver.navigate().to("https://the-internet.herokuapp.com/dropdown");
        Select manejoDropdown = new Select(dropdown);
        //manejoDropdown.selectByValue("1");
        manejoDropdown.selectByValue("2");
        manejoDropdown.selectByVisibleText("Option 1");

    }*/

    @Test
    public void dropdownDinamico(){
        driver.navigate().to("https://the-internet.herokuapp.com/jqueryui/menu");
        Enables.click();
        downloads.click();
        elultimo.click();
    }

    @Test
    public void checkBox(){
        driver.get("https://the-internet.herokuapp.com/checkboxes");
        check1.click();
        boolean estacliqueado = check1.isSelected();

        check2.click();
        boolean estaseliado2 = check2.isSelected();

    }

    @Test
    public void iFrame(){
        driver.navigate().to("https://the-internet.herokuapp.com/iframe");
        List<WebElement> iframe = driver.findElements(By.tagName("iframe"));
        driver.switchTo().frame(iframe.get(0));
        WebElement areEscritura = driver.findElement(By.id("tinymce"));
        areEscritura.clear();
        areEscritura.sendKeys("Hola como estas ");



    }

    @Test
    public void tablasWeb(){
        //tabla 1 - ordenar tabla por deuda de mayor a menor
        driver.navigate().to("https://the-internet.herokuapp.com/tables");
        List<WebElement> webTables = driver.findElements(By.tagName("table"));
        WebElement tabla1 = webTables.get(0);
        List<WebElement> filas = tabla1.findElement(By.tagName("tbody")).findElements(By.tagName("tr"));
        List<WebElement> columnas = tabla1.findElement(By.tagName("thead")).findElements(By.tagName("th"));

        if(columnas.get(3).getText().contains("Due")){
            columnas.get(3).click();
            columnas.get(3).click();

        }
        String nombre = filas.get(0).findElement(By.xpath("//td[2]")).getText();
        String apellido = filas.get(0).findElement(By.xpath("//td[1]")).getText();
        String deuda  = filas.get(0).findElement(By.xpath("//td[4]")).getText();

    }




    @AfterEach
    void clean(){
        //driver.close();
    }


}
