package cs201labs.lab10;

import java.util.Scanner;

public class StandardDeviation {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter the array size");
        int N = input.nextInt();
        double [] arr = new double [N];
        double sum= 0;
        double mean = 0;
        double deviation = 0;
        for(int i =0; i<N; i++){
            System.out.println("Enter the values for index of i");
            arr[i]= input.nextDouble();
            sum+=arr[i];
            mean = sum/N;
            deviation += Math.pow((arr[i]-mean),2);
            double sDeviation= Math.sqrt(deviation/N);
            System.out.println(sDeviation);
        }
    }
}
