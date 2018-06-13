package choucair_prueba_aut;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/SmartDealer/Login" , tags="@Venta_prepago_nuevo_smartdealer")
//@CucumberOptions(features = "src/test/resources/features/SmartDealer/Login" , tags="@ingreso_planet")

public class RunnerFeatures {

}