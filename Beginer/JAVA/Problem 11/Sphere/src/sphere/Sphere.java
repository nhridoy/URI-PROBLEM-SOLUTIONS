
package sphere;

import java.util.Scanner;

public class Sphere {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double R,VOLUME,PI;
        R = input.nextDouble();
        PI = 3.14159;
        VOLUME = (4.0/3)*PI*Math.pow(R, 3);
        System.out.printf("VOLUME = %.3f\n",VOLUME);
    }
    
}
