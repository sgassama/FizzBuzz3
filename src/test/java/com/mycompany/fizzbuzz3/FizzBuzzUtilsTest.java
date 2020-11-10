/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.fizzbuzz3;

import com.mycompany.fizzbuzz3.FizzBuzzUtils;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author siakagassama
 */
public class FizzBuzzUtilsTest {
    private Integer FIZ_VALUE = 6;
    private Integer BUZZ_VALUE = 5;
    private Integer FIZBUZZ_VALUE = 15;
    private Integer NON_FIZZBUZZ_VALUE = 19;
    private Integer LUCKY_VALUE = 12123333;

    public FizzBuzzUtilsTest() {
    }

    /**
     * Test of isNotFizzBuzz method, of class FizzBuzzUtils.
     */
    @Test
    public void testIsOtherFizzBuzz() {
        System.out.println("isNotFizzBuzz should return true if a valuee that's not a factor of either 3, 5, or 15 is passed");
        FizzBuzzUtils fizzBuzzUtils = new FizzBuzzUtils();
        assertEquals(true, fizzBuzzUtils.isNotFizzBuzz(NON_FIZZBUZZ_VALUE), NON_FIZZBUZZ_VALUE + " returned false");
    }


    /**
     * Test of isNotFizzBuzz method, of class FizzBuzzUtils.
     */
    @Test
    public void testIsThreeFizzBuzz() {
        System.out.println("isNotFizzBuzz should return false if factor of 3 (except for 3 itself) is passed");
        FizzBuzzUtils fizzBuzzUtils = new FizzBuzzUtils();
        assertEquals(false, fizzBuzzUtils.isNotFizzBuzz(FIZ_VALUE), FIZ_VALUE + " returned true");
    }

    /**
     * Test of isNotFizzBuzz method, of class FizzBuzzUtils.
     */
    @Test
    public void testIsFiveFizzBuzz() {
        System.out.println("isNotFizzBuzz should return false if factor of 5 is passed");
        FizzBuzzUtils fizzBuzzUtils = new FizzBuzzUtils();
        assertEquals(false, fizzBuzzUtils.isNotFizzBuzz(BUZZ_VALUE), BUZZ_VALUE + " returned true");
    }

    /**
     * Test of isNotFizzBuzz method, of class FizzBuzzUtils.
     */
    @Test
    public void testIsFifteenFizzBuzz() {
        System.out.println("isNotFizzBuzz should return false if factor of 15 is passed");
        FizzBuzzUtils fizzBuzzUtils = new FizzBuzzUtils();
        assertEquals(false, fizzBuzzUtils.isNotFizzBuzz(FIZBUZZ_VALUE), FIZBUZZ_VALUE + " returned true");
    }

    /**
     * Test of getFizzBuzzType method, of class FizzBuzzUtils.
     */
    @Test
    public void testGetTypeFizz() {
        System.out.println("getFizzBuzzType should return 'Fizz' if " + FIZ_VALUE + " is passed");
        FizzBuzzUtils fizzBuzzUtils = new FizzBuzzUtils();
        assertEquals("Fizz", fizzBuzzUtils.getFizzBuzzType(FIZ_VALUE));
    }

    /**
     * Test of getFizzBuzzType method, of class FizzBuzzUtils.
     */
    @Test
    public void testGetTypeBuzz() {
        System.out.println("getFizzBuzzType should return 'Buzz' if " + BUZZ_VALUE + " is passed");
        FizzBuzzUtils fizzBuzzUtils = new FizzBuzzUtils();
        assertEquals("Buzz", fizzBuzzUtils.getFizzBuzzType(BUZZ_VALUE));
    }

    /**
     * Test of getFizzBuzzType method, of class FizzBuzzUtils.
     */
    @Test
    public void testGetTypeFizzBuzz() {
        System.out.println("getFizzBuzzType should return 'FizzBuzz' if " + FIZBUZZ_VALUE + " is passed");
        FizzBuzzUtils fizzBuzzUtils = new FizzBuzzUtils();
        assertEquals("FizzBuzz", fizzBuzzUtils.getFizzBuzzType(FIZBUZZ_VALUE));
    }

    /**
     * Test of getFizzBuzzType method, of class FizzBuzzUtils.
     */
    @Test
    public void testGetTypeLucky() {
        System.out.println("getFizzBuzzType should return 'Luckly' if value containing a 3 is passed");
        FizzBuzzUtils fizzBuzzUtils = new FizzBuzzUtils();
        assertEquals("Lucky", fizzBuzzUtils.getFizzBuzzType(LUCKY_VALUE));
    }

}
