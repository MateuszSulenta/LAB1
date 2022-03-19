package pl.lublin.wsei.java.cwiczenia;

public class Main {

    public static void main(String[] args) {
        System.out.printf("alfa\tsin(alfa)\n");
        for (int i = 0; i < 370; i += 10)
            System.out.printf("%d\t%f\t\n", i, Math.sin(i / 360.0 * 2 * Math.PI));
    }
}

