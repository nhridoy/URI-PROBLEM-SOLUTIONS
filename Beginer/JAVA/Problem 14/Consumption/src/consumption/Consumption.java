
package consumption;

import java.util.Scanner;

public class Consumption {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int X;
        double Y;
        X = input.nextInt();
        Y = input.nextDouble();
        Y = X/Y;
        System.out.printf("%.3f km/l\n",Y);
    }
    
}
