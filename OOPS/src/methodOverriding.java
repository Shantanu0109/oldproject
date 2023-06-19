public class methodOverriding {
    public static void main(String[] args) {
        A a = new A();
        a.method1();
        B b = new B();
        b.method1();
    }
}
class A {
     void method1 (){
        System.out.println( " I am method 1 of A ");
    }
}
class B extends A {
   // @Override
    //void method1(){
      //  System.out.println( " I am method 2 of B ");
    }
