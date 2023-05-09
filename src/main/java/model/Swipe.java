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
/**In this implementation, the Swipe class has three instance variables: user, direction, and timestamp. The user variable is an instance of the User class and represents the user who performed the swipe. The direction variable is a boolean value that represents the direction of the swipe (true for right, false for left). The timestamp variable is a java.util.Date object that represents the time at which the swipe occurred.

 The Swipe class has a constructor that takes a User object and a boolean value as parameters. The constructor sets the user and direction instance variables to the provided values, and sets the timestamp instance variable to the current time using the new Date() method.

 The Swipe class also has getters and setters for each of its instance variables. These methods allow other parts of the code to access and modify the state of a Swipe object.
 * */