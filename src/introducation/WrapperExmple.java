package introducation;

public class WrapperExmple {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        swap(8,9);
        System.out.println(a+" "+b);
        //wrapperclass
     /*   Integer num=new Integer(5);
        System.out.println(num.compareTo(a));*/

        /*final int bouns=2;
        bouns=3;*///final we can't modifiy
         A sudhan=new A("sudarsan");
         sudhan.name="other name";
         //when a non   primitive is final, you cannot change
        sudhan=new A("new object ");//

    }




    public static void swap(int a, int b){
        int temp=a;
        a=b;
        b=temp;
    }
   static class A{
        final int a=10;//it should be initaled

        String name;

        public A(String name) {
            this.name = name;
        }
    }
}
