
package area;

import java.util.Scanner;

/**
 *
 * @author Hridoy
 */
public class Area {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double A,B,C,PI,RE;
        PI = 3.14159;
        A = input.nextDouble();
        B = input.nextDouble();
        C = input.nextDouble();
        RE = .5*A*C;
        System.out.printf("TRIANGULO: %.3f\n",RE);
        RE = PI*Math.pow(C, 2);
        System.out.printf("CIRCULO: %.3f\n",RE);
        RE = ((A+B)*C)/2;
        System.out.printf("TRAPEZIO: %.3f\n",RE);
        RE = Math.pow(B, 2);
        System.out.printf("QUADRADO: %.3f\n",RE);
        RE = A*B;
        System.out.printf("RETANGULO: %.3f\n",RE);
    }
    
}
