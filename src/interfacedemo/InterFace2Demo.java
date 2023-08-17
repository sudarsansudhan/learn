package interfacedemo;
class mobile{
    void voicecall(){
        System.out.println("make voice call...!");
    }
    void sms(){
        System.out.println("we can send SMS");
    }
}
interface Camera{
    void Click();
    void record();
}
interface Player{
    void play();
    void pause();
    void stop();
}
class SmartPhone extends mobile implements Camera,Player{

    @Override
    public void Click() {
        System.out.println("Take a selfie...!");
    }

    @Override
    public void record() {
        System.out.println("record the video");
    }

    @Override
    public void play() {
        System.out.println("play the music");
    }

    @Override
    public void pause() {
        System.out.println("pause the song");
    }

    @Override
    public void stop() {
        System.out.println("stop the song");
    }
}
public class InterFace2Demo {
    public static void main(String[] args) {
        SmartPhone obj1=new SmartPhone();
        obj1.voicecall();
        obj1.sms();
        obj1.Click();
        obj1.play();
        obj1.stop();
        obj1.pause();

    }
}
