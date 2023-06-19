import java.util.Scanner;

public class sumof1stN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int counter = 1;
        while (counter<=n){
            sum+= counter;
            //sum+=i
            counter++;
        }
        System.out.println(sum);
    }
}
