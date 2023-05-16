package chat;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import model.Chat;

public class ChatSteps {
    private ChatScreenModel chatScreenModel;
    private Chat chat;
    @Given("Имаме празен чат:")
    public void emtyChatScreen() {
        chatScreenModel = new ChatScreenModel();
    }
    @When("Имаме потребител изпращател{string}")
    public void setSender(String userSender) {
        chatScreenModel.setSender(userSender);
    }
    @When("Имаме потребител получател{string}")
    public void setReceiver(String userReceiver) {
        chatScreenModel.setReceiver(userReceiver);
    }
    @When("Получаваме видът връзка която имaт {string}")
    public void checkMatch(String isMatched) {
        chatScreenModel.checkMatch(isMatched);
    }
    @When("Изпратим някакво съобщение {string}")
    public void sendMessage(String text) {
        chatScreenModel.sendMessage(text);
    }
    @Then("Проверяваме дали е получено съобщението {string}")
    public void checkIfReceived(String messageReceived) {
        chatScreenModel.checkIfReceived(messageReceived);
    }

}
