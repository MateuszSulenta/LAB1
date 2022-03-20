package pl.lublin.wsei.java.cwiczenia;

import static java.lang.Math.log;

public class Main {
    static final String FORMAT = "%-10s%-10s%-10s%n";

    public static void main(String[] args) {
        System.out.printf(FORMAT, "arg", "log2", "pow");
        for (int arg = 1, pow = 1; arg < 5; arg *= 2, pow++) {
            print(arg, log2(arg), sumPowers(pow));
        }
    }

    static int log2(int arg) {
        return (int) (log(arg) / log(2));
    }

    static int sumPowers(int arg) {
        var sum = 0;
        for (int i = 0; i < arg; i++) {
            sum += Math.pow(2, i);
        }
        return sum;
    }

    static void print(int arg, int log2, int pow) {
        System.out.printf(FORMAT, arg, log2, pow);
    }
}

