/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.fizzbuzz3;

import com.mycompany.fizzbuzz3.FizzBuzz;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author siakagassama
 */
public class FizzBuzzTest {
    
    public FizzBuzzTest() {
    }

    /**
     * Test of value method, of class FizzBuzz.
     */
    @Test
    public void testValue() {
        System.out.println("value from FizzBuzz should return 'FizzBuzz'");
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("FizzBuzz", fizzBuzz.value());
    }
    
}
