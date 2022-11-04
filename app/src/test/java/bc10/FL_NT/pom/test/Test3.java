package bc10.FL_NT.pom.test;


import bc10.FL_NT.pom.base.TestBase;
import bc10.FL_NT.pom.page.ComputerDataBaseHomePage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test3 extends TestBase {
    ComputerDataBaseHomePage cdb;

    @Test
    void addComputerBC10() {
        cdb = new ComputerDataBaseHomePage(super.driver);
        cdb.irAlHome();
        cdb.clickNavigateAddComputer();
        cdb.enviarTexto("BC10FLNT");
        cdb.clickCreateComputer();
        Assertions.assertEquals("Done ! Computer BC10FLNT has been created",cdb.obtenerMensajeDone());


    }
}
