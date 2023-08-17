package Function;

import java.util.Arrays;
import java.util.Scanner;

public class arrayreturn {

    public static int[] arrayvalue(){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the limit :");
        int n=in.nextInt();
        int a[]=new int[n];
        for (int i=0;i<n;i++){
            System.out.println("Enter the value "+i+" :");
            a[i]=in.nextInt();
        }
        Arrays.sort(a);
        //returning array
       // return new int[]{1,2,3,4,5};
        return a;

    }
    public static void main(String[] args) {
        int arr[]=arrayvalue();
       for (int a:arr)
           System.out.println(a);
    }
}
