/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.fizzbuzz3;

/**
 *
 * @author siakagassama
 */
public class FizzBuzzFactory {

    private Fizz fizz = new Fizz();
    private Buzz buzz = new Buzz();
    private FizzBuzz fizz_buzz = new FizzBuzz();
    private Lucky lucky = new Lucky();

    public Fizz_Buzz_Or_FizzBuzzer getFizzBuzzer(String buzzType) {
        Fizz_Buzz_Or_FizzBuzzer buzzer = null;

        if (buzzType.equalsIgnoreCase("Lucky")) {
            buzzer = lucky;

        } else if (buzzType.equalsIgnoreCase("Fizz")) {
            buzzer = fizz;

        } else if (buzzType.equalsIgnoreCase("Buzz")) {
            buzzer = buzz;

        } else if (buzzType.equalsIgnoreCase("FizzBuzz")) {
            buzzer = fizz_buzz;
        }

        return buzzer;
    }
}
