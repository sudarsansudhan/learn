package polymorphism;

public class Paly {
    public  String name;
    public String age;

    public Paly(String name, String embitel) {
        this.age=name;
        this.age=embitel;

    }

    private void display(){
        System.out.println("name :"+name);
        System.out.println("age  :"+age);
    }
    static class Priyanka extends Paly {

        public Priyanka(String name, String embitel) {
            super(name,embitel);
        }

        private void display(){
            System.out.println("name :"+name);
            System.out.println("age  :"+age);
        }

    }

    public static void main(String[] args) {

        Paly a=new Priyanka("sudarsan","Embitel");
        a.display();
    }
}
