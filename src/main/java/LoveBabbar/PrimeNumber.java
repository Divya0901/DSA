package LoveBabbar;

public class PrimeNumber {

    public static void main(String[] args) {

        int n = 5;

        boolean check=true;
        if(n==1){
            System.out.println("No");
            return;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if(n%i==0)
            {
                check=false;
                System.out.println("No");
                break;

            }
        }
        if(check==true)
            System.out.println("Yes");
    }
}
