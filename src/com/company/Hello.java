package com.company;

//import javax.swing.*;

public class Hello {

    public static void main(String[] args) {
        String input = args[0];
        String string = "";
        int length =  input.length();
        for(int i = 0; i < length; i++){
            string = input.charAt(i) + string;
        }
        System.out.println(string);
    }
}
