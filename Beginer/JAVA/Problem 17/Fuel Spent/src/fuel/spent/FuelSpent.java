/*
 * Name: Nahidujjaman Hridoy
 * email: hridoyboss12@gmail.com
 * University: Daffodil International University.
 * Warning: Do Not Copy Without Credit.
 */
package fuel.spent;

import java.util.Scanner;

/**
 *
 * @author Hridoy
 */
public class FuelSpent {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b;
        double c;
        a = input.nextInt();
        b = input.nextInt();
        c = (a*(double)b)/12;
        System.out.printf("%.3f\n",c);
    }
    
}
