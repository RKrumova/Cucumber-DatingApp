package chat;

import controllers.ChatController;
import lombok.AllArgsConstructor;
import lombok.Getter;
import model.User;

import java.util.List;
@AllArgsConstructor
@Getter
public class ChatScreenModel{
    private User sender;
    private User receiver;
    private List<String> messages;
    private String sendingResult;

    public ChatScreenModel() { }
    public void addMessage(String message) {
        messages.add(message);
    }

    void setSender() {
    }

    void setReceiver() {
    }

     void checkMatch() {
    }

    public boolean checkDelivery(String messageReceived) {
        return true;
    }
}
