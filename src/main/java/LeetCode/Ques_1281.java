package LeetCode;

import java.util.Scanner;


public class Ques_1281 {
    public static void main(String[] args){
        System.out.println("Enter the number: ");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        subtractProductAndSum(n);

    }

        public static int subtractProductAndSum(int n) {

            int prod = 1;
            int sum = 0;

            while (n != 0) {

                int digit = n % 10;

                prod = prod * digit;
                sum = sum + digit;

                n = n / 10;

            }
            int ans = prod - sum;
            System.out.println(ans);
            return ans;
        }
}
