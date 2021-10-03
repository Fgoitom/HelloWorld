package cs201labs.lab4;

import java.util.Scanner;

public class CoffeeBag {
    public static final double PricePerPound = 5.99;
    public static final double TaxRate = 0.0725;

    public static void main(String[] args) {
        int bagWeight;
        int numberOfBags;
        double totalPrice;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the  number of coffee bags sold and weight per bag  ");
        numberOfBags = input.nextInt();
        bagWeight = input.nextInt();
        System.out.println("Number of bags sold:" + numberOfBags);
        System.out.println("Weight per bag:" + bagWeight);
        System.out.println("Price per pound:" + PricePerPound);
        System.out.println("Sales tax:" + TaxRate);
        totalPrice = bagWeight * numberOfBags * PricePerPound;
        double totalPriceWithTax = totalPrice + totalPrice * TaxRate;
        totalPriceWithTax= Math.round(totalPriceWithTax * 100.0) /100.0;
        System.out.println("Total price:" +  totalPriceWithTax );
        input.close();


    }
}
