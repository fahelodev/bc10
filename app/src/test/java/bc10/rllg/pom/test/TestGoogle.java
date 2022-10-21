package bc10.rllg.pom.test;

import bc10.rllg.pom.base.TestBase;
import bc10.rllg.pom.pages.GoogleHomePage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestGoogle extends TestBase {
    GoogleHomePage ghp;

    @Test
    void busquedaNormal(){
        ghp = new GoogleHomePage(super.driver);
        ghp.irAHome();
        ghp.buscarEnBarraConBotonBuscarConGoogle("Tsoft");
        Assertions.assertTrue(true);

    }
    @Test
    void busquedaSuerte(){
        ghp = new GoogleHomePage(super.driver);
        ghp.irAHome();
        ghp.buscarEnBarraConBotonVoyATenerSuerte("Tsoft");
        Assertions.assertTrue(true);

    }
}
