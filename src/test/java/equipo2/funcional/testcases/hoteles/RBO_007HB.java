package equipo2.funcional.testcases.hoteles;

import equipo2.funcional.pages.RumboHomePageH;
import framework.engine.selenium.DriverFactory;
import framework.engine.selenium.SeleniumTestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static framework.engine.utils.Constants.BASE_URL_AUT;

public class RBO_007HB extends SeleniumTestBase {

    RumboHomePageH rumbo;

    @Test
    public void test007() throws IOException {
        rumbo = new RumboHomePageH(DriverFactory.getDriver());
        rumbo.navigateTo(BASE_URL_AUT);
        rumbo.acceptCookie();
        rumbo.clickNavMenuHoteles();
        rumbo.destinoAlo();
        rumbo.botonBuscarAlo();
        rumbo.filtros();
        // caido
        rumbo.box1buscar();
        rumbo.changeTab();
        rumbo.serviciosM();
        //rumbo.despli();
        rumbo.screenShotP("Servicios007");
        Assertions.assertEquals("Wifi gratis",rumbo.wifiValid());
        rumbo.comentarioshoteles();
        rumbo.screenShotP("Comentarios007");
    }


}