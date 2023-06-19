import java.util.Scanner;

public class passfail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks1 = sc.nextInt();
        int marks2 = sc.nextInt();
        int marks3 = sc.nextInt();
        float avg = (marks1 +marks2 +marks3) / 3.0f;
        if (avg > 40 && marks1 >= 33 && marks2 >= 33 && marks3 >= 33) {
            System.out.println(" passed");
        }
        else{
            System.out.println( "fail");
        }

    }
}
