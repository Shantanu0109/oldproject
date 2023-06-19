import java.util.*;
public class linearsearch {
    public static int  searchlinear(int numbers[],int key){
        for (int i=0;i<numbers.length;i++){
            if (numbers[i]==key){
                return i;
            }
        }
        return-1;
    }
    public static void main(String[] args) {
        int numbers[] ={2,4,6,8,10,12};
        int key =5;

        int index =searchlinear(numbers,key );
        if (index == -1){
            System.out.println("NOT FOUND");
        } else {
            System.out.println("KEY IS AT " + index);
        }
    }
}
