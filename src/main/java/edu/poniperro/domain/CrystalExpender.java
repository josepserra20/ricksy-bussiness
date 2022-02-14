package edu.poniperro.domain;

public class CrystalExpender implements GuestDispatcher {

    private int stock = 0;
    private double itemCost = 50;

    public CrystalExpender(int stock, double itemCost) {
        this.stock = stock;
        this.itemCost = itemCost;
    }

    public void dispatch(CreditCard client) {
        if(this.stock > 0) {
            if(client.pay(this.itemCost)) {
                    this.stock += - 1;
            };
        }
    }
    
    public String toString() {
        return "stock: " + stock()
        + "\n" + 
        "cost: " + this.itemCost;

    }

    public int stock() {
        return this.stock;
    }
}
