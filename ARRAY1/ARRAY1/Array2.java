import java.util.*;
public class Array2 {
    public static void updatearray(int marks[],int nonchang){
        nonchang =10;
        for (int i=0;i< marks.length;i++) {
            marks[i] = marks[i] + 1;
        }
    }

    public static void main(String[] args) {
        int marks[]= {97,98,99};
        int nonchang =5;
        updatearray(marks,nonchang);
        System.out.println(nonchang);

        //print our marks

        for (int i=0;i< marks.length;i++){
            System.out.print(marks[i] + " ");
        }
        System.out.println();
    }

}
