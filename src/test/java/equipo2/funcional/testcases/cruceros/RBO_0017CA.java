package equipo2.funcional.testcases.cruceros;

import equipo2.funcional.pages.RumboHomePageC;
import framework.engine.selenium.DriverFactory;
import framework.engine.selenium.SeleniumTestBase;
import org.junit.jupiter.api.Test;
import static framework.engine.utils.Constants.BASE_URL_AUT;
import java.io.IOException;

public class RBO_0017CA extends SeleniumTestBase {
    RumboHomePageC rumbo;
    @Test
    public void testCrucero17() throws IOException {
        rumbo = new RumboHomePageC(DriverFactory.getDriver());
        rumbo.navigateTo(BASE_URL_AUT);
        rumbo.acceptCookies();
        rumbo.cruceros();
        rumbo.agregarDestino17();
        rumbo.cotizacionCrucero17();
        rumbo.finalCrucero17();
        rumbo.clicksFinal17();
        rumbo.screenShotP("Test17");
    }

}

