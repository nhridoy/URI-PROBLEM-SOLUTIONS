
package salary;

import java.util.Scanner;

public class Salary {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b;
        double c,d;
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextDouble();
        d = b*c;
        System.out.println("NUMBER = "+a);
        System.out.printf("SALARY = U$ %.2f\n",d);
    }
    
}
