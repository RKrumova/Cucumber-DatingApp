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
/**
 In this example, the Payment class has three attributes: amount, description, and timestamp. The amount attribute represents the amount of the payment, the description attribute provides a brief explanation of the payment, and the timestamp attribute represents the time the payment was processed.

 The class has a constructor that takes in an amount and a description, sets the corresponding attributes, and initializes the timestamp to the current time using the Date() constructor.

 The class also has getter and setter methods for each attribute to allow for accessing and modifying the payment's details.

 You could add more attributes to the Payment class as needed, such as a payment ID or a payment status (e.g., pending, processed, declined). Additionally, you may want to consider incorporating payment processing functionality from a payment service provider (such as Stripe or PayPal) into your payment class to handle payment transactions securely and efficiently.

 * */