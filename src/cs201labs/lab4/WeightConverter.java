package cs201labs.lab4;

import java.util.Scanner;

public class WeightConverter {
    private double moonWeight;

    public WeightConverter(double moonWeight) {
        this.moonWeight = moonWeight;

}
    public double convert(double earthWeight){
        double moonWeight = earthWeight * 0.167;
        return moonWeight;
    }

    public static void main(String[] args) {
         Scanner input = new Scanner (System.in);
         System.out.println("Enter your weight");
         double w = input.nextDouble();
        WeightConverter moonWeight = new WeightConverter(0.167);
        moonWeight.convert(w);
        System.out.println(moonWeight.convert(w));
        input.close();
    }
}
