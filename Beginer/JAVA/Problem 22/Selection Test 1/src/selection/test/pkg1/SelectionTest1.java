/*
 * Name: Nahidujjaman Hridoy
 * email: hridoyboss12@gmail.com
 * University: Daffodil International University.
 * Warning: Do Not Copy Without Credit.
 */
package selection.test.pkg1;

import java.util.Scanner;

/**
 *
 * @author Hridoy
 */
public class SelectionTest1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int A,B,C,D;
        A = input.nextInt();
        B = input.nextInt();
        C = input.nextInt();
        D = input.nextInt();
        
        if (B>C && D>A && C+D>A+B && C>0 && D>0 && A%2==0) {
            System.out.println("Valores aceitos");
        }else
            System.out.println("Valores nao aceitos");
    }
    
}
