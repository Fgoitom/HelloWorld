package cs201labs.lab3;

import java.util.Scanner;

public class Hwq2 {
    public static void main(String[] args) {

        int cm;
        double inches;
        Scanner input = new Scanner (System.in);
        System.out.println("Enter any number");
        cm=input.nextInt();
        double in = cm/2.54;
        System.out.println(in +" inches");
        int ft = (int) in/12;
        System.out.println(ft + " feet");
        inches= in %12;
        System.out.println(inches + " inches");
        input.close();

    }
}
