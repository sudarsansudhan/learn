package Abstract;
abstract class Mobile{
    void voice(){
        System.out.println("you can make a vioce call....!");
    }
    abstract void camera();
    abstract void display();
}
class SamSung extends Mobile{

    @Override
    void camera() {
        System.out.println("16 mega Pixel camera");
    }

    @Override
    void display() {
        System.out.println("5 inche Display");
    }
}
class Nokia extends Mobile{

    @Override
    void camera() {
        System.out.println("8 mega Pixel camera");
    }

    @Override
    void display() {
        System.out.println("8 inche Display");
    }
    void fingerprint(){
        System.out.println("fast finger print...!");
    }
}



public class absttractdemo2 {
    public static void main(String[] args) {

        SamSung obj1 =new SamSung();
        obj1.voice();
        obj1.camera();
        obj1.display();
        System.out.println("----------------------------------");
        Nokia obj2=new Nokia();
        obj2.voice();
        obj2.camera();
        obj2.display();
        obj2.fingerprint();

    }
}
