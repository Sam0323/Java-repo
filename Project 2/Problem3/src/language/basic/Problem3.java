//Write a java method named Sum with two parameters that returns sum of two arguments.
//Write  another  overloaded  method  with  three  parameters  that  returns  sum  of  three
//arguments. Write third overloaded method with four parameters that returns sum of four
//arguments.
//Note: User inputs can be hardcoded.
//
//Sample output:
//
//Sum(5,1); should return “sum of two arguments is 6”.
//Sum(5,1,1); should return “sum of three arguments is 7”.
//Sum(5,1,1,1); should return “sum of four arguments is 8”. 


package language.basic;
class Summation {
    static String sum(int a, int b){
        return "Sum of two arguments is "+(a+b);
    }

    static String sum(int a, int b, int c){
        return "Sum of three arguments is "+(a+b+c);
    }

    static String sum(int a, int b, int c, int d){
        return "Sum of four arguments is "+(a+b+c+d);
    }
}

public class Problem3 {

    public static void main(String[] args) {
        System.out.println(Summation.sum(5,1));
        System.out.println(Summation.sum(5,1,1));
        System.out.println(Summation.sum(5,1,1,1));
    }
}
