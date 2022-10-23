package Searching.BinarySerach;
import java.util.*;

//Program to find the key in desecneding order sorted array by binary search

public class DesecendingOrder {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size: " );
        int size = sc.nextInt();

        System.out.println("Enter the values: ");
        int[] a = new int[size];
        for(int i = 0; i <= a.length-1; i++){
            a[i] = sc.nextInt();
        }

        System.out.println("Enter the key: ");
        int key = sc.nextInt();

        valueByBinarySearch(a,size,key);
    }

    public static int valueByBinarySearch(int a[], int size, int key){
        int start = 0;
        int end = size-1;
        int mid;

        while(start <= end){
            mid = start + (end - start)/2;

            if(key == a[mid]) {
                System.out.println("Index of key : " + mid);
                return mid;
            }

            else if(key > a[mid])
                end = mid-1;
            else
                start = mid+1;
        }
        System.out.println("No index found for key.");
        return 0;
    }

}
