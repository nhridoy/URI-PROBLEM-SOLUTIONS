
package simple.product;
import java.util.Scanner;
public class SimpleProduct {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b,PROD;
        a = input.nextInt();
        b = input.nextInt();
        PROD = a*b;
        System.out.println("PROD = "+PROD);
    }
    
}
