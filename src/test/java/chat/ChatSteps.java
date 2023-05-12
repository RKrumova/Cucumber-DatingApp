package chat;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ChatSteps {
    private ChatScreenModel chatScreenModel;
    @Given("Имаме празен чат:")
    public void emtyChatScreen() {
        chatScreenModel = new ChatScreenModel();
    }
    @When("Имаме потребител изпращател{string}")
    public void setSender(String userSender) {
        chatScreenModel.setSender();
    }
    @When("Имаме потребител получател{string}")
    public void setReceiver(String userReceiver) {
        chatScreenModel.setReceiver();
    }
    @When("Получаваме видът връзка която имaт {string}")
    public void checkMatch(String isMatched) {
        chatScreenModel.checkMatch();
    }
    @When("Изпратим някакво съобщение {string}")
    public void sendMessage(String text) {
        chatScreenModel.addMessage(text);
    }
    @Then("Проверяваме дали е получено съобщението {string}")
    public void checkIfReceived(String messageReceived) {
        chatScreenModel.checkDelivery(messageReceived);
    }
}
