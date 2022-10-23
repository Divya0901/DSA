package Arrays;
import java.util.*;

public class DuplicateKeyBYXOR {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Give the size: ");
        int size = sc.nextInt();

        System.out.println("Please enter values bt 1 to size-1 ONLY: ");
        int[] arr = new int[size];
        System.out.println("The numbers are: ");
        for(int i = 0; i <= arr.length-1; i++){
            arr[i] = sc.nextInt();
        }

        int ans = 0;
        for(int i = 0; i < size; i++){
            ans = ans ^ arr[i];
        }
        for(int i = 1; i < size; i++){
            ans = ans ^ i;
        }

        System.out.println(ans);

    }
}
