/*
 * Name: Nahidujjaman Hridoy
 * email: hridoyboss12@gmail.com
 * University: Daffodil International University.
 * Warning: Do Not Copy Without Credit.
 */
package game.time.with.minutes;

import java.util.Scanner;

/**
 *
 * @author Hridoy
 */
public class GameTimeWithMinutes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b, c, d, e, f;
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
        d = input.nextInt();
        e = c - a;
        f = d - b;

        if (e == 0 && f == 0) {
            e = 24;
        } else if (e == 0 && f < 0) {
            e = 24 - 1;
        }else if (e>0 && f<0) {
            e = e-1;
        }else if (e<0 && f <0) {
            e = 23+e;
        }
        if (e < 0) {
            e = 24 + e;
        }
        if (f < 0) {
            f = 60 + f;
        }

        System.out.println("O JOGO DUROU " + e + " HORA(S) E " + f + " MINUTO(S)");

    }

}