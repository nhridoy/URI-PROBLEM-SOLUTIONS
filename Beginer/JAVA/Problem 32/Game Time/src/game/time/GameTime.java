/*
 * Name: Nahidujjaman Hridoy
 * email: hridoyboss12@gmail.com
 * University: Daffodil International University.
 * Warning: Do Not Copy Without Credit.
 */
package game.time;

import java.util.Scanner;

/**
 *
 * @author Hridoy
 */
public class GameTime {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b, c;
        a = input.nextInt();
        b = input.nextInt();
        c = b - a;

        if (c == 0) {
            System.out.println("O JOGO DUROU 24 HORA(S)");
        } else if (c < 0) {
            c = 24 + c;
            System.out.println("O JOGO DUROU " + c + " HORA(S)");
        } else if (c > 0) {
            System.out.println("O JOGO DUROU " + c + " HORA(S)");
        }

    }

}
