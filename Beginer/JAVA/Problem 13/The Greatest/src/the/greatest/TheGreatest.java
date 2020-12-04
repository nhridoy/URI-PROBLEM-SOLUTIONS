
package the.greatest;

import java.util.Scanner;

/**
 *
 * @author Hridoy
 */
public class TheGreatest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int A,B,C,RES;
        A = input.nextInt();
        B = input.nextInt();
        C = input.nextInt();
        RES = isGrate(A,B);
        RES = isGrate(C, RES);
        System.out.println(RES+" eh o maior");
    }
    public static int isGrate(int A, int B){
        return (A+B+Math.abs(A-B))/2;
    }
}
