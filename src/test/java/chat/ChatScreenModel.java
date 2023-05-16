package chat;

import controllers.ChatController;
import lombok.AllArgsConstructor;
import lombok.Getter;
import model.Chat;
import model.Message;
import model.User;

import java.util.List;
@AllArgsConstructor
@Getter
public class ChatScreenModel{
    private Chat chat;
    private User sender;
    private User receiver;
    private List<String> messages;
    private String sendingResult;
    public ChatScreenModel() {
        chat = new Chat(null, null, null);
    }


    public void setSender(String userSender) {
        User sender = findUserByUsername(userSender);
        chat.setSender(sender);
    }


    public void setReceiver(String userReceiver) {
        User receiver = findUserByUsername(userReceiver);
        chat.setSender(receiver);
    }

    public void checkMatch(String isMatched) {
        /cause error here so i know what i have left

    }

    public void sendMessage(String text) {
        Message message = new Message(chat.getUser1(), chat.getUser2(), text);
        chat.addMessage(message);
    }

    public void checkIfReceived(String messageReceived) {
        for(Message message: chat.getMessages()){
            message.getText().equals((messageReceived)){
                messageReceived = "true";
                break;
            }
        }
    }
}
