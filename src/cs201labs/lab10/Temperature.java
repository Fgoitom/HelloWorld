package cs201labs.lab10;

import java.util.Scanner;

public class Temperature {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("How many days' temperatures? ");
            int days = sc.nextInt();

            double[] temps = new double[days];
            for (int i = 0; i < temps.length; i++) {
                System.out.print("Day " + (i + 1) + "'s high temp: ");
                temps[i] = sc.nextInt();
            }
            int sum = 0;
            for (int i = 0; i < temps.length; i++) {
                sum += temps[i];
            }
            double average = (double) sum / temps.length;
            System.out.println("Average temp = " + average);
            int count = 0;
            for (int i = 0; i < temps.length; i++) {
                if (temps[i] > average) {
                    count++;
                }
            }
            System.out.println(count + " days were above average");
        }
    }
