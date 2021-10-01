package cs201labs.lab3;

import java.util.Scanner;

public class Hwq5 {
    public static void main(String[] args) {
        int yearBorn;
        int age;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the year you were born");
        yearBorn = input.nextInt();
        age= 2021 - yearBorn;
        System.out.println("You were born in " + yearBorn + " " + "and will be " + age + " " +"this year.");
        input.close();
    }
}
