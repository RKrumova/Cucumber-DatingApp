package model;

import java.util.Date;

public class Swipe {
    private User user;
    private boolean direction; // true for right, false for left
    private Date timestamp;

    public Swipe(User user, boolean direction) {
        this.user = user;
        this.direction = direction;
        this.timestamp = new Date();
    }

    public User getUser() {
        return user;
    }

    public boolean getDirection() {
        return direction;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setDirection(boolean direction) {
        this.direction = direction;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }
}
