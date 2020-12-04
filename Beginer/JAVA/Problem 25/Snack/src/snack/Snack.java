/*
 * Name: Nahidujjaman Hridoy
 * email: hridoyboss12@gmail.com
 * University: Daffodil International University.
 * Warning: Do Not Copy Without Credit.
 */
package snack;

import java.util.Scanner;

/**
 *
 * @author Hridoy
 */
public class Snack {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int X,Y;
        double T;
        X = input.nextInt();
        Y = input.nextInt();
        
        switch (X) {
            case 1:
                T = Y*4.00;
                System.out.printf("Total: R$ %.2f\n",T);
                break;
            case 2:
                T = Y*4.50;
                System.out.printf("Total: R$ %.2f\n",T);
                break;
            case 3:
                T = Y*5.00;
                System.out.printf("Total: R$ %.2f\n",T);
                break;
            case 4:
                T = Y*2.00;
                System.out.printf("Total: R$ %.2f\n",T);
                break;
            case 5:
                T = Y*1.50;
                System.out.printf("Total: R$ %.2f\n",T);
                break;
        }
    }
    
}
