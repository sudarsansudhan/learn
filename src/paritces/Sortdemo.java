package paritces;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Sortdemo {
    public static void main(String[] args) {
        ArrayList<Integer>integers=new ArrayList<>();
        System.out.println("Enter the 5 interger value :");
        Scanner input=new Scanner(System.in);
        for (int i=0;i<5;i++){
            int temp=input.nextInt();

            if(!integers.contains(temp))
                integers.add(temp);

        }
        Collections.sort(integers);
        System.out.print(integers);
    }
}
