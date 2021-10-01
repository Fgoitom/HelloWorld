package cs201labs;

import java.util.Scanner;

public class Hwq2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the first middle and last name, ");
        String fName = input.next();
        String mName = input.next();
        String lName = input.next();
        System.out.println(fName + " "+ mName.charAt(0) +  "." + " "+lName);
        input.close();
    }
}