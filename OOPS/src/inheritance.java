public class inheritance {
    public static void main(String[] args) {
        dog sheru = new dog();
        sheru.eat();
        sheru.legs = 4;
        System.out.println(" total legs are " + sheru.legs);

       /* fish shark = new fish();
        shark.eat();
        shark.breath();
        shark.fins= 4;
        System.out.println( shark.fins);*/
    }
}
//base class
class animal {
    String colour;
    void breath (){
        System.out.println(" it breathes");
    }
    void eat(){
        System.out.println(" it eats");
    }
}
class mammal extends animal{
    int legs;
}
class dog extends mammal{
    String breed ;

}
//derived class
class fish extends animal{
    int fins ;
    void swim (){
        System.out.println(" it swims in water ");
    }
}