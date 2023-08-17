package introducation.staticdemo;

public class Human {
    int age;
    String name;
    int slary;
    boolean maried;

    long popuation;

    static void message(){
        System.out.println("hello world...!");
       // System.out.println(this.age);//this not a part of a object
    }
    public Human(int age, String name, int slary, boolean maried) {
        this.age = age;
        this.name = name;
        this.slary = slary;
        this.maried = maried;
        this.popuation=+1;
    }
}
