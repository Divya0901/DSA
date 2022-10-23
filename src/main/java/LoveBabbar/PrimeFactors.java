package LoveBabbar;

public class PrimeFactors {

    public static void main(String[] args) {

        int n = 7;
        String maxNum = null;

        if (n % 2 == 0)
            maxNum = "Two";
        if(n % 3 == 0) {
            maxNum = "Three";
        }if (n % 11 == 0) {
            maxNum = "Eleven";
        }
        if(maxNum == null) {
            System.out.println("-1");
        }
        else
             System.out.println(maxNum);


//        if(n%11==0){System.out.println("Eleven");}
//        else if(n%3==0){System.out.println("Three");}
//        else if(n%2==0){System.out.println("Two");}
//        else{System.out.println("-1");}

    }
    }


