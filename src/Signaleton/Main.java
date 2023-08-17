package Signaleton;

public class Main {
    public static void main(String[] args) {

        //it will create first of object
        Signleton obj = Signleton.getInstance();

        Signleton obj1 =Signleton.getInstance();

        Signleton obj2=Signleton.getInstance();
    }
}
