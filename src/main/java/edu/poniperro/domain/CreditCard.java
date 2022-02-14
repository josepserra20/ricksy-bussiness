package edu.poniperro.domain;

/**
 * CreditCard
 */
public class CreditCard {

    private String owner;
    private String number;
    private double credit = 3000;
    private String SYMBOL = "EZI";

    public CreditCard(String owner, String number) {
        this.owner = owner;
        this.number = number;
    }

    public boolean pay(double credit) {

        if (credit <= this.credit) {
            this.credit -= credit;
            return true;
            
        } else {
            return false;
        }
    }

    public String number() {
        return this.number;
    }

    public double credit() {
        return this.credit;
    }

    public String CardOwner() {
        return this.owner;
    }

    public String toString() {
        return "owner: " + CardOwner() + "\n" +
        "number: " + number() + "\n" +
        "Credit: " + credit() + " " + this.SYMBOL;
    }
    
}