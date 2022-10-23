package Searching.BinarySerach;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size: ");
        int size = sc.nextInt();

        System.out.println("The numbers are: ");
        int[] a = new int[size];

        for(int i = 0; i <= a.length-1; i++){
           a[i] = sc.nextInt();
        }

        System.out.println("Give the key element: ");
        int key = sc.nextInt();


        binarySearch(size, a, key);
    }

    public static int binarySearch(int size, int a[], int key){
        int start = 0;
        int end = size;
        int midElement;

        while(start <= end) {
            midElement = start+(end-start)/2;
            if (key == a[midElement]) {
                System.out.println("True");
                return 0;
            }
            else {
                if (key > a[midElement]) {
                    start = midElement + 1;
                } else
                    end = midElement - 1;
            }
        }
        System.out.println("False");
        return -1;
    }
}
