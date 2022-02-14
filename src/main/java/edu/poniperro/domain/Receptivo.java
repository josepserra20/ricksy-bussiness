package edu.poniperro.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Receptivo {
    
   private List<GuestDispatcher> observers1 = new ArrayList<>();
    
    public Receptivo() {};

    public void registra(GuestDispatcher observers) {
        observers1.add(observers);
    }

    public void dispatch(CreditCard card) {
        for ( GuestDispatcher observer : observers1) {
            observer.dispatch(card);
        }
    }
    
}
