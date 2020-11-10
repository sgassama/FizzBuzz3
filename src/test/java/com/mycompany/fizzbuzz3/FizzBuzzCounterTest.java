/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.fizzbuzz3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author siakagassama
 */
public class FizzBuzzCounterTest {

    private Integer FIZ_VALUE = 6;
    private Integer BUZZ_VALUE = 5;
    private Integer FIZBUZZ_VALUE = 15;
    private Integer NON_FIZZBUZZ_VALUE = 19;
    private Integer LUCKY_VALUE = 12123333;

    public FizzBuzzCounterTest() {
    }

    /**
     * Test of incrementIntegerCount method, of class FizzBuzzCounter.
     */
    @Test
    public void testIncrementIntegerCount() {
        System.out.println("should increment integer report value");
        FizzBuzzUtils fizzBuzzUtils = new FizzBuzzUtils();
        FizzBuzzCounter fbc = new FizzBuzzCounter(fizzBuzzUtils);

        assertEquals(true, fbc.reportCount().contains("Integer: 0"));
        fbc.incrementIntegerCount();
        assertEquals(true, fbc.reportCount().contains("Integer: 1"));
    }

    /**
     * Test of incrementFizzBuzzCount method, of class FizzBuzzCounter.
     */
    @Test
    public void testIncrementFizzCount() {
        System.out.println("should increment Fizz report value");
        FizzBuzzUtils fizzBuzzUtils = new FizzBuzzUtils();
        FizzBuzzCounter fbc = new FizzBuzzCounter(fizzBuzzUtils);

        assertEquals(true, fbc.reportCount().contains("Fizz: 0"));
        fbc.incrementFizzBuzzCount(FIZ_VALUE);
        assertEquals(true, fbc.reportCount().contains("Fizz: 1"));
    }

    /**
     * Test of incrementFizzBuzzCount method, of class FizzBuzzCounter.
     */
    @Test
    public void testIncrementBuzzCount() {
        System.out.println("should increment Buzz report value");
        FizzBuzzUtils fizzBuzzUtils = new FizzBuzzUtils();
        FizzBuzzCounter fbc = new FizzBuzzCounter(fizzBuzzUtils);

        assertEquals(true, fbc.reportCount().contains("Buzz: 0"));
        fbc.incrementFizzBuzzCount(BUZZ_VALUE);
        assertEquals(true, fbc.reportCount().contains("Buzz: 1"));
    }

    /**
     * Test of incrementFizzBuzzCount method, of class FizzBuzzCounter.
     */
    @Test
    public void testIncrementFizzBuzzCount() {
        System.out.println("should increment FizzBuzz report value");
        FizzBuzzUtils fizzBuzzUtils = new FizzBuzzUtils();
        FizzBuzzCounter fbc = new FizzBuzzCounter(fizzBuzzUtils);

        assertEquals(true, fbc.reportCount().contains("FizzBuzz: 0"));
        fbc.incrementFizzBuzzCount(FIZBUZZ_VALUE);
        assertEquals(true, fbc.reportCount().contains("FizzBuzz: 1"));
    }

    /**
     * Test of incrementFizzBuzzCount method, of class FizzBuzzCounter.
     */
    @Test
    public void testIncrementLuckyCount() {
        System.out.println("should increment Lucky report value");
        FizzBuzzUtils fizzBuzzUtils = new FizzBuzzUtils();
        FizzBuzzCounter fbc = new FizzBuzzCounter(fizzBuzzUtils);

        assertEquals(true, fbc.reportCount().contains("Lucky: 0"));
        fbc.incrementFizzBuzzCount(LUCKY_VALUE);
        assertEquals(true, fbc.reportCount().contains("Lucky: 1"));
    }

    /**
     * Test of reportCount method, of class FizzBuzzCounter.
     */
    @Test
    public void testReportCount() {
        FizzBuzzUtils fizzBuzzUtils = new FizzBuzzUtils();
        FizzBuzzCounter fbc = new FizzBuzzCounter(fizzBuzzUtils);

        fbc.incrementIntegerCount();
        fbc.incrementFizzBuzzCount(FIZ_VALUE);
        fbc.incrementFizzBuzzCount(BUZZ_VALUE);
        fbc.incrementFizzBuzzCount(FIZBUZZ_VALUE);
        fbc.incrementFizzBuzzCount(LUCKY_VALUE);

        assertEquals("\nInteger: 1\n"
                + "Fizz: 1\n"
                + "Buzz: 1\n"
                + "FizzBuzz: 1\n"
                + "Lucky: 1\n", fbc.reportCount());
    }

}
