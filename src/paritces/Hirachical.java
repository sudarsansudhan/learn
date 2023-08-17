package paritces;

public class Hirachical {
    public static void main(String[] args) {
        Rect rect=new Rect(3,4);
        System.out.println(rect.react_angle());


    }
}
class Shape{
    float length,breath,radius;

}
class Rect extends Shape{
    public Rect(float l,float b) {
        length=l;
        breath=b;
    }
    float react_angle(){
        return length*breath;
    }
}
class Circle1 extends Shape{
    public Circle1(float r) {
        radius=r;
    }
    float circle_area(){
        return 3.14f * (radius * radius);
    }
}
class Square extends Shape{
    public Square(float l) {
        length=l;
    }
    float square_area(){
        return (length * length);
    }
}
