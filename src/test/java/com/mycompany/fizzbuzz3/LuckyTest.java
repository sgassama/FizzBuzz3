/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.fizzbuzz3;

import com.mycompany.fizzbuzz3.Lucky;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author siakagassama
 */
public class LuckyTest {

    public LuckyTest() {
    }

    /**
     * Test of value method, of class Lucky.
     */
    @Test
    public void testValue() {
        System.out.println("value from Lucky should return 'Lucky'");
        Lucky lucky = new Lucky();
        assertEquals("Lucky", lucky.value());
    }

}
