package equipo2.funcional.testcases.hoteles;

import equipo2.funcional.pages.RumboHomePageH;
import framework.engine.selenium.DriverFactory;
import framework.engine.selenium.SeleniumTestBase;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static framework.engine.utils.Constants.BASE_URL_AUT;

public class RBO_0011HA extends SeleniumTestBase {
    RumboHomePageH rumbo;

    @Test
    public void test011() throws IOException {
        rumbo = new RumboHomePageH(DriverFactory.getDriver());
        rumbo.navigateTo(BASE_URL_AUT);
        rumbo.acceptCookie();
        rumbo.clickNavMenuHoteles();
        rumbo.destinoAlo();
        rumbo.agregarViajerosyHabitaciones();
        rumbo.fechasFlexible();
        rumbo.botonBuscarAlo();
        rumbo.estrellasyValoracion();
        rumbo.changeTab();
        rumbo.soloAlojamiento();
        rumbo.termycondic();
        rumbo.screenShotP("terminos_y_condiciones011");

    }
}
