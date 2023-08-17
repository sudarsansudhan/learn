package Abstract;

abstract class Shape{
    abstract void draw();
    void message(){
        System.out.println("message from shape..!");
    }
}
class RectangleShape extends Shape{

    @Override
    void draw() {
        System.out.println("Draw Rectangle using length & breath..");
    }
}


public class absttractdemo {
    public static void main(String[] args) {
        RectangleShape obj=new RectangleShape();
        obj.draw();
        obj.message();

    }
}
