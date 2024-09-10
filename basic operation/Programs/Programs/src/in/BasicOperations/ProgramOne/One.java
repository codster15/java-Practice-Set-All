package in.BasicOperations.ProgramOne;

import java.util.Scanner;

public class One{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
            int i = sc.nextInt();

            if(i % 5 ==  0){
                System.out.println(" divisible by 5 - " + i);
            }else{
                System.out.println(" Not divisible by 5 - " + i);
            }



    }
}
