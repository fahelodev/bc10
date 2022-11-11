package equipo2.funcional.testcases.vuelos;



import equipo2.funcional.pages.RumboHomePageV;
import framework.engine.selenium.DriverFactory;
import framework.engine.selenium.SeleniumTestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static framework.engine.utils.Constants.BASE_URL_AUT;

public class RBO_006VA extends SeleniumTestBase {
    RumboHomePageV rumbo;

    @Test
    public void Test6() throws IOException {
        rumbo = new RumboHomePageV(DriverFactory.getDriver());
        rumbo.navigateTo(BASE_URL_AUT);
        rumbo.acceptarCookies();
        rumbo.clickVuelos();
        rumbo.destinoInputClick();
        rumbo.origeninputClick();
        rumbo.clickBuscar();
        rumbo.clickPrimerVuelo();
        rumbo.waitClickElegirFlexible();
        rumbo.rellenarDatosdos();
        rumbo.clickTarifaDcto();
        rumbo.clickFullFlex();
        rumbo.clickSiguientedos();
        Assertions.assertEquals("Flexible", rumbo.textFlexible());
        //  Assertions.assertEquals("Protege tu equipaje", rumbo.textProtegerEquipaje());
        //  Assertions.assertEquals("FullFlex", rumbo.textFullFlex());
        rumbo.scrollDown();
        rumbo.screenShotP("Validacion_final2");
    }
}
