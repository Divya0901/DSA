package Arrays;

import java.util.Scanner;

public class DuplicateNumber_CodingNinjan {

    public static void main(String[] args){


        Scanner sc = new Scanner(System.in);
        System.out.println("Give the size: ");
        int size = sc.nextInt();

        int arr[] = new int[size];
        System.out.println("The numbers are: ");

        for(int i = 0; i <= arr.length-1; i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i <= arr.length-2; i++){
            for(int j = i+1; j <= arr.length-1; j++){
//                int ans = (arr[j] ^ arr[i]);
//                if(ans == 0)
                if(arr[j] == arr[i])
                    System.out.println(arr[j]);
            }
        }
        System.out.println();
    }
}
