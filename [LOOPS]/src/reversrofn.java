import java.util.Scanner;

public class reversrofn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("bhaiya number btana");
        int n = sc.nextInt();
        while (n >0){
            int lastdigit = (n % 10 );
            System.out.print(lastdigit + "");
            n /= 10;
        }
        System.out.println();
    }
}
