public class binary2dec {
    public static void bintodec(int binarynum){
      //  int munum=binarynum;
        int pow=0;
        int decnum=0;
        while(binarynum>0){
            int lasdigit = binarynum%10;
            decnum=decnum+(lasdigit * (int)Math.pow(2,pow));
            pow++;
            binarynum=binarynum/10;
        }
        System.out.println("decimal of " + binarynum + " is "+ decnum);
    }

    public static void dectobin(int n){
        int mynum=n;
        int pow=0;
        int binnum=0;
        while (n>0){
            int rem=n%2;
            binnum=binnum+(rem * (int) Math.pow(10,pow));
            pow++;
            n=n/2;
        }
        System.out.println("binary form of " + mynum + " is " + binnum);
    }

    public static void main(String[] args) {
        dectobin(6);
        //bintodec(1010);
    }
    }

