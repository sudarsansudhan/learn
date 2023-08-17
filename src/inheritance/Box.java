package inheritance;

public class Box {
    double l;
    double w;
    double h;

    Box(){
        this.h=-1;
        this.l=-1;
        this.w=-1;
    }
    //cobe
    Box(double silde){
        this.h=silde;
        this.l=silde;
        this.w=silde;
    }

    public Box(double l, double w, double h) {
        this.l = l;
        this.w = w;
        this.h = h;
    }

    Box(Box old){
        this.w=old.w;
        this.l=old.l;
        this.h=old.h;
    }
    public void information(){
        System.out.println("Running the box");
    }
}
