package cs201labs.lab89;

import java.util.Scanner;

public class Character {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the sentence");
        String sent = input.nextLine();
        while (sent != "") {
            Character.numCase1(sent);
            Character.numCase(sent);
            System.out.println("Enter the sentence");
            sent = input.nextLine();

        }

    }

    public static void numCase1(String sent) {
        int count = 0;
        for (int i = 0; i < sent.length(); i++) {
            for (int j = 65; j < 90; j++) {
                if (sent.charAt(i) == (char) (j))
                    count++;
            }
        }
        System.out.println("There are " + count + " uppercases");
    }

    public static void numCase(String sent) {
        int count = 0;
        for (int i = 0; i < sent.length(); i++) {
            if (Character.isUpperCase(sent.charAt(i)))
                count++;
        }
        System.out.println("There are " + count + " uppercases");
    }

    private static boolean isUpperCase(char charAt) {
        return false;
    }
}
