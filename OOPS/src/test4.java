import java.security.PublicKey;

class Human{
    private int age;
    private String name;

    public Human() {
        age = 12;
        name = "GHANASVI";
    }
    public Human(int a , String n){
        age =a;
        name = n;
    }

        public int getAge(){
return age;
        }
        public void setAge(int age){
        this.age=age;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
}
public class test4 {
    public static void main(String[] args) {
        Human obj = new Human(23 , "Khushi");
        Human obj2 = new Human();

       obj.setAge(22);
        obj.setName("Anshu");

        System.out.println(obj.getAge() + " : " + obj.getName());
    }
}
