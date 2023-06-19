import java.util.Arrays;
import java.util.Collections;

public class inbuiltSort {
    public static void printarray(int arr[]){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {5,3,2,4,1};
       // Arrays.sort(arr);
      //  Arrays.sort(arr,0,3);
       Arrays.sort(arr);
       printarray(arr);
    }

    }

