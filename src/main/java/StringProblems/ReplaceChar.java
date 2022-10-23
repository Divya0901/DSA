package StringProblems;

import java.util.Scanner;

public class ReplaceChar {
    public static void main(String args[]){

//        StringBuilder str = new StringBuilder("eabcdef");
////
////        str.setCharAt(0, 'i');
////        str.setCharAt(5, 'i');
//       String strNew =  str.substring(3, 5);

//        System.out.println(strNew);


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String and the start and end index: ");
        String str = scan.next();
        int start = scan.nextInt();
        int end = scan.nextInt();

//        StringBuilder sb = new StringBuilder(str);
//        str = sb.substring(start, end);
        System.out.println(str.substring(start,end));


    }

}
