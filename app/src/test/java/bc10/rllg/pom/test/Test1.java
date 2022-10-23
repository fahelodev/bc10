package bc10.rllg.pom.test;

import bc10.rllg.pom.base.TestBase;
import bc10.rllg.pom.pages.GatlingHomePage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test1 extends TestBase {
    GatlingHomePage gatlingHomePage;

    @Test
    public void validarTamanho() {
        gatlingHomePage = new GatlingHomePage(super.driver);
        gatlingHomePage.IrAhomePage();
        gatlingHomePage.cambiarTamanhoDriver(800, 600);
        Assertions.assertEquals(800, gatlingHomePage.obtenerAncho());
        Assertions.assertEquals(600, gatlingHomePage.obtenerAltura());
        Assertions.assertEquals(true, gatlingHomePage.validarDespliegueBotones());
        Assertions.assertEquals(true, gatlingHomePage.validarDespliegueColumnas());
    }
}
