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
public class FizzBuzzUtils {

    public FizzBuzzUtils() {
    }

    public Boolean isNotFizzBuzz(Integer valueToCheck) {
        return !isLucky(valueToCheck) && !isFizz(valueToCheck) && !isBuzz(valueToCheck) && !isFizzBuzz(valueToCheck);
    }

    public String getFizzBuzzType(Integer valueToCheck) {
        String fizzBuzzType = null;

        if (isLucky(valueToCheck)) {
            fizzBuzzType = "Lucky";
        } else if (isFizzBuzz(valueToCheck)) {
            fizzBuzzType = "FizzBuzz";
        } else if (isBuzz(valueToCheck)) {
            fizzBuzzType = "Buzz";
        } else if (isFizz(valueToCheck)) {
            fizzBuzzType = "Fizz";
        }

        return fizzBuzzType;
    }

    private Boolean isLucky(Integer valueToCheck) {
        Boolean isLucky = false;
        String numToString = valueToCheck.toString();

        if (numToString.contains("3")) {
            isLucky = true;
        }

        return isLucky;
    }

    private Boolean isFizz(Integer valueToCheck) {
        return valueToCheck != 3 && valueToCheck % 3 == 0;
    }

    private Boolean isBuzz(Integer valueToCheck) {
        return valueToCheck % 5 == 0;
    }

    private Boolean isFizzBuzz(Integer valueToCheck) {
        return valueToCheck % 15 == 0;
    }
}
