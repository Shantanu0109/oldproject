import java.util.Scanner;

public class factorial {
    public static void printhello() {
        System.out.println("helloworld");
        System.out.println("helloworld");
        System.out.println("helloworld");
    }

    public static int calculatesum(int num1, int num2) { //parameters or formal parameters
        int sum = num1 + num2;
        return sum;
    } /* Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum=calculatesum(a, b); //arguments or actual parameters
        System.out.println("sum is " + sum); */

    public static int multiply(int a, int b) {
        int product = a * b;
        return product;
        //int a = 4;
        //int b = 2;
        // int prod = multiply(a, b);
        //System.out.println(prod);
    }

    public static int factorial(int n) {

        int f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        return f;//factorial of n
    }

    public static int bincoeff(int n, int r) {
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n-r);

        int bincoeff = fact_n / (fact_r * fact_nmr);
        return bincoeff;
    }


    public static void main (String[]args){
        //System.out.println(factorial(5));
       System.out.println(bincoeff(5,2));


    }
}
