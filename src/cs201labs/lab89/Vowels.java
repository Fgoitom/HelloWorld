package cs201labs.lab89;


import java.util.Scanner;

public class Vowels {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("PLease enter any sentence");
        String sentence = input.nextLine();
        vowelCounter(sentence);
    }

    public static void vowelCounter(String sentence) {
        int counter1 = 0;
        int counter2 = 0;
        int counter3 = 0;
        int counter4 = 0;
        int counter5 = 0;
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == 'a')
                counter1++;
            if (sentence.charAt(i) == 'e')
                counter2++;
            if (sentence.charAt(i) == 'i')
                counter3++;
            if (sentence.charAt(i) == 'o')
                counter4++;
            if (sentence.charAt(i) == 'u')
                counter5++;


        }
        System.out.println("a:" + counter1 + "\ne: " + counter2 + "\ni: " + counter3 + "\no: " + counter4 + "\nu: " + counter5);

    }
}





