/*
 * Name: Nahidujjaman Hridoy
 * email: hridoyboss12@gmail.com
 * University: Daffodil International University.
 * Warning: Do Not Copy Without Credit.
 */
package triangle;

import java.util.Scanner;

/**
 *
 * @author Hridoy
 */
public class Triangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a, b, c;
        a = input.nextDouble();
        b = input.nextDouble();
        c = input.nextDouble();

        if (a < (b + c) && b < (a + c) && c < (a + b)) {
            System.out.println("Perimetro = " + (a + b + c));
        } else {
            System.out.println("Area = " + ((a + b) / 2) * c);
        }
    }

}
