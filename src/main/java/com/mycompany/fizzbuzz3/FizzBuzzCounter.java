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
public class FizzBuzzCounter {
    private Integer integerCouont = 0;
    private Integer fizzCount = 0;
    private Integer luckyCount = 0;
    private Integer buzzCount = 0;
    private Integer fizzBuzzCount = 0;
    private FizzBuzzUtils utils;

    public FizzBuzzCounter(FizzBuzzUtils utils) {
        this.utils = utils;
    }
    
    public void incrementIntegerCount() {
        integerCouont++;
    }

    public String incrementFizzBuzzCount(Integer valueToCheck) {
        String fizzBuzzType = null;

        if (this.utils.getFizzBuzzType(valueToCheck) == "Lucky") {
            incrementLuckyBuzzCount();
        } else if (this.utils.getFizzBuzzType(valueToCheck) == "FizzBuzz") {
            incrementFizzBuzzCount();
        } else if (this.utils.getFizzBuzzType(valueToCheck) == "Buzz") {
            incrementBuzzCount();
        } else if (this.utils.getFizzBuzzType(valueToCheck) == "Fizz") {
            incrementFizzCount();
        }

        return fizzBuzzType;
    }

    public String reportCount() {
        String fbCount = "\n";
        fbCount += "Integer: " + integerCouont + "\n";
        fbCount += "Fizz: " + fizzCount + "\n";
        fbCount += "Buzz: " + buzzCount + "\n";
        fbCount += "FizzBuzz: " + fizzBuzzCount + "\n";
        fbCount += "Lucky: " + luckyCount + "\n";

        return fbCount;
    }
    
    private void incrementLuckyBuzzCount() {
        luckyCount++;
    }
    
    private void incrementFizzBuzzCount() {
        fizzBuzzCount++;
    }
    
    private void incrementBuzzCount() {
        buzzCount++;
    }
    
    private void incrementFizzCount() {
        fizzCount++;
    }
}
