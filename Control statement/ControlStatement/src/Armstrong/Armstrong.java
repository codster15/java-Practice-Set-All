package Armstrong;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {

        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int orignalNum = num;
        String a = String.valueOf(num);
        int length = a.length();



        int temp = 1;
        int calcu = 0 ;


        while(num > 0){

            int rem = num % 10;

            for (int i=1 ; i <= length ; i++){

                temp = temp * rem;
            }

            calcu = calcu + temp;


            num = num / 10;

            temp = 1;
        }


        if(calcu == orignalNum){
            System.out.println("this is armstrong Number - " + orignalNum);

        }else {
            System.out.println("Not a Armstrong Number " + orignalNum);
        }

    }
}
