package in.BasicOperations.ProgramTwo;

import java.util.Scanner;

public class PowerOFNumber {
    public static void main(String[] args) {

        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println("Enter the power ");

        int power = sc.nextInt();

        int res = num ;

        for (int i = 1; i < power ;  i++){
            res = res * num;
        }

        System.out.println( "Power of given number -> " + res);


    }
}
