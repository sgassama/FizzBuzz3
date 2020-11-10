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
public class Main {

    public static void main(String[] args) {

        FizzBuzzUtils fizzBuzzUtils = new FizzBuzzUtils();
        FizzBuzzCounter fbc = new FizzBuzzCounter(fizzBuzzUtils);

        int n = 20;

        for (int i = 1; i <= n; i++) {
            if (fizzBuzzUtils.isNotFizzBuzz(i)) {
                System.out.print(i + "\n");
                fbc.incrementIntegerCount();

            } else {
                FizzBuzzFactory fizzBuzzFactory = new FizzBuzzFactory();
                Fizz_Buzz_Or_FizzBuzzer fizzBuzzer = fizzBuzzFactory
                        .getFizzBuzzer(fizzBuzzUtils.getFizzBuzzType(i));
                System.out.print(fizzBuzzer.value() + "\n");
                fbc.incrementFizzBuzzCount(i);
            }

        }

        System.out.print(fbc.reportCount());
    }
}
