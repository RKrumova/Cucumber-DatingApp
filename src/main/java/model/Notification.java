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
