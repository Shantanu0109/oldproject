import java.util.Scanner;

public class ifelse {
    public static void main(String[] args) {
        System.out.println("what is your age");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if (age >= 18 ) {
            System.out.println("adult : he can drive , vote");
        }
        else System.out.println("he is not adult");
            }
        }