package chat;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ChatSteps {

    @Given("Имаме празен чат:")
    public void emtyChatScreen() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("Имаме потребител изпращател{string}")
    public void hasSender(String userSender) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("Имаме потребител получател{string}")
    public void hasReceiver(String userReceiver) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("Получаваме видът връзка която имat {string}")
    public void checkMatch(String isMatched) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("Изпратим някакво съобщение {string}")
    public void sendMessage(String messageSend) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("Проверяваме дали е получено съобщението {string}")
    public void checkIfRecieved(String messageReceived) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
