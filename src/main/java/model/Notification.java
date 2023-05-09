package model;

import java.util.Date;

public class Notification {
    private String title;
    private String message;
    private Date timestamp;

    public Notification(String title, String message) {
        this.title = title;
        this.message = message;
        this.timestamp = new Date();
    }

    // getters and setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }
}
/**
 In this example, the Notification class has three attributes: title, message, and timestamp. T
 he title and message attributes represent the content of the notification,
 while the timestamp attribute represents the time the notification was sent.

 The class has a constructor that takes in a title and message, sets the corresponding attributes,
 and initializes the timestamp to the current time using the Date() constructor.

 You could add more attributes to the Notification class as needed,
 such as an ID to uniquely identify each notification or a sender/receiver attribute to indicate who the notification is for.

 * */
/**
 * */