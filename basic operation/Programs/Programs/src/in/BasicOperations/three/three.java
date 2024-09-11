package in.BasicOperations.three;

import java.util.Scanner;

public class three {

    public static void main(String[] args) {

        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println("Enter the 2nd num ");
        int num2 = sc.nextInt();

            if(num < num2){
                System.out.println("Maximum Number is - " + num2);
            }else {
                System.out.println("Maximum Number is - " + num);
            }


    }
}
