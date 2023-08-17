package introducation;

public class ConstructorExample {
    static class RectangleShape{
        int length,width;

        RectangleShape(){
            System.out.println("Constructor called");
            length=3;
            width=5;
        }

        int area(){
            int a=length*width;
            return a;
        }
    }
    public static void main(String[] args) {
        RectangleShape o1=new RectangleShape();
        System.out.println("Area of Rectangle :"+o1.area());

    }
}
