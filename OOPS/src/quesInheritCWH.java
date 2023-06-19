
class circle {
    public  int radius;
    circle (int r){
        System.out.println( "i am def circle constructor");
        this.radius =r;

    }
     public double area (){
         return  Math.PI * this.radius * this.radius;
     }

}
class c1ylinder extends circle{
    public int height;
    c1ylinder( int r,int h ){
        super(r);
        System.out.println( " i am cyclinder constructor");
        this.height = h;
    }
    public double volume (){
        return Math.PI* this.radius *this.radius*this.height;

    }
}
public class quesInheritCWH {
    public static void main(String[] args) {
       // circle c = new circle(12);
        c1ylinder c2= new c1ylinder(2,3);
    }
}
