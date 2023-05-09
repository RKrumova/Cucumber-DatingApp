package model;

import javax.xml.stream.Location;
import java.util.ArrayList;

public class Match {
    private User user1;
    private User user2;
    private int compatibilityScore;
    private ArrayList<String> sharedInterests;
    private Location location;

    public Match(User user1, User user2, int compatibilityScore, ArrayList<String> sharedInterests, Location location) {
        this.user1 = user1;
        this.user2 = user2;
        this.compatibilityScore = compatibilityScore;
        this.sharedInterests = sharedInterests;
        this.location = location;
    }

    public User getUser1() {
        return user1;
    }

    public User getUser2() {
        return user2;
    }

    public int getCompatibilityScore() {
        return compatibilityScore;
    }

    public ArrayList<String> getSharedInterests() {
        return sharedInterests;
    }

    public Location getLocation() {
        return location;
    }
}
