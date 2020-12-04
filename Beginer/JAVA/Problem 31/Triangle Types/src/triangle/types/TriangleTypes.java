/*
 * Name: Nahidujjaman Hridoy
 * email: hridoyboss12@gmail.com
 * University: Daffodil International University.
 * Warning: Do Not Copy Without Credit.
 */
package triangle.types;

import java.util.Scanner;

/**
 *
 * @author Hridoy
 */
public class TriangleTypes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a, b, c, A, B, C;
        a = input.nextDouble();
        b = input.nextDouble();
        c = input.nextDouble();

        A = Math.max(a, Math.max(b, c));
        B = 0;
        C = Math.min(a, Math.min(b, c));
        if (a == A) {
            B = Math.max(b, c);
        } else if (b == A) {
            B = Math.max(a, c);
        } else if (c == A) {
            B = Math.max(a, b);
        }

        if (A >= (B + C)) {
            System.out.println("NAO FORMA TRIANGULO");
        } else {
            if (Math.pow(A, 2) == Math.pow(B, 2) + Math.pow(C, 2)) {
                System.out.println("TRIANGULO RETANGULO");
            }
            if (Math.pow(A, 2) > Math.pow(B, 2) + Math.pow(C, 2)) {
                System.out.println("TRIANGULO OBTUSANGULO");
            }
            if (Math.pow(A, 2) < Math.pow(B, 2) + Math.pow(C, 2)) {
                System.out.println("TRIANGULO ACUTANGULO");
            }
            if (A == B && B == C && A == C) {
                System.out.println("TRIANGULO EQUILATERO");
            }
            if (A == B && B != C || B == C && C != A || A == C && C != B) {
                System.out.println("TRIANGULO ISOSCELES");
            }
        }

    }

}
