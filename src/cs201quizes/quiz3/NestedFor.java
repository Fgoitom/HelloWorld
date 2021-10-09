package cs201quizes.quiz3;

public class NestedFor {
    public static void main(String[] args) {
        int num=1;
        for (int r = 0; r<4; r++){
            for (int c = 0;c<4; c++){
                System.out.print(  (  "("+ (r +"," + c)) + ")" +"" );
                num++;

            }
            System.out.println();

        }
    }
}
