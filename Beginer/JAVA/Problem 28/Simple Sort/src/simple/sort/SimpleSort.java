/*
 * Name: Nahidujjaman Hridoy
 * email: hridoyboss12@gmail.com
 * University: Daffodil International University.
 * Warning: Do Not Copy Without Credit.
 */
package simple.sort;

import java.util.Scanner;

/**
 *
 * @author Hridoy
 */
public class SimpleSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b, c;
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();

        if (a < b && a < c) {
            System.out.println(a);
            if (b < c) {
                System.out.println(b);
                System.out.println(c);
            } else {
                System.out.println(c);
                System.out.println(b);
            }
        } else if (b < a && b < c) {
            System.out.println(b);
            if (a < c) {
                System.out.println(a);
                System.out.println(c);
            } else {
                System.out.println(c);
                System.out.println(a);
            }
        } else if (c < a && c < b) {
            System.out.println(c);
            if (a < b) {
                System.out.println(a);
                System.out.println(b);

            } else {
                System.out.println(b);
                System.out.println(a);
            }
        }
        
        System.out.println("\n"+a);
        System.out.println(b);
        System.out.println(c);
    }

}
