public class overriding {
    static int sum(int a,int b){
        return a+b;
    }
    static float sum(float a,float b){
        return a+b;
    }
    static int sum(int a,int b,int c){
        return a+b+c;
    }

    public static void main(String[] args) {
        System.out.println(sum(2,4));
        System.out.println(sum(1,1,1));
        System.out.println(sum(2.9f,1.1f));

    }
}
