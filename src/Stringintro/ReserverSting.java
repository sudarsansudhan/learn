package Stringintro;

public class ReserverSting {
    //program to resver the string
    public static void main(String[] args) {
        StringBuilder a=new StringBuilder("welcome to my place");
        System.out.println(a);
        StringBuilder b=new StringBuilder();
        for(int i=a.length()-1;i>0;i--){
            b.append(a.charAt(i));
        }
        System.out.println(b);
    }
}
