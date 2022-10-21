package bc10.rllg.pom.test;

import bc10.rllg.pom.base.TestBase;
import bc10.rllg.pom.pages.GatlingHomePage;
import org.junit.jupiter.api.Test;

public class Test1 extends TestBase {
    GatlingHomePage gatlingHomePage;

    @Test
    public void test1(){
        gatlingHomePage = new GatlingHomePage(driver);
        gatlingHomePage.IrAhomePage();
        gatlingHomePage.validarDespliegueBotones();
        gatlingHomePage.validarDespliegueColumnas();
    }
}
