package equipo2.funcional.testcases.hoteles;

import equipo2.funcional.pages.RumboHomePageH;
import framework.engine.selenium.DriverFactory;
import framework.engine.selenium.SeleniumTestBase;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static framework.engine.utils.Constants.BASE_URL_AUT;

public class RBO_0012HA extends SeleniumTestBase {
    RumboHomePageH rumbo;

    @Test
    public void test012() throws IOException {
        rumbo = new RumboHomePageH(DriverFactory.getDriver());
        rumbo.navigateTo(BASE_URL_AUT);
        rumbo.acceptCookie();
        rumbo.clickNavMenuHoteles();
        rumbo.scrollDown();
        rumbo.scrollDown();
        rumbo.scrollDown();
        rumbo.ideashotelesEsp();
        rumbo.clickhoteles();
        rumbo.fechasyViajeros();
        rumbo.otrovuelos();
        rumbo.filtroS();
        //rumbo.estrellas();
        rumbo.reservaHoToS();
        rumbo.screenShotP("Reserva_top_secret012");


    }

}
