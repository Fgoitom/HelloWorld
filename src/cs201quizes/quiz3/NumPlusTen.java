package cs201quizes.quiz3;

import java.util.Scanner;

public class NumPlusTen {
    public static void printNextInt(){
        Scanner input = new Scanner (System.in);
        System.out.println("Enter any number");
        int num = input.nextInt();
        int sum = num + 1;
        for (int r = 0; r<=10; r++){
            for (int c = 0 ; c<1; c++)
                System.out.print(r+c+ sum + " ");
        }
    }

    public static void main(String[] args) {
        printNextInt();
    }

}
