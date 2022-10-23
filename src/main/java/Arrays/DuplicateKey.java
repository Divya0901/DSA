package Arrays;
import java.util.*;

public class DuplicateKey {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Give the size: ");
        int size = sc.nextInt();

        System.out.println("Enter the values: ");
        int arr[] = new int[size];

        for(int i = 0; i <= size-1; i++){
            arr[i] = sc.nextInt();
        }

        int count = 0;

        for(int i = 0; i <= arr.length-2; i++){
            for(int j = i+1; j <= arr.length-1; j++){
                if(arr[i] == arr[j]) {
                    count++;
                }
            }
        }
        if(count > 0)
            System.out.println("Yes duplicate is represent");
        else
            System.out.println("No duplicate is represent");


    }
}
