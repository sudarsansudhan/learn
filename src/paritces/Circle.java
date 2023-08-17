package paritces;

public class Circle {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double area(){
        return Math.PI * (radius * radius);
    }
    public double circumference(){
        return Math.PI * 2*radius;
    }

    public static void main(String[] args) {
        Circle circle=new Circle(5);
        System.out.println("area of circle "+circle.area());
        System.out.println("area of circumferences "+circle.circumference());


        circle.setRadius(8);
        System.out.println("area of circle "+circle.area());
        System.out.println("area of circumferences "+circle.circumference());
    }
}
