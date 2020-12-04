
package simple.calculate;

import java.util.Scanner;

/**
 *
 * @author Hridoy
 */
public class SimpleCalculate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b;
        double c,res;
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextDouble();
        res = b*c;
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextDouble();
        res = (b*c) + res;
        System.out.printf("VALOR A PAGAR: R$ %.2f\n",res);
        
    }
    
}
