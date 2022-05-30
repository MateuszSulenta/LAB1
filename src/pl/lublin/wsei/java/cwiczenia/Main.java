package pl.lublin.wsei.java.cwiczenia;
import pl.lublin.wsei.java.mylib.Account;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner skaner = new Scanner(System.in);
        System.out.println("Wprowadź liczbę");


        int myNumber = Integer.parseInt(skaner.nextLine());

        System.out.println("DEC = " +
                myNumber +
                ", BIN = " +
                leftPad(Integer.toBinaryString(myNumber), '0', 8) +
                ", " +
                "HEX = " +
                "%" +
                leftPad(Integer.toHexString(myNumber).toUpperCase(), '0', 4));

        Account acc = new Account();
        acc.setName("piotr Gołąbek");
        System.out.println(acc.getName());


    }

    private static String leftPad(String aText, char aChar, int aWidth) {
        String res = aText;
        for (int i = 0; i < aWidth - aText.length(); i++)
            res = aChar + res;
        return res;
    }
}
