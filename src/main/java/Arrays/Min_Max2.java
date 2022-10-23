package Arrays;

import java.util.*;

public class Min_Max2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();

        int arr[] = new int[size];
        System.out.println("Enter the values: ");

        for (int i = 0; i <= arr.length - 1; i++) {
            arr[i] = sc.nextInt();
        }

//        Max_MinValue(size,arr[]);
//    }
//    public static int Max_MinValue(int size, int arr[]) {

        int large = Integer.MIN_VALUE;
        int small = Integer.MAX_VALUE;

        for (int i = 0; i <= arr.length - 1; i++) {
            if (arr[i] > large)
                large = arr[i];
        }
        System.out.println("The largest number is: " + large);

        for (int i = 0; i <= arr.length - 1; i++) {
            if (arr[i] < small)
                small = arr[i];
        }
        System.out.println("The smallest values is: " + small);

//        return large;
//    }
    }
}
