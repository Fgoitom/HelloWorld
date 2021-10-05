package cs201quizes.quiz3;

import java.util.Random;

public class MainGenPass {
    public static void genPass() {
      Random random = new Random();
      int generate = random.nextInt(90-65+1)+65;
      char upperCase = (char) generate;
      int generate2 = random.nextInt(122-97+1)+97;
      char lowerCase = (char) generate2;
      int numbers = random.nextInt(10);
      int character = random.nextInt(38-33+1)+33;
      char toSpecialChar = (char) character;
        System.out.println("Your generated password is:" +"+upperCase+" + "+lowerCase+" + "+numbers+" + "+toSpecialChar+");



    }
    public static void main (String[]args){
        genPass();
    }

}
