public class Floyds_triangle {
    public static void floyd(int n){
        int counter=1;
        //outer
        for (int i=1;i<=n;i++){
            //inner -how many times counter will be printed
            for (int j=1;j<=i;j++){
                System.out.print(counter+" ");
                counter++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        floyd(6);
    }
}
