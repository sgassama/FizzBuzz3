/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.fizzbuzz3;

import com.mycompany.fizzbuzz3.Buzz;
import com.mycompany.fizzbuzz3.Lucky;
import com.mycompany.fizzbuzz3.Fizz_Buzz_Or_FizzBuzzer;
import com.mycompany.fizzbuzz3.FizzBuzz;
import com.mycompany.fizzbuzz3.FizzBuzzFactory;
import com.mycompany.fizzbuzz3.Fizz;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author siakagassama
 */
public class FizzBuzzFactoryTest {
    
    public FizzBuzzFactoryTest() {
    }

    /**
     * Test of getFizzBuzzer method, of class FizzBuzzFactory.
     */
    @org.junit.jupiter.api.Test
    public void testGetNullFizzBuzzer() {
        System.out.println("getFizzBuzzer should return null if an empty string is passed");
        String fizzBuzzType = "";
        FizzBuzzFactory fizzBuzzFactory = new FizzBuzzFactory();
        Fizz_Buzz_Or_FizzBuzzer expResult = null;
        Fizz_Buzz_Or_FizzBuzzer buzzer = fizzBuzzFactory
                .getFizzBuzzer(fizzBuzzType);
        assertNull(buzzer, "Object is not null");
    }

    /**
     * Test of getFizzBuzzer method, of class FizzBuzzFactory.
     */
    @org.junit.jupiter.api.Test
    public void testGetFizz() {
        System.out.println("getFizzBuzzer should return Fizz type if Fizz is passed");
        String fizzBuzzType = "Fizz";
        FizzBuzzFactory fizzBuzzFactory = new FizzBuzzFactory();
        Fizz_Buzz_Or_FizzBuzzer expResult = null;
        Fizz_Buzz_Or_FizzBuzzer buzzer = fizzBuzzFactory
                .getFizzBuzzer(fizzBuzzType);
        assertTrue(buzzer instanceof Fizz, "Object is not of type Fizz");
    }

    /**
     * Test of getFizzBuzzer method, of class FizzBuzzFactory.
     */
    @org.junit.jupiter.api.Test
    public void testGetBuzz() {
        System.out.println("getFizzBuzzer should return Buzz type if Buzz is passed");
        String fizzBuzzType = "Buzz";
        FizzBuzzFactory fizzBuzzFactory = new FizzBuzzFactory();
        Fizz_Buzz_Or_FizzBuzzer expResult = null;
        Fizz_Buzz_Or_FizzBuzzer buzzer = fizzBuzzFactory
                .getFizzBuzzer(fizzBuzzType);
        assertTrue(buzzer instanceof Buzz, "Object is not of type Buzz");
    }

    /**
     * Test of getFizzBuzzer method, of class FizzBuzzFactory.
     */
    @org.junit.jupiter.api.Test
    public void testGetFizzBuzz() {
        System.out.println("getFizzBuzzer should return FizzBuzz type if FizzBuzz is passed");
        String fizzBuzzType = "FizzBuzz";
        FizzBuzzFactory fizzBuzzFactory = new FizzBuzzFactory();
        Fizz_Buzz_Or_FizzBuzzer expResult = null;
        Fizz_Buzz_Or_FizzBuzzer buzzer = fizzBuzzFactory
                .getFizzBuzzer(fizzBuzzType);
        assertTrue(buzzer instanceof FizzBuzz, "Object is not of type FizzBuzz");
    }

    /**
     * Test of getFizzBuzzer method, of class FizzBuzzFactory.
     */
    @org.junit.jupiter.api.Test
    public void testGetLucky() {
        System.out.println("getFizzBuzzer should return Lucky type if Lucky is passed");
        String fizzBuzzType = "Lucky";
        FizzBuzzFactory fizzBuzzFactory = new FizzBuzzFactory();
        Fizz_Buzz_Or_FizzBuzzer expResult = null;
        Fizz_Buzz_Or_FizzBuzzer buzzer = fizzBuzzFactory
                .getFizzBuzzer(fizzBuzzType);
        assertTrue(buzzer instanceof Lucky, "Object is not of type Lucky");
    }
    
}
