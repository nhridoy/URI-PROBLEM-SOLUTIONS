
package salary.with.bonus;

import java.util.Scanner;

/**
 *
 * @author Hridoy
 */
public class SalaryWithBonus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name;
        double s1,s2,sf;
        name = input.nextLine();
        s1 = input.nextDouble();
        s2 = input.nextDouble();
        sf = s1+(s2*15/100);
        System.out.printf("TOTAL = R$ %.2f\n",sf);
    }
    
}
