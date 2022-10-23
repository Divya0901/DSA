package StringProblems;

import java.util.Scanner;

public class Floor {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        countSpecials(a, n, k);
    }

    static void countSpecials(int a[], int n, int k) {
        int f = (int) Math.floor(n / k);
        // your code here

        int count = 0;
        int output = 0;

        for (int i = 0; i < a.length - 1; i++) {
            count++;
            for (int j = i + 1; j < a.length; j++) {

                if (a[i] == a[j])
                    count++;
            }
            if (count == f)
                output++;

            count = 0;

        }
        System.out.print(output);
        System.out.println();


    }
}