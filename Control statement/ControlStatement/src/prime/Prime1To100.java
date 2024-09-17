package prime;

import java.util.Scanner;

public class Prime1To100 {
    public static void main(String[] args) {
       int num = 1;

        while( 100 >= num){


            int count = 0 ;

                        for (int i = 1 ; i <= num ; i++){
                    if(num % i == 0){
            count++;
                    }
                    }
                    if(count == 2){
                    System.out.println("Prime Number -" + num);
                            System.out.println("=======================");
                        }

            count = 0;

            num++;
        }


    }
}

