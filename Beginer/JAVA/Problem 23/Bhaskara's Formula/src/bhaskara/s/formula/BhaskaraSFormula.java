/*
 * Name: Nahidujjaman Hridoy
 * email: hridoyboss12@gmail.com
 * University: Daffodil International University.
 * Warning: Do Not Copy Without Credit.
 */
package bhaskara.s.formula;

import java.util.Scanner;

/**
 *
 * @author Hridoy
 */
public class BhaskaraSFormula {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double A,B,C,R1,R2;
        A = input.nextDouble();
        B = input.nextDouble();
        C = input.nextDouble();
        
        if (A==0 || (Math.pow(B, 2)-(4*A*C)) < 0) {
            System.out.println("Impossivel calcular");
        }else{
            R1 = (-B+(Math.sqrt(Math.pow(B, 2)-(4*A*C))))/(2*A);
            R2 = (-B-(Math.sqrt(Math.pow(B, 2)-(4*A*C))))/(2*A);
            System.out.printf("R1 = %.5f\n",R1);
            System.out.printf("R2 = %.5f\n",R2);
        }
        
        
        
    }
    
}
