package model;

import java.util.ArrayList;
import java.util.List;

public class Chat extends Message {
    private User user1;
    private User user2;
    private List<Message> messages;

    public Chat(User from, User to, String text) {
        super(from, to, text);
    }

    // getters and setters
    public User getUser1() {
        return user1;
    }

    public void setUser1(User user1) {
        this.user1 = user1;
    }

    public User getUser2() {
        return user2;
    }

    public void setUser2(User user2) {
        this.user2 = user2;
    }

    public List<Message> getMessages() {
        return messages;
    }

    public void setMessages(List<Message> messages) {
        this.messages = messages;
    }

    // other methods
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
/**
In this example, the Chat class has three attributes: user1, user2, and messages. The user1 and user2 attributes represent the two users who are participating in the chat, while the messages attribute is a list of all the messages exchanged between the users.

        The class has a constructor that takes in user1 and user2, sets the corresponding attributes, and initializes the messages list to an empty ArrayList.

        The class also has getter and setter methods for each attribute to allow for accessing and modifying the chat's users and messages.

        The class has two additional methods: addMessage() and getMessageCount(), which allow messages to be added to the chat and the total number of messages to be retrieved, respectively. It also has a getMessage() method, which allows a specific message to be retrieved from the chat by index.

        You could add more methods to the Chat class as needed, such as methods for filtering or sorting the messages, or for calculating statistics about the chat history (such as the average message length or the time between messages).
*/