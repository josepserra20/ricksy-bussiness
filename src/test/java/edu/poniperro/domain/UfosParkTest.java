package edu.poniperro.domain;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class UfosParkTest {

    UfosPark ufos = null;
    String[] ovnis = {"unx", "dox", "trex"};
    
    @Before
    public void setUp() {
        ufos = new UfosPark();
        for (String ovni : ovnis) {
			ufos.add(ovni);
        }
    }
    
    @Test
    public void addUfoTest() {
        Arrays.sort(ovnis);
        assertEquals(List.of(ovnis).toString(),ufos.toString());
    }
}
