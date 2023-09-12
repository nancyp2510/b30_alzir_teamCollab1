package week1_nancy;

public class DivideWithoutOperator {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;

        int count = 0;
        String r = a +" / " + b + " = ";

        while(a>=b){
            a -= b;
            count++;
        }
if( a!= 0 ) {
    System.out.println( r + count + " with remainder is " + a);
}else{
    System.out.println(r + count);
}
    }
}
/*
Write the method that can divide two number withiut using division operator
 */
