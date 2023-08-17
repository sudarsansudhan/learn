package interfacedemo;
interface InterDemo {
    //here we can decalre
   final static int A=25;//it's deafult final
  public abstract void fun1();//it's a default and we can't acess the private
  public abstract void fun2();


 // try to create funtion ? no //it will have not body and we can access using static
    public static void fun3(){
        System.out.println("I am in fun3");
    }
    //java8 implement new features ,here we can use defult or static
    default void fun5(){
        System.out.println("I am in fun5");
    }
}
//we can use inheritance from base class to drived class
interface InterDemo2 extends InterDemo {
    void fun4();
}
class TestDemo implements InterDemo2 {

    @Override
    public void fun1() {
        System.out.println("fun 1");
    }

    @Override
    public void fun2() {
        System.out.println("fun 2");
    }

    @Override
    public void fun4() {
        fun5();
        System.out.println("fun 3");
    }
}
public class moreInterface {
    public static void main(String[] args) {
        System.out.println("A :"+ InterDemo.A);
        InterDemo.fun3();

        TestDemo obj=new TestDemo();
        obj.fun1();
        obj.fun2();
        obj.fun4();

        obj.fun5();



    }
}
