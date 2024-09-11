package factorial;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {



        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int temp = num ;

        for (int i = temp-1 ; i >= 1 ; i--){

            temp = temp * i;


        }
        System.out.println("factorial of " + num + " is - "+ temp);

    }
}
