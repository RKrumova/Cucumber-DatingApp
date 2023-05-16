package model;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
@Getter
@Setter
public class Chat extends Message {
    private User user1;
    private User user2;
    private List<Message> messages;

    public Chat(User from, User to, String text) {
        super(from, to, text);
    }


    public void addMessage(Message message) {
        this.messages.add(message);
    }

    public int getMessageCount() {
        return this.messages.size();
    }

    public Message getMessage(int index) {
        return this.messages.get(index);
    }

}
