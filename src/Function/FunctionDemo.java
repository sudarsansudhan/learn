package Function;


import java.util.Scanner;

class Method{
    //no return without parameter
    public void add(){
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        System.out.println("Addition "+(a+b));
    }
    //no Return with parameter
    public void sub(int x,int y){
        System.out.println("subition "+(x-y));
    }
    //Return without Parameter
    public int mul(){
        int l=10;
        int w=20;
        return l*w;
    }
    // Return with parameter
    public float div(int a,int b){
        return (a/b);
    }
    //Recursion function
    public int factorial(int n){//5! =1*2*3*4*5
    if(n==1){
        return 1;
    }else {
        return (n*factorial(n-1));
    }
    }
}
//type of user Define Method in java
public class FunctionDemo {
    public static void main(String[] args) {

        Method o=new Method();
        //no return without parameter
        o.add();
        //no Return with parameter
        o.sub(4,7);
        //Return without Parameter
        System.out.println("mutiplecation "+o.mul());
        // Return with parameter
        System.out.println("div "+o.div(4,5));

        //Recursion function
        System.out.println("Recursion"+o.factorial(5));
    }
}
