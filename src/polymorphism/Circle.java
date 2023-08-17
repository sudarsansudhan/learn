package polymorphism;

public class Circle extends Shapes{
    //his will run when obj of circle is created
    //hence it is overriding the parent method
    @Override//this is call annotation
    void area(){
        System.out.println("Area is Pie * r * r");
    }
}
