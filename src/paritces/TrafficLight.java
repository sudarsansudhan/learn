package paritces;

public class TrafficLight {
    String coclor;
    int duration;

    public TrafficLight(String coclor, int duration) {
        this.coclor = coclor;
        this.duration = duration;
    }
    public void changeColor(String newColor) {
        coclor = newColor;
    }

    public boolean isRed(){
        return coclor.equals("red");
    }
    public boolean isGreen(){
        return coclor.equals("green");
    }


    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public static void main(String[] args) {
        TrafficLight trafficLight=new TrafficLight("red",30);

        System.out.println("the light is red "+trafficLight.isRed());
        System.out.println("the light is green "+trafficLight.isGreen());

        trafficLight.changeColor("green");

        System.out.println("now it's green "+trafficLight.isGreen());
        System.out.println("the light duration "+trafficLight.getDuration());
        trafficLight.setDuration(30);
        System.out.println("The light duration is now: " + trafficLight.getDuration());
    }
}
