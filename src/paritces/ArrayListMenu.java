package paritces;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListMenu {
    public static void main(String[] args) {
        ArrayList<Integer> integers=new ArrayList<>();
        Scanner input =new Scanner(System.in);

        while (true){
            displayMenu();
            int choice=input.nextInt();
            if(choice == 1){
                //add
                System.out.println("Enter the interger :");
                integers.add(input.nextInt());
                System.out.println("Add");

            } else if (choice ==2) {
                //remove
                System.out.println("Enter the number to remove :");
                int elementremove =input.nextInt();
                if (integers.contains(elementremove)){
                    integers.remove(Integer.valueOf(elementremove));
                    System.out.println("Remove.");
                }else {
                    System.out.println("Element not found");
                }

            } else if (choice ==3) {
                System.out.println("your list "+integers);
            } else if (choice ==4) {
                System.out.println("Good bye!");
                break;
            }
        }


    }
    public static void displayMenu(){
        System.out.println();
        System.out.println("1.Add");
        System.out.println("2.Remove");
        System.out.println("3.Display");
        System.out.println("4.Exit");
        System.out.println("your choice :");
    }
}
