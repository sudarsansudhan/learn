package introducation;
//parameterized Constructor & constructor overloading
public class ParameterizedConstructor {

   static class Box{
        float length,breath;
        //Default constructor
        Box(){
            length=2;
            breath=5;
        }
        //parametrzied constructor
        Box(float x,float y){
            length=x;
            breath=y;
        }
        Box(float x){//overloading
            length=breath=x;
        }

        float area(){
            return length*breath;
        }
    }

    public static void main(String[] args) {
        Box o=new Box();
        System.out.println("Area "+o.area());

        Box o1=new Box( 4,5);
        System.out.println("Area parameterized"+o1.area());

        Box o2=new Box(3);
        System.out.println("signle area "+o2.area());
    }
}
