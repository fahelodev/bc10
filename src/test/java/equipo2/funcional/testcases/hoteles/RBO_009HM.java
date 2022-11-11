package equipo2.funcional.testcases.hoteles;

import equipo2.funcional.pages.RumboHomePageH;
import framework.engine.selenium.DriverFactory;
import framework.engine.selenium.SeleniumTestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static framework.engine.utils.Constants.BASE_URL_AUT;

public class RBO_009HM extends SeleniumTestBase {
    RumboHomePageH rumbo;

    @Test
    public void test009() throws IOException {
        rumbo = new RumboHomePageH(DriverFactory.getDriver());
        rumbo.navigateTo(BASE_URL_AUT);
        rumbo.acceptCookie();
       /* Pendinte
        rumbo.loginRumbo();*/
        rumbo.clickNavMenuHoteles();
        rumbo.hotelesConespa();
        rumbo.scrollDown();
        rumbo.agregarOtraPersona();
        rumbo.screenShotP("Habitacion_con_desayuno009");
        Assertions.assertEquals("Alojamiento y desayuno",rumbo.detalleviaje());

    }
}
