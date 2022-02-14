package edu.poniperro.domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class UfosPark implements GuestDispatcher {

    private double fee = 500;

    private Map<String,String> flota = new HashMap<String,String>();

    public UfosPark() {};

    public void add(String ovni) {
        flota.putIfAbsent(ovni, null);
    }

    public void dispatch(CreditCard client) {
        if (!flota.containsValue(client.number())) {
            for (Map.Entry<String, String> entry : flota.entrySet()) {
                if ((entry.getValue() == null) && client.pay(this.fee)) {
                    flota.replace(entry.getKey(),client.number());
                    break;
                };
               }
            //    System.out.print(flota);
        }
    }

   public String getUfoOf(String cardNumber) {
       String ufo = null;
    if (this.flota.containsValue(cardNumber)) {
        for (Map.Entry<String, String> entry : flota.entrySet()) {
            if (cardNumber == entry.getValue()) {
                ufo = entry.getKey();
                return ufo;
            }
            };
            
           }
           return ufo;
}



   public boolean containsCard(String flag) {
        return false;
   }

   public Collection<String> cardNumber() {
        return this.flota.values();
   }

    public String toString() {
        List<String> ufos = new ArrayList<>();
        for (String key : flota.keySet()) {
            ufos.add(key);
           }
           List<String> sortedList = ufos.stream().sorted().collect(Collectors.toList());  
        return sortedList.toString();
           
    }
}
