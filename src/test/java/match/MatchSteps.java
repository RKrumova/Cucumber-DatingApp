package match;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class MatchSteps {
    @Given("Имаме екран с потребил и ние имаме потребителско име {string}")
    public void screenAndUser(String user) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("Имаме потребител {string}")
    public void hasUser(String user2) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("Плъзнете\\/преместваме на  {string}")
    public void swipeInformation(String swipeDirection) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("Получаваме отговор за {string}")
    public void swipeInformationUser2(String swipeDirectionUser2) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("Проверяваме дали съвпадат и получаваме {string}")
    public void matchMessageCheck(String matchMessage) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}
