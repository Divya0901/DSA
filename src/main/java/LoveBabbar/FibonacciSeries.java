package LoveBabbar;

public class FibonacciSeries {
    public static void main(String[] args){

        int n = 10;
        int a = 0;
        int b = 1;

        System.out.print(a + " "+ b + " ");
        for(int i = 1; i <= 10; i++){
            int sum = a + b;
            System.out.print(sum + " ");
            a = b;
            b = sum;
        }
    }
}
