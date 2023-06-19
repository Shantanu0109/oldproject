public class insertionSorting {
    public static void insertsorting(int arr[]){
        for(int i=1;i<arr.length;i++){
            int cur=arr[i];
            int prev=i-1;

                while ( prev>=0 && arr[prev]>cur){
                    arr[prev+1] = arr[prev];
                    prev--;
                }

            arr[prev+1] = cur;
        }
    }

    public static void printarray(int arr[]){
        for (int i=0;i<arr.length;i++){
            System.out.print( arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[]  = {5,1,3,2,4};
        insertsorting(arr);
        printarray(arr);
    }

}
