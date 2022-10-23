package LeetCode;

import java.util.Scanner;

import static java.lang.Math.pow;

public class Ques_231 {
    public static void  main(String[] args){

        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        isPowerOfTwo(n);
    }

    public static boolean isPowerOfTwo(int n){

        for(int i = 0; i <= 30; i++){

            int ans = (int) pow(2,i);
            if(ans == n) {
                System.out.println("True");
                return true;
            }
        }
        System.out.println("False");
        return false;
    }
}
