
package area.of.a.circle;

import java.util.Scanner;

public class AreaOfACircle {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double R,A;
        R = input.nextDouble();
        A = 3.14159*(R*R);
        System.out.printf("A=%.4f \n",A);
        
    }
    
}
