package Arrays;
import java.util.*;



public class SwapAlternativeElement {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size: ");
        int size = sc.nextInt();

        System.out.println("The numbers : ");
        int arr[] = new int[size];

        for(int i = 0; i <= size-1; i++){
            arr[i] = sc.nextInt();
        }

//        for(int i = 0; i <= arr.length-2; i = i+2)
        for(int i = 0; i <= arr.length-2; i+=2){
           int swap = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = swap;

//            swap(arr[i], arr[i+1]);
        }

        for(int i = 0; i <= arr.length-1; i++){
            System.out.print(arr[i] + " ");
            System.out.print(" ");
        }
    }
}