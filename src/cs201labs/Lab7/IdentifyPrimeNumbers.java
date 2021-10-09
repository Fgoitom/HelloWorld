package cs201labs.Lab7;


import java.util.Scanner;

public class IdentifyPrimeNumbers {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int num;
        do{
            System.out.println("Enter any integer number");
            num= input.nextInt();
            IdentifyPrimeNumbers.primeNum(num);
        } while(num>0);


    }

    public static void primeNum(int x){
        int count=0;
        for (int i = 1; i < x; i++) {
            if(x%i==0)
                count++;
        }
        if(count==1)
            System.out.println("x is prime");
        else
            System.out.println("x is not prime");



    }


}