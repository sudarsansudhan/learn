abstract class innerDemo{
    abstract void display() ;
}
class outerclass{
    public void outerDiaply(){
        innerDemo obj=new innerDemo() {
            @Override
            void display() {
                System.out.println("This is a inner outerAnnoymous...");
            }

        };
        obj.display();
    }
}

public class Anonymous {
    public static void main(String[] args) {
        outerclass ob=new outerclass();
        ob.outerDiaply();
    }
}
