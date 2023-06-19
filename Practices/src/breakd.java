import java.util.Scanner;

public class breakd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            int n = sc.nextInt();

        if ( n % 10 == 0 ){
            System.out.println( "none " );
        }
        else {
            System.out.println( n);
        }
    }
}
