package bc10.rllg.pom.test;

import bc10.rllg.pom.base.TestBase;
import bc10.rllg.pom.pages.GatlingHomePage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test2 extends TestBase {
    GatlingHomePage gatlingHomePage;

    @Test
    public void validarErrorPcVacio(){
        gatlingHomePage = new GatlingHomePage(super.driver);
        gatlingHomePage.maximizar();
        gatlingHomePage.IrAhomePage();
        gatlingHomePage.agregraNuevoPc();
        gatlingHomePage.crearNuevoPc();
        Assertions.assertEquals("Failed to refine type : Predicate isEmpty() did not fail.",gatlingHomePage.validarIngresoVacio());
    }

}
