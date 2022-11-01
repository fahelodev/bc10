package framework.engine.bdd;

import framework.engine.selenium.DriverFactory;
import io.cucumber.java8.Scenario;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.qameta.allure.Allure;
import lombok.extern.apachecommons.CommonsLog;
import org.junit.runner.RunWith;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.time.Duration;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty", "io.qameta.allure.cucumber5jvm.AllureCucumber5Jvm"},
        glue = {"framework.testing.bdd.steps","framework.engine.bdd"},
        tags = {""},
        features = {"src/test/java/framework/testing/bdd/features"})
@CommonsLog
public class CucumberBaseTestRunner {

    public static WebDriver driver;

    public static void setUp(){
        driver = DriverFactory.initDriver();
        if (driver != null) {
            driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
            driver.manage().window().maximize();
        }
    }

    public static void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            try {
                File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);;
                InputStream targetStream = new FileInputStream(screenshot);
                System.setProperty("allure.results.directory", "build/allure-results");
                Allure.addAttachment("Screenshot on fail", "image/png", targetStream, "png");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        driver.manage().deleteAllCookies();
        if (driver != null) {
            driver.close();
        }
    }
}
