package com.passwordTest;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PassTest {

    private String filename = "C:\\dev\\PasswordTest\\filetext.txt";
    //change tha file path as you want or use a Scanner for input,for this application I've used a File
    private File file = new File(filename);
    private String passWord = null;


    public void test() {


        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            passWord = bufferedReader.readLine();
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("ERROR: File Not Found");
        } catch (IOException e) {
            System.out.println("ERROR: Could Read File");
        }


        try {


            if (!stringContainsNumber(passWord)) {

                throw new NumberMisingEx(passWord);
            }

        } catch (NumberMisingEx e) {
            System.out.println("ERROR: A Valid Password must contain a number, You entered  " + passWord);

        }


        try {
            if (!stringContainsLetter(passWord)) {

                throw new LetterMissing(passWord);
            }
        } catch (LetterMissing e) {

            System.out.println("ERROR: A Valid Password must contain a letter, You entered " + passWord);
        }


        try {
            if (!stringContainsSpecialCharacter(passWord)) {

                throw new SpecialCharMissing(passWord);
            }
        } catch (SpecialCharMissing e) {

            System.out.println("ERROR: A Valid Password must contain a Special Character, You entered  " + passWord);
        }


        try {

            if (passWord.length() != 17) {

                throw new PasswordLength(passWord);
            }

        } catch (PasswordLength e) {
            System.out.println("ERROR: A Valid Password must have a length of 17");
            System.out.println("Your PassWord length " + passWord.length());
        }


        System.out.println("Your password: " + passWord);

    }


    private boolean stringContainsNumber(String s) {

        Pattern p = Pattern.compile("\\d+");
        Matcher m = p.matcher(s);

        return m.find();

    }

    private boolean stringContainsLetter(String s) {

        Pattern p = Pattern.compile("[a-zA-Z]+");
        Matcher m = p.matcher(s);

        return m.find();

    }


    private boolean stringContainsSpecialCharacter(String s) {
        Pattern p = Pattern.compile("[!#$%&'()*+,-.\\/:;<=>?@\\[\\]^_`{|}~]");
        Matcher m = p.matcher(s);

        return m.find();
    }


}
