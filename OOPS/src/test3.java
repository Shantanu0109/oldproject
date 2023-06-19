
class Employee2{
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
public class test3 {
    public static void main(String[] args) {
Employee2 hon = new Employee2();
hon.setName("GOLUPATEL");
        System.out.println(hon.getName());
        hon.setId(69);
        System.out.println(hon.getId());
    }
}
