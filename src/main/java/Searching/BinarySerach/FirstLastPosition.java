package Searching.BinarySerach;

import java.util.Scanner;


//Program to find the 1st and last postion of a reapted number.
//eg: 1 3 4 5 6 6 6 6 6 6 7 , key = 6.

public class FirstLastPosition {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = sc.nextInt();

        System.out.println("Enter the values: ");
        int[] a = new int[size];

        for(int i = 0; i <= a.length-1; i++){
            a[i] = sc.nextInt();
        }
        System.out.println("Enter the key : ");
        int key = sc.nextInt();

        binaryFirstPosition(a,size, key);
        binaryLastPosition(a, size,key);
    }

    public static int binaryFirstPosition(int a[], int size, int key) {

        int start = 0;
        int end = size-1;
        int ans = 0;
        int mid;

        while( start <= end){
            mid = start + ((end-start)/2);

            if(a[mid] == key){
                ans = mid;
                end = mid - 1;
            }
            else if(key > a[mid]){
                start = mid + 1;
            }
            else if(key < a[mid]){
                end = mid -1;
            }
//            mid = start + ((end-start)/2);
        }
        System.out.print(ans + " ");
        return ans;
    }
    public static int binaryLastPosition(int a[], int size, int key){
        int start = 0;
        int end = size-1;
        int ans = 0;

        while( start <= end){
            int mid = start + (end - start)/2;

            if(key == a[mid]){
                ans = mid;
                start = mid + 1;
            }
            else if(key > a[mid])
                start = mid + 1;

            else if(key < a[mid])
                end = mid -1 ;
        }
        System.out.print(ans + " ");
        return ans;
    }
}
