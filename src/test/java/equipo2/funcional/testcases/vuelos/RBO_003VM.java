package equipo2.funcional.testcases.vuelos;

import equipo2.funcional.pages.RumboHomePageV;
import framework.engine.selenium.DriverFactory;
import framework.engine.selenium.SeleniumTestBase;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static framework.engine.utils.Constants.BASE_URL_AUT;

public class RBO_003VM extends SeleniumTestBase {
    RumboHomePageV rumbo;

    @Test
    public void pruebaVuelo03() throws IOException {
        rumbo = new RumboHomePageV(DriverFactory.getDriver());
        rumbo.navigateTo(BASE_URL_AUT);
        rumbo.acceptarCookies();
      /*  rumbo.miRumbo();
        rumbo.login();*/
        rumbo.clickVuelos();
        rumbo.origeninputClick();
        rumbo.destinoInputClick();
        rumbo.viajeros();
        rumbo.clase();
        rumbo.clickbucar();
        rumbo.precioNormal();
        rumbo.opcionClassic();
        rumbo.agregarPasajero();
        rumbo.pagarViaje2();
        rumbo.screenShotP("Validacion_Final_v2");
    }

}
