package SumOFDigits;

import java.util.Scanner;

public class SumOfDigit {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;

        while(num > 0){

            int rem  = num % 10 ;

            num = num / 10;

            sum = sum + rem;

        }

        System.out.println("Sum of Digit - " + sum);



    }
}
