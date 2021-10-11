package cs201labs.lab89;

import java.util.Scanner;

public class DNA {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter any DNA Strand");
        String dna=input.nextLine().toUpperCase();
        while(dna !=""){
            for (int i = 0; i < dna.length(); i++) {
                char word= dna.charAt(i)=='A'?
                        'T':dna.charAt(i)=='T'?'A':dna.charAt(i)=='G'?'C':'G';
                System.out.print(word);
            }
            System.out.println();
            System.out.println("Enter any DNA Strand");
            dna=input.nextLine().toUpperCase();
            }
        }
}
