package Recursion;
import java.util.Scanner;

public class fibonacciSeries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int a = 0, b = 1;
        for (int i = 0; i < num; i++) {
            int c = a + b;
            System.out.println(c);
            a = b;
            b = c;
        }
        input.close();
    }

}

