package Searching.BinarySerach;
import java.util.*;

//this code works only for ascending order elements
public class FirstLastOccreness {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = sc.nextInt();

        System.out.println("Enter the values: ");
        int[] a = new int[size];
        for(int i = 0; i <= a.length-1; i++){
            a[i] = sc.nextInt();
        }

        System.out.println("Enter the key: ");
        int key = sc.nextInt();

//        leftOccuenes(a, size, key);
//        rightOccureness(a, size,key);

        int count = rightOccureness(a, size, key) - leftOccuenes(a, size, key) + 1;
        System.out.println();
        System.out.println("The count of key in array is:  " + count);
    }


    public static int leftOccuenes(int a[], int size, int key){
        int start = 0;
        int end = size-1;
        int mid;
        int lc = 0;

        while(start <= end){
            mid = start + (end-start)/2;

            if(key == a[mid]){
                end = mid-1;
                lc = mid;
            }
            else if(key > a[mid])
                start = mid+1;
            else
                end = mid -1;
        }
        System.out.print(lc + " ");
        return lc;
    }
    public static int rightOccureness(int a[], int size, int key){

        int start = 0;
        int end = size-1;
        int mid;
        int rc = 0;

        while(start <= end){
            mid = start + (end - start)/2;

            if(key == a[mid]){
                start = mid+1;
                rc = mid;
            }
            else if(key > a[mid])
                start = mid + 1;
            else
                end = mid-1;
        }
        System.out.println(rc);
        return rc;
    }
}
