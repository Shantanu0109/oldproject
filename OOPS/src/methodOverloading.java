public class methodOverloading {
    public static void main(String[] args) {
        calci c  =new calci();
        System.out.println(c.sum(1,2));
        System.out.println(c.sum(1,2,3));
        System.out.println(c.sum((float)1.2,(float)1.4));
    }
}
class calci {
   int  sum (int a,int b){
return a+b;
    }

    float sum (float a, float b){
       return a+b;
    }

    int sum ( int a, int b,int c){
       return a+b+c;
    }
}