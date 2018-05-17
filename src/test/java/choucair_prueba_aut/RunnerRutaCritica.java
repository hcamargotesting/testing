package choucair_prueba_aut;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/Encuentrame_Planet_Choucair/Login" , tags="@rutacritica")
public class RunnerRutaCritica {

}
