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

    public void addMessage(User sender, User receiver, String content) {
    }

    public List<Message> getAllMessagesForUser(User user) {
        return null;
    }
}
