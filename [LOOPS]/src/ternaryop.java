import java.util.Scanner;

public class ternaryop {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int num = sc.nextInt();
        String type = ((num%2) == 0)? "even" : "odd";
        System.out.println(type);
    }
}
