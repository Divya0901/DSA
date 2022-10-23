package Searching.BinarySerach;
import java.util.*;

//AgnosticSerach, in case if we don't know, in which order elements are sorted
public class AgnosticSearch {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = sc.nextInt();
        if(size <= 0)
            System.out.println("Enter a valid number of the size.");

        else {
            System.out.println("Enter the values: ");
            int[] a = new int[size];
            for (int i = 0; i <= a.length - 1; i++) {
                a[i] = sc.nextInt();
            }

            System.out.println("Enter the key: ");
            int key = sc.nextInt();

            binarySearch(size, a, key);
        }
    }

    public static int binarySearch(int size, int a[], int key){
        int start = 0;
        int end = size-1;
        int mid;

        if(size == 1){
            if(a[0] == key) {
                System.out.println("Index of key is: " + " 0 ");
                return 0;
            }
            else
                System.out.println("Index of key not found: ");
        }

        while(start <= end) {
         if (a[0] > a[1]) {
//            descending order
                mid = start + (end - start) / 2;

                if (key == a[mid]) {
                    System.out.println("Index of key : " + mid);
                    return mid;
                } else if (key > mid)
                    end = mid - 1;
                else
                    start = mid - 1;
            }
         else {
//            ascending order
             mid = start + (end - start) / 2;
                if (key == a[mid]){
                    System.out.println("Index of key : " + mid);
                    return mid;
                }
                else if(key > a[mid])
                    start = mid + 1;
                else
                    end = mid -1;
            }
        }
        return 0;
    }
}
