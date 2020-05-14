package com.passwordTest;

public class SpecialCharMissing extends Exception {

    private String spechar;

    public SpecialCharMissing(String spechar) {
        this.spechar = spechar;
    }


    @Override
    public String toString() {
        return "Special Character missing" + spechar;
    }
}
