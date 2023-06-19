public class inverted_rotetd_half_pyr {

    public static void invertpyramid(int n) {

        //outer
        for (int i = 1; i <= n; i++) {
            //spaces
            for (int j = 1; j <i; j++) {
                System.out.print("   ");
                //stars }
            }
                for (int j = 1; j <= n - i+1; j++) {
                    System.out.print(" * ");
                }
                System.out.println();
            }
    }

        public static void main (String[]args){
            invertpyramid(5);
        }
    }

