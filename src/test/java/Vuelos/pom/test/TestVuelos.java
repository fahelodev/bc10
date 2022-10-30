package Vuelos.Test;

import Vuelos.pom.base.SeleniumBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class TestVuelos extends SeleniumBase {
    String UrlHome ="https://www.rumbo.es/";
    //By btnVuelos = By.xpath("//a[@class='evvzyi82 display-1xmtdkn-HubAnchor-styles-MenuLink e89md6u0']");


    public TestVuelos(WebDriver driver){
        super(driver);
    }
  //  @Test
    public void Test1(){
        NavegarAPagina(UrlHome);
    }
}
