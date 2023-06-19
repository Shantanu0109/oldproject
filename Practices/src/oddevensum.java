import java.util.Scanner;

public class oddevensum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        int choice;
        int oddsum = 0;
        int evensum=0;
        do {
            System.out.println("enter the digit");

            int digit = sc.nextInt();
            if ( digit % 2==0){
                evensum = evensum  + digit;
            }
            else {
                oddsum = oddsum + digit;
            }
            System.out.println(" if u want to continue press 1 and if not press 0");
            choice = sc.nextInt();
        }while (choice == 1);
        System.out.println( "sum of even numbers are " + evensum);
        System.out.println("sum of odd numbers are " + oddsum);

    }
}
