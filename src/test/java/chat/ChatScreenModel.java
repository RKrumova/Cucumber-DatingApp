package chat;

import controllers.ChatController;
import controllers.UserController;
import lombok.AllArgsConstructor;
import lombok.Getter;
import model.Chat;
import model.Message;
import model.User;
import model.*;
import org.apache.commons.lang3.StringUtils;

import java.util.List;
@AllArgsConstructor
@Getter
public class ChatScreenModel{
    private Chat chat;
    private User sender;
    private User receiver;
    private List<String> messages;
    private String sendingResult;
    private User users;
    private UserController userController;

    public ChatScreenModel() {
        chat = new Chat(null, null, null);
    }


    public void setSender(String userSender) {

        User sender = userController.findUserByUsername(userSender);
        chat.setSender(sender);
    }



    public void setReceiver(String userReceiver) {
        User receiver = userController.findUserByUsername(userReceiver);
        chat.setSender(receiver);
    }

    public void checkMatch(String isMatched) {

    }

    public void sendMessage(String text) {
        Message message = new Message(chat.getUser1(), chat.getUser2(), text);
        chat.addMessage(message);
    }

    public void checkIfReceived(String messageReceived) {
        boolean isReceived = false;
        for(Message message: chat.getMessages()){
            if(StringUtils.equals(message.getText(), messageReceived)){
                isReceived = true;
                break;
            }
        }
    }
}
