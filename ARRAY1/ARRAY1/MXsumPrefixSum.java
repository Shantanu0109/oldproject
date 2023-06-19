public class MXsumPrefixSum {
    //print subarrays
public static void maxsum(int num[]){
    int cs=0;
    int ms=Integer.MIN_VALUE;
    int prefix[] = new int[num.length];

    prefix[0]= num[0];
    //calculate prefix array

    for (int i=1;i< prefix.length;i++){
        prefix[i] = prefix[i-1] + num[i];
    }

    for (int i=0;i< num.length;i++){
        int start = i;
        for (int j=i;j< num.length;j++){
            int end =j;

            cs = start == 0? prefix[end] : prefix[end] - prefix[start -1];
            if (ms < cs){
                ms = cs;
            }
        }

    }
    System.out.println(" MAX SUM IS " + ms);
}

    public static void main(String[] args) {
        int numbers[] = {1,-2,6,-1,3};
        maxsum(numbers);
    }
}
