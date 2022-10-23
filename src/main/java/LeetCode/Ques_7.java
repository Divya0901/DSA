package LeetCode;

import java.util.Scanner;

public class Ques_7 {

    public static void main(String[] args){

        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        reverse(n);
    }
    public static int reverse(int n) {

        int ans = 0;
        while(n != 0){

            int digit = n % 10;

            if((ans > (Integer.MAX_VALUE/10)) || (ans < (Integer.MIN_VALUE/10))){
                System.out.println(0 + "Out of range");
                return 0;
            }
            ans = (ans*10) + digit;

            n = n / 10;
        }
        System.out.println(ans);
        return n;
    }
}
