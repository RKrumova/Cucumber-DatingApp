package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
@Getter
@Setter
public class Message {
    private User sender;
    private User receiver;
    private String text;
    private LocalDateTime timestamp;

    public Message(User sender, User receiver, String text) {
        this.sender = sender;
        this.receiver = receiver;
        this.text = text;
        this.timestamp = LocalDateTime.now();
    }

}
