public class hollorhombus {
    public static void hollowrom(int n){
        for (int i=1;i<=n;i++){
            //spaces
            for (int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            //stars on boundary
            for (int j=1;j<=n;j++){
                if (i==1 || i==n || j==1 || j==n){
                    System.out.print(" * ");
                }
                else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        hollowrom(5);
    }
}
