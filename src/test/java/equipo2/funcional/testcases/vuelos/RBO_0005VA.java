package equipo2.funcional.testcases.vuelos;

import equipo2.funcional.pages.RumboHomePageC;
import equipo2.funcional.pages.RumboHomePageV;
import framework.engine.selenium.DriverFactory;
import framework.engine.selenium.SeleniumTestBase;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static framework.engine.utils.Constants.BASE_URL_AUT;

public class RBO_0005VA extends SeleniumTestBase {
    RumboHomePageV rumbo;
    @Test
    public void test5(){
        rumbo = new RumboHomePageV(DriverFactory.getDriver());
        rumbo.navigateTo(BASE_URL_AUT);
        rumbo.acceptCookie();
        rumbo.clickMenuVuelo();
    }

    public class RBO_005VA extends SeleniumTestBase {

        RumboHomePageC.RumboHomePageV rumbo;

        @Test
        public void Test5() throws IOException {
            rumbo = new RumboHomePageC.RumboHomePageV(DriverFactory.getDriver());
            rumbo.navigateTo(BASE_URL_AUT);
            rumbo.acceptarCookies();
            rumbo.clickVuelos();
            rumbo.btnsoloIda();
            rumbo.origeninputClick();
            rumbo.destinoInputClick();
            rumbo.clickBuscar();
            rumbo.clickPrimerVuelo();
            rumbo.waitClickElegirFlexible();
            rumbo.rellenarDatos();
            rumbo.clickTarifa();
            rumbo.scrollDown();
            rumbo.clickProteccionTotal();
            rumbo.clickElegirAsiento();
          //  rumbo.ningunAsiento();
          //  rumbo.clickAsiento();
          //  rumbo.clickSaltar();
            rumbo.screenShotP("Validación_final");
        }
    }
}
