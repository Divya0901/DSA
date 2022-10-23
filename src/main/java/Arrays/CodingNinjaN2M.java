package Arrays;
import java.util.*;

public class CodingNinjaN2M {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size: ");
        int size = sc.nextInt();

        System.out.println("The numbers: ");
        int a[] = new int[size];

        for (int i = 0; i <= size - 1; i++) {
            a[i] = sc.nextInt();
        }

        int ans = 0;

        for(int i = 0; i <= a.length-1; i++){
            ans = ans ^ a[i];
        }
        System.out.println(ans);

//            int temArry[] = new int[size];
//            int count = 1;
//
//            for(int i = 0; i <= a.length-1; i++){
//                for(int j = i+1; j <= a.length-1; j++){
//
//                    for(int k = 0; k <= temArry.length-1; k++){
//                        if(a[i] == a[k])
//                            break;
//
//                    }
//                    if(a[i] == a[j])
//                        count++;
//                    temArry.add
//                }
//                count = 1;
//            }
//
//            if(count == 1)
//                System.out.println();
//        }
    }
}

