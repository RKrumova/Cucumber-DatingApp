package model;

import java.util.Date;

public class Payment {
    private double amount;
    private String description;
    private Date timestamp;

    public Payment(double amount, String description) {
        this.amount = amount;
        this.description = description;
        this.timestamp = new Date();
    }

    // getters and setters
    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }
}
