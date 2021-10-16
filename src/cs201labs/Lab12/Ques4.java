package cs201labs.Lab12;

public class Ques4 {
    public static void main(String[] args) {
        reverse("java");
        System.out.print(reverse("java"));
        String s = "program";
        System.out.print("\n");
        for (int j = s.length(); j > 0; j--) {

            System.out.print(s.charAt(j - 1));
        }

    }
    public static String reverse (String input){
        int k = input.length();
        if (input == null || input.isEmpty())
            return input;
        else
            return input.charAt(k - 1) + reverse(input.substring(0, k - 1));

    }
}
