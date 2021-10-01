package cs201labs.lab3;

import java.util.Scanner;

public class Hwq4 {
    public static void main(String[] args) {
        double weight,calories;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter weight");
        weight = input.nextDouble();
        calories = weight *19;
        System.out.println(calories);
        input.close();
    }

}
