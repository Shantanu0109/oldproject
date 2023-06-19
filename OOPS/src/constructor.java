
class student{
    int roll;
    String name;

    student (){

        System.out.println( "constructor is called");
    }
    student ( String name){
        this.name = name;
    }
    student (int roll){
        this.roll = roll;
    }

}
public class constructor {
    public static void main(String[] args) {
    student s1= new student( "golu");
    System.out.println(s1.name);
    student s2 = new student();
    student s3= new student(12);
        System.out.println(s3.roll);
    }
}
