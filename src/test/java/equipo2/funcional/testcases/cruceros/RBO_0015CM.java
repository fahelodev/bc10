package equipo2.funcional.testcases.cruceros;

import equipo2.funcional.pages.RumboHomePageC;
import framework.engine.selenium.DriverFactory;
import framework.engine.selenium.SeleniumTestBase;
import org.junit.jupiter.api.Test;
import static framework.engine.utils.Constants.BASE_URL_AUT;
import org.junit.jupiter.api.Assertions;
import java.io.IOException;


public class RBO_0015CM extends SeleniumTestBase {
    RumboHomePageC rumbo;

    @Test
    public void pruebaCrucero15() throws IOException {
        rumbo = new RumboHomePageC(DriverFactory.getDriver());
        rumbo.navigateTo(BASE_URL_AUT);
        rumbo.acceptCookies();
        rumbo.cruceros();
        rumbo.agregarDestino();
        rumbo.cotizacionCrucero();
        rumbo.finalTest15();
        Assertions.assertEquals("No te preocupes, ¡no se realizará ningún cargo todavía!", rumbo.alertaFinal());



    }
}
