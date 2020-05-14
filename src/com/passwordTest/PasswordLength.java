package com.passwordTest;

public class PasswordLength extends Exception {

    private String len;

    public PasswordLength(String len) {
        this.len = len;
    }

    @Override
    public String toString() {
        return "Password length must be equal to 17 " + len;
    }
}
