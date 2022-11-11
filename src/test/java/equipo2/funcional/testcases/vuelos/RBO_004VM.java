package equipo2.funcional.testcases.vuelos;

import equipo2.funcional.pages.RumboHomePageV;
import framework.engine.selenium.DriverFactory;
import framework.engine.selenium.SeleniumTestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static framework.engine.utils.Constants.BASE_URL_AUT;

public class RBO_004VM extends SeleniumTestBase {

    RumboHomePageV rumbo;

    @Test
    public void Test4(){
        rumbo = new RumboHomePageV(DriverFactory.getDriver());
        rumbo.navigateTo(BASE_URL_AUT);
        rumbo.acceptCookie();
        rumbo.clickMenuVuelo();
        //Posible doble cookie
        rumbo.origeninputClick();
        rumbo.destinoInputClick();
        rumbo.pasajeros();
        rumbo.claseCabina();
        //rumbo.fechaDeIdaVuelta();
        rumbo.buscarVuelo();
      /*Seleccion de filtro - bloqueo de xpath tarjetas

         rumbo.variasComanias();
         rumbo.elMejorP();
       */
        rumbo.primeraOpcionNormal();
        rumbo.opcionServiciosClassc();
        rumbo.scrollDown();
        rumbo.asistenciaEspecial();
        Assertions.assertEquals("Pasajero puede subir y bajar escalones (WCHR)", rumbo.textoAsistencia1());
        Assertions.assertEquals("Pasajero no puede subir ni bajar escalones (WCHS)", rumbo.textoAsistencia2());
        Assertions.assertEquals("Pasajero es completamente inmóvil con silla de ruedas propia (WCHC)", rumbo.textoAsistencia3());



    }



}
