package StringProblems;

public class Table {

    public static void main(String[] args){

        int n = 2;
        int m = 0;

        int mutliper = 10;

        while(mutliper > 0) {
            m = mutliper * n;
//            System.out.print(m+ " " );
            mutliper--;
        }
        System.out.print(m  + " ");
    }
}
