package Searching.BinarySerach;
import java.util.*;

public class PeakMountainArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = sc.nextInt();

        System.out.println("Enter the values: ");
        int[] a = new int[size];
        for(int i = 0; i <= a.length-1; i++){
            a[i] = sc.nextInt();
        }

        binarySearch(a, size);
    }

    public static int binarySearch(int a[], int size){
        int start = 0;
        int end = size-1;
        int mid = start + (end - start)/2;
        int ans = 0;

        while(start < end){
            if(a[mid] < a[mid+1]) {
                start = mid + 1;
                ans = a[start];
            }
            else
                end = mid;

            mid = start + (end - start)/2;
        }
        System.out.println(ans);
        System.out.println("The count of rotation is: " + (size - (start + 1)));
        return 0;
    }
}
