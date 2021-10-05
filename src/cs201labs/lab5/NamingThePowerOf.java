package cs201labs.lab5;

import java.util.Scanner;

public class NamingThePowerOf {
    public static void main(String[] args) {
        int num;
        Scanner input = new Scanner (System.in);
        System.out.println("Enter any number");
        num = input.nextInt();
        if (num==6){
            System.out.println("Million");
        } else if (num==9){
            System.out.println("Billion");
        }
        else if (num==12){
            System.out.println("Trillion");
        } else if (num==15){
            System.out.println("Quadrillion");
        }else if (num==18){
            System.out.println("Quintillion");
        } else if (num==21){
            System.out.println("Sextillion");
        } else if (num==30){
            System.out.println("Nonillion");
        } else
            System.out.println("Googol");
    }


}
