package OddEven;

import java.util.Scanner;

public class OddEven {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Enter a number:");
        num = sc.nextInt();

        if ( num % 2 == 0 )
            System.out.println("The number is even");
        else
            System.out.println("The number is odd");
    }
}

   /* public static void main(String[] args) {
        int[][] myNumbers = { {1, 2, 3, 4},
                                {5, 6, 7, 8} };
        for(int row = 0; row <2; row++) {
            for(int column = 0; column <4; column++) {
                System.out.println(myNumbers[row][column]);
            }
        }*/

