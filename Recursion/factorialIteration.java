package Recursion;
import java.util.*;;
public class factorialIteration {
    public static void main(String[] args){
        Scanner s1 = new Scanner(System.in);
        int num = s1.nextInt();
        int product = 1;
        for(int i = 1;i<=num;i++){
            product = product * i;
        }
        System.out.println(product);
        s1.close();
    }
}
