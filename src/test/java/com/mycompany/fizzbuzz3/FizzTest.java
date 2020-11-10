/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.fizzbuzz3;

import com.mycompany.fizzbuzz3.Fizz;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author siakagassama
 */
public class FizzTest {

    public FizzTest() {
    }

    /**
     * Test of value method, of class Fizz.
     */
    @Test
    public void testValue() {
        System.out.println("value from Fizz should return 'Fizz'");
        Fizz fizz = new Fizz();
        assertEquals("Fizz", fizz.value());
    }

}
