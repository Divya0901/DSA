package LeetCode;

import java.util.Scanner;

public class Ques_191 {

    public static void main(String[] args) {
        System.out.println("Enter the Number: ");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        hammingWeight(n);
    }

    // you need to treat n as an unsigned value
    public static int hammingWeight(int n) {

        int count = 0;

        while (n != 0) {

            int c = n & 1;
            boolean isTrue;

            if (c > 0)
                isTrue = true;
            else
                isTrue = false;

            if (isTrue) {
                count++;
            }
            n = n >> 1;

        }
        System.out.println(count);
        return count;

    }
}

