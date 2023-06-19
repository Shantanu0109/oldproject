import java.util.Scanner;
public class test {
    public static void bubbleSort(int arr[], int n)
    {
        for(int turn=0;turn < arr.length-1;turn++){
            for(int j=0;j<arr.length;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

    }

    public static void printsort(int arr[],int n){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print( " give the vale of N : ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("ENTER N ELEMENT");
        for (int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        bubbleSort(arr,n);
        printsort(arr,n);
    }
}

