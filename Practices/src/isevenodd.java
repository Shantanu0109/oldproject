import java.util.Scanner;

public class isevenodd {
    public static boolean iseven (int n){
        if (n % 2 == 0){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();
        if (iseven(n)){
            System.out.println( " it is even ");
        }
        else {
            System.out.println(" it is odd");
        }
    }
}
