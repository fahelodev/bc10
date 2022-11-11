package equipo2.funcional.testcases.hoteles;


import equipo2.funcional.pages.RumboHomePageH;
import framework.engine.selenium.DriverFactory;
import framework.engine.selenium.SeleniumTestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static framework.engine.utils.Constants.BASE_URL_AUT;


public class RBO_008HB extends SeleniumTestBase {

    RumboHomePageH rumbo;

    @Test
    public void test008(){
        rumbo = new RumboHomePageH(DriverFactory.getDriver());
        rumbo.navigateTo(BASE_URL_AUT);
        rumbo.acceptCookie();
        rumbo.clickNavMenuHoteles();
        rumbo.destinoAlo();
        rumbo.fechaEntradaSalida();
        Assertions.assertEquals("Lo sentimos, no se pueden reservar más de 31 noches", rumbo.textErrorFecha());

    }

}
