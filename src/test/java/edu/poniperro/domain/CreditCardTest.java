package edu.poniperro.domain;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

// import edu.poniperro.domain.CreditCard;

public class CreditCardTest {

    private CreditCard card = null;

    @Before
    public void setupCard() {
        card = new CreditCard("josep","123456789");
        assertNotNull("CredirCard creada", card);
        
    }

    @Test
    public void ConstructorTest() {
        assertNotNull("CreditCard creada", card);
        assertNotNull("123456789", card.number());
    }

    @Test
    public void PayTest() {
        card.pay(3000);
        assertEquals(0, card.credit(),0);
    }
    
}
