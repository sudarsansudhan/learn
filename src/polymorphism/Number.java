package polymorphism;

public class Number {
//overloading method
    //multiple constructor overloading
    int sum(int a,int b){
        return a+b;
    }
    int sum(int a,int b,int c){
        return a*b*c;
    }

    public static void main(String[] args) {
        Number obj=new Number();
        System.out.println(obj.sum(2,3));
        obj.sum(4,6,7);
    }
}
