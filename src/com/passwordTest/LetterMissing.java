package com.passwordTest;

public class LetterMissing extends Exception {
    private String let;


    public LetterMissing(String let) {
        this.let = let;
    }

    @Override
    public String toString() {
        return "Letter missing " + let;
    }
}
