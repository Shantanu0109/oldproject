import java.util.Scanner;

public class switchh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        switch (number){
            case 1 :
                System.out.println("run");
                break;
            case 2 :
                System.out.println("walk");
                break;
            case 3 :
                System.out.println("stop");
                break;
            default:
                System.out.println("nothing");
               //break;
        }
    }
}
