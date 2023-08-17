package interfacedemo;
interface Animal{
    void sound();
    void sleep();
}
class Dog implements Animal{

    @Override
    public void sound() {
        System.out.println("The Dog is soung like ,woof!");
    }

    @Override
    public void sleep() {
        System.out.println("it's sleep");
    }
}
public class InterFaceDemo {
    public static void main(String[] args) {
        Dog obj=new Dog();

        obj.sound();
        obj.sleep();
    }
}
