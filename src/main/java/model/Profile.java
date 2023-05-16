package model;

import java.util.List;

public class Profile{
    private String bio;
    private List<String> interests;
    private String gender;
    private int age;
    private String location;

/*    public Profile(String bio, List<String> interests, String gender, int age, String location) {
        this.bio = bio;
        this.interests = interests;
        this.gender = gender;
        this.age = age;
        this.location = location;
    }*/

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public List<String> getInterests() {
        return interests;
    }

    public void setInterests(List<String> interests) {
        this.interests = interests;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
