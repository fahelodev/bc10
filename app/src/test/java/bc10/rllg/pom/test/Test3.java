package bc10.rllg.pom.test;

import bc10.rllg.pom.base.TestBase;
import bc10.rllg.pom.pages.GatlingHomePage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.Duration;

public class Test3 extends TestBase {
    GatlingHomePage gatlingHomePage;

    @Test
    public void creacionPc() {
        gatlingHomePage = new GatlingHomePage(super.driver);
        gatlingHomePage.maximizar();
        gatlingHomePage.IrAhomePage();
        gatlingHomePage.agregraNuevoPc();
        gatlingHomePage.escribirComputerName("BC10_RL");
        gatlingHomePage.escribirIntroduced("1988-01-10");
        gatlingHomePage.escribirDiscontinued("2022-10-18");
        gatlingHomePage.seleccionCompany("Nintendo");
        gatlingHomePage.addNewComputer();
        Assertions.assertEquals("Done !", gatlingHomePage.validarCreaccionNuevoPc());
    }
}
