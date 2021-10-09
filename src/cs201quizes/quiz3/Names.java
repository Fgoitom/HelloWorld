package cs201quizes.quiz3;

import java.util.Scanner;

public class Names {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter first and last name");
        String fName= input.next();
        String lName= input.next();
        System.out.println(fName.toLowerCase().charAt(0) + lName.toLowerCase() + "@miu.edu");
            input.close();
    }
}
