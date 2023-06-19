public class hollw_rectangle {
    public static void hollowpattern(int totrow, int totcol) {
        //outer loop
        for (int i = 1; i <= totrow; i++) {
            //inner column
            for (int j = 1; j <= totcol; j++) {
                //cell-i,j

                if (i == 1 || j == 1 || i == totrow || j == totcol) {
                    System.out.print(" * ");

                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        hollowpattern(3, 4);

    }
}


