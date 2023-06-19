import java.util.*;
public class arraysfucargument {

    public static void updatemarks(int marks[]){
        for (int i=0;i <marks.length;i++){
            marks [i]= marks[i] + 1;
        }
    }
    public static void main(String[] args) {
        int marks[] = {88,89,90};
        updatemarks(marks);

        //print our marks

        for (int i=0;i<marks.length;i++){
            System.out.print(marks[i] + " ");
        }
        System.out.println();

    }
}
