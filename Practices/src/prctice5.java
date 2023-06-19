import java.util.Scanner;

public class prctice5 {
    public static void main(String[] args) {
       // Scanner sc = new Scanner(System.in);
       // int number = sc.nextInt();
        int n =8 ;
        int sum =0;
        for (int i =0; i<=10;i++){
            sum = sum + n*i;
        }
        System.out.println(sum);
        /*int n = sc.nextInt();
        int i=1;
        int fact = 1;
        while ( i<=n){
            fact = fact * i;
            i++;
        }
        System.out.println(fact);*/
    }

}
 /* int n = sc.nextInt();
        int i =0;
        int num = 1;
        int sum =0;
        while (i < n){
            if (num % 2 == 0){
                sum = sum + num;
                i++;
            }
            num++;

        }
        System.out.println( sum);*/
 /*int number = sc.nextInt();
    int i ;
        for (i =10; i>=1;i--){
                System.out.println( number + "*" + i + " = "  + number* i);
                }*/