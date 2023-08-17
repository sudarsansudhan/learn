package paritces;

public class ClassAndRectangle {
    float weight;
    float heght;

    public ClassAndRectangle(float weight, float heght) {

        this.weight = weight;
        this.heght = heght;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getHeght() {
        return heght;
    }

    public void setHeght(float heght) {
        this.heght = heght;
    }
    public double perimeter(){
        return 2*(weight +heght);
    }
    public double area(){
        return weight*heght;
    }

    public static void main(String[] args) {
        ClassAndRectangle classAndRectangle=new ClassAndRectangle(3,4);
        System.out.println(classAndRectangle.perimeter());
        System.out.println(classAndRectangle.area());

       classAndRectangle.setHeght(4);
       classAndRectangle.setWeight(5);

        System.out.println(classAndRectangle.perimeter());
        System.out.println(classAndRectangle.area());

    }
}
