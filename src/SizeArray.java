import java.util.Scanner;

public class SizeArray {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number :");
        int size= in.nextInt();

        int[] evennumber=getnumber(size);

        System.out.println("Enven number array:");
        for (int num :evennumber){
            System.out.println(num);
        }
    }
    static int[] getnumber(int size){
        int []arr=new int[size];
        int evennumber =2;

        for (int i=0;i<size;i++){
            arr[i]=evennumber;
            evennumber+=2;

        }
        return arr;
    }
}
