import java.util.Scanner;

public class TrappedRainWater {
    public static int  rainwater(int heigth[]) {
        int n = heigth.length;
        //calculate leftmax boundary - array
        int leftmax[] = new int[heigth.length];
        leftmax[0] = heigth[0];
        for (int i = 1; i < n; i++) {
            leftmax[i] = Math.max(heigth[i], leftmax[i - 1]);
        }
        //calculate rightmax boundary-array
        int rightmax[] = new int[heigth.length];
        rightmax[n - 1] = heigth[n - 1];
        for (int j = n - 2; j >=0; j--) {
            rightmax[j] = Math.max(heigth[j], rightmax[j+ 1]);
        }
        int trapedwater = 0;
        //loop

        for (int i = 0; i < n; i++) {
            //waterlevel = min(leftmax bound,rightmax bound)
            int waterlvl = Math.min(leftmax[i], rightmax[i]);

            //trapped water= waterlevel - height
            trapedwater += waterlvl - heigth[i];
        }
        return trapedwater;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int height[] = {4,2,0,6,3,2,5};
        System.out.println(rainwater(height));
    }
}