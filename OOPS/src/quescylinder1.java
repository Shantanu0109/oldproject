
class Cylinder {
    private int len ;
    private int height;

    public Cylinder(int len, int height) {
        this.len = len;
        this.height = height;
    }

    public int getLen() {
        return len;
    }

    public void setlen(int len) {
        this.len = len;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    public double surfaceArea(){
        return  2*3.14*len*height + 2*3.14*len*len;
    }
}
class rectangle {
    private int len;
    private int b;

    public rectangle() {
        this.len = 4;
        this.b = 5;
    }

    public rectangle(int len, int b) {
        this.len = len;
        this.b = b;
    }

    public int getLen() {
        return len;
    }

    public int getB() {
        return b;
    }
}

public class quescylinder1 {
    public static void main(String[] args) {
Cylinder mycl = new Cylinder(100,105);
//mycl.setHeight(105);
//mycl.setlen(100);
       System.out.println(mycl.getLen() + " and " + mycl.getHeight());
     //   System.out.println( "The surface area is " + mycl.surfaceArea() );
rectangle r1= new rectangle(10 ,4);
      //  System.out.println(r1.getB() + ": " + r1.getLen() );

    }
}
