package cs201labs.Lab7;

import java.util.Scanner;

public class PrimeNumberRanges {
    public static void primeNumber(int primeNumber){

        Scanner input=new Scanner(System.in);
        System.out.println("Enter any number");
        int num= input.nextInt();

        PrimeNumberRanges.numOfPrime(num);
    }

    public static void numOfPrime(int x) {
        //int count = 0;
        int add = 0;
        int num=2;

        while(num<x){
            int count=0;
            for (int i = 2; i <=num; i++) {

                if(num%i==0)
                    count++;
            }
            if (count == 1)
                add++;
            num++;
        }

        System.out.println(add);
    }
}
