import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number ");
        int num=in.nextInt();
        // store the number to originalNum
        int org_num=num;//resver this number

        int rev=0;
        // store it in variable
        while (num!=0){
            rev=rev*10 + num%10;
            num=num/10;
        }
        System.out.println(rev);
        if(org_num==rev){
            System.out.println(org_num+" plaindrome number ");
        }else {
            System.out.println(org_num+" not plaindrom number");
        }

    }


}