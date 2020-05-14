package com.passwordTest;

public class NumberMisingEx extends Exception {

   private String num;

    public NumberMisingEx(String num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "Number missing in the password " + num;
    }
}
