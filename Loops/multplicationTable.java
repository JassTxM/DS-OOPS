package Loops;

import java.util.Scanner;

public class multplicationTable {
    public static void main(String[] args){
        Scanner s1 = new Scanner(System.in);
        System.out.print("Enter Number to get it's table: ");
        int n = s1.nextInt();
        if(n==0){
            System.out.println("Zero Value");
        }
        else if(n<0){
            System.out.println("Negative Value");
        }
        else{
            System.out.println("Valid Positive Value: "+n);
            for(int i = 0;i<=10;i++){
                System.out.println(n + " * " + i + " = " + n*i);
            }
        }
        s1.close();
    }
}
 