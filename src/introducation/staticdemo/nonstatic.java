package introducation.staticdemo;

public class nonstatic {
    public static void main(String[] args) {

    }
    //this is not dependent on object
    static void fun(){

      //  greating();//you can use this because it required an instance
        //but the function you are using it in does not depend on instance

        //you cannot acess non static stuff without referneceing their instance in static context
        nonstatic obj=new nonstatic();
        obj.greating();
    }
    void fun2(){
        greating();//here ,we can call...because obj created object
    }
    //we know that something which is not static ,belong to an object
     void greating(){
        System.out.println("Hello world...!");
    }
}
