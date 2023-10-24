import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import static org.junit.Assert.*;

public class StepDefinitions {

    boolean isAuthenticated;

    @Given("the user inserts a SmartCard")
    public void the_user_inserts_a_SmartCard() {
        // Code to insert SmartCard
    }

    @When("the system verifies the SmartCard")
    public void the_system_verifies_the_SmartCard() {
        // Code to verify SmartCard
        // For simplicity, let's assume it always authenticates successfully in this example
        isAuthenticated = true;
    }

    @Then("the user is authenticated")
    public void the_user_is_authenticated() {
        assertTrue(isAuthenticated);
    }

    @Then("the user is not authenticated")
    public void the_user_is_not_authenticated() {
        assertFalse(isAuthenticated);
    }
}