package cs201labs.lab3;

import java.util.Scanner;

public class Hwq3 {
    public static void main(String[] args) {
        double c, f;
        Scanner input = new Scanner (System.in);
        System.out.println("Please enter temperature in Celsius");
        c = input.nextInt();
        f = 1.8 * c +32;
        System.out.println(f);
        input.close();

    }
}
