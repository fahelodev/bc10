package equipo2.funcional.testcases.cruceros;
import equipo2.funcional.pages.RumboHomePageC;
import framework.engine.selenium.DriverFactory;
import framework.engine.selenium.SeleniumTestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static framework.engine.utils.Constants.BASE_URL_AUT;

public class RBO_0016CM extends SeleniumTestBase {

    RumboHomePageC rumbo;

    @Test
    public void test0016() throws IOException {
        rumbo = new RumboHomePageC(DriverFactory.getDriver());
        rumbo.navigateTo(BASE_URL_AUT);
        rumbo.acceptCookie();
        rumbo.botonVerMas();
        rumbo.puertoSeleccion();
        rumbo.botonBuscar();
        rumbo.seleccionDestinoC();
        rumbo.rellenarCampos();
        Assertions.assertEquals("Barcelona - Palma de Mallorca - Palermo - Civitavecchia, Roma - Savona - Marsella - Barcelona", rumbo.textociudades());
        rumbo.screenShotP("Crucero_Barcelona_016");

    }
}
