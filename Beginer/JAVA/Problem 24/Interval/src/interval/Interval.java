/*
 * Name: Nahidujjaman Hridoy
 * email: hridoyboss12@gmail.com
 * University: Daffodil International University.
 * Warning: Do Not Copy Without Credit.
 */
package interval;

import java.util.Scanner;

/**
 *
 * @author Hridoy
 */
public class Interval {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double n;
        n = input.nextDouble();
        
        if(n>=0 && n<=25.0000){
            System.out.println("Intervalo [0,25]");
        }else if (n>25 && n<=50.0000) {
            System.out.println("Intervalo (25,50]");
        }else if (n>50 && n<=75.0000) {
            System.out.println("Intervalo (50,75]");
        }else if (n>75 && n<=100.0000) {
            System.out.println("Intervalo (75,100]");
        }else
            System.out.println("Fora de intervalo");
    }
    
}
