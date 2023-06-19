import java.util.Scanner;

public class pallindrome {
    public static boolean ispallindrome (int n){
        int rev =0;
        int pallindrome = n;
        while ( pallindrome!= 0){
       int rem = pallindrome % 10 ;
       rev = rev * 10 + rem;
 pallindrome = pallindrome /10;
        }
        if ( pallindrome ==  rev){
       return true;
        }
        return false;
    }

    public static void main(String[] args) {
      //  Scanner sc = new Scanner(System.in);
      //  int n = sc.nextInt();
        if (ispallindrome(454)){
            System.out.println("it is palllindrome");
        }
        else {
            System.out.println(" it is not pallindrome");
        }
    }
}
