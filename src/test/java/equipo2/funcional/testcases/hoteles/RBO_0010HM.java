package equipo2.funcional.testcases.hoteles;

import equipo2.funcional.pages.RumboHomePageH;
import framework.engine.selenium.DriverFactory;
import framework.engine.selenium.SeleniumTestBase;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static framework.engine.utils.Constants.BASE_URL_AUT;

public class RBO_0010HM extends SeleniumTestBase {
    RumboHomePageH rumbo;

    @Test
    public void test010() throws IOException {
        rumbo = new RumboHomePageH(DriverFactory.getDriver());
        rumbo.navigateTo(BASE_URL_AUT);
        rumbo.acceptCookie();
        rumbo.clickNavMenuHoteles();
        rumbo.destinoAlo();
        rumbo.viajeroyHabitacion();
        rumbo.botonBuscarAlo();

        //Cambio de sitio bajo esas condiciones y condiciones borradas
        rumbo.screenShotP("cambio_de_sitio_inspirame_rumbo010");
    }
}
