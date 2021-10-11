package cs201labs.lab89;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the word");
        String word = input.nextLine();
        while(word !=""){
            Palindrome.pal(word);
        }System.out.println("Enter the word");
        word=input.nextLine();
    }

    public static void pal(String word){String reversed="";
    for (int i=(word.length()-1) ; i>=0 ; i--) {
        reversed+=(word.charAt(i));
    }if(reversed.equalsIgnoreCase(word))
        System.out.println("its a palindrome");
    else
        System.out.println("its not a palindrome");
}
}