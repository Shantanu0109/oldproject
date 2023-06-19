public class binarysearch {

    public static int searchbinary(int numbers[],int key){
        int start =0, end= numbers.length-1;
        while (start<=end){
            int mid = (start + end)/2;
            //comparison
            if (numbers[mid] == key){
                return mid;
            }
            if (numbers[mid] > key){
                end = mid-1;
            }
            else {
                start = mid +1;
            }

        }
        return -1;
    }
    public static void main(String[] args) {
        int numbers [] = {1,2,3,4,10,55,66};
        int key =10 ;
        System.out.println("INDEX FOR THE KEY IS " + searchbinary(numbers,key));

    }
}
