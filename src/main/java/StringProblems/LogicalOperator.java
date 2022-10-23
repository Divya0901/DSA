package StringProblems;

public class LogicalOperator {

    public static void main(String[] args) {
        boolean a = true;
        boolean b = true;
//        boolean and = a && b;
//        boolean or = a || b;
//        boolean not = !a && !b;
//
//        System.out.print(and + " " + or + " " + not + " ");

//        The above code or the below single line is equal
        System.out.print((a && b) + " " + (a || b) + " " + (!a && !b));

    }
}
