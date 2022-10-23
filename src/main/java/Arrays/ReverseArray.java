package Arrays;
import java.util.*;

public class ReverseArray {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Give the size: ");
        int size = sc.nextInt();

        int arr[] = new int[size];
        System.out.println("Give the numbers: ");

        for(int i = 0; i <= arr.length-1; i++){
            arr[i] = sc.nextInt();
        }

        int swap = 0;

        for(int i = 0; i <= (arr.length-1)/2;) {
                swap = arr[i];
                arr[i] = arr[size-1];
                arr[size-1] = swap;
                i++;
                size--;

        }

        for(int i = 0; i <= arr.length-1; i++){
            System.out.print(" " + arr[i]);
            System.out.print(" ");
        }
    }
}
