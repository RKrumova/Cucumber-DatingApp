package controllers;

import model.Message;
import model.User;

import java.util.ArrayList;
import java.util.List;

public class MessageController {
    private List<Message> messages;

    public MessageController() {
        this.messages = new ArrayList<>();
    }

    public void createMessage(User sender, User receiver, String content) {
        // Logic to create a new message between the sender and receiver
    }

    public List<Message> getAllMessagesForUser(User user) {
        // Logic to retrieve all messages for a given user
        return null;
    }
}
