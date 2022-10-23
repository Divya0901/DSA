package Arrays;

import java.util.Scanner;

public class MAX_MIN_Element {
    public static void main(String[] args){

        int arr[] = new int[10];
        int large = arr[0];
        int small = arr[0];

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values: ");

        for(int i = 0; i <= arr.length-1; i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i <= arr.length-1; i++){
            if (arr[i] > large) {
                large = arr[i];
            }
        }
        System.out.println("The largest number is :" + large);

        for(int i = 0; i <= arr.length-1; i++){
            if(arr[i] < small){
                small = arr[i];
            }
        }
        System.out.println("The smallest number is :" + small);
    }
}
