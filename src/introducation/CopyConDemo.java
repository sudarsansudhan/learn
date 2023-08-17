package introducation;

public class CopyConDemo {

    static class Complex{
        int real,img;

        Complex(){
           this. real=3;
            this.img=5;
        }
        Complex(int r,int i){
            this.real=r;
            this.img=i;
        }
        Complex(Complex in2){
            this.real=in2.real;
            this.img=in2.img;
        }

        @Override
        public String toString() {
            return "("+real +"+"+img+"i)";
        }
    }
    public static void main(String[] args) {
        Complex in=new Complex();
        System.out.println("Default number "+in);

        Complex in1=new Complex(5,7);
        System.out.println("Default number "+in1);

        Complex in2=new Complex(5,7);//copy constructor means we can pass the value in1 in in2
        System.out.println("Copy Constructor "+in2);
    }
}
