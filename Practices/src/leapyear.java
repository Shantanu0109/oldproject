import java.util.Scanner;

public class leapyear {
    public static void main(String[] args) {
        System.out.println("Mention your year ");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if (((year % 4 == 0) && (year % 100 != 0)) || ( year % 400 == 0)){
            System.out.println("it is leap year");
        }
        else {
            System.out.println("it is not leap year");
        }
    }
}