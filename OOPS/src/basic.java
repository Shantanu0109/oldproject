class employee{
    int id;
    String name;
    public void printDetails(){
        System.out.println("MY ID IS " + id);
        System.out.println("MY NAME IS " + name);
    }
}
public class basic {
    public static void main(String[] args) {
        employee john = new employee();
        john.id = 32;
        john.name = "john bisen";
        System.out.println(john.id);
        System.out.println(john.name);

    }

}
