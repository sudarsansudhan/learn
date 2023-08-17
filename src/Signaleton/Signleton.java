package Signaleton;

public class Signleton {
    private  Signleton(){

    }
    private static Signleton instance;

    public static Signleton getInstance(){
        //check the wherther 1obj is credted or not
        if (instance == null){
            instance =new Signleton();
        }
            return instance;
        }



}
