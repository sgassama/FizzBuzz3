/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.fizzbuzz3;

import com.mycompany.fizzbuzz3.Buzz;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author siakagassama
 */
public class BuzzTest {

    public BuzzTest() {
    }

    /**
     * Test of value method, of class Buzz.
     */
    @Test
    public void testValue() {
        System.out.println("value from Buzz should return 'Buzz'");
        Buzz buzz = new Buzz();
        assertEquals("Buzz", buzz.value());
    }

}
