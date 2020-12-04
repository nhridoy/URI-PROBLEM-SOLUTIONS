/*
 * Name: Nahidujjaman Hridoy
 * email: hridoyboss12@gmail.com
 * University: Daffodil International University.
 * Warning: Do Not Copy Without Credit.
 */
package salary.increase;

import java.util.Scanner;

/**
 *
 * @author Hridoy
 */
public class SalaryIncrease {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double n;
        n = input.nextDouble();
        if (n>=0 && n<=400) {
            System.out.printf("Novo salario: %.2f\n",n+(n*15)/100);
            System.out.printf("Reajuste ganho: %.2f\n",(n*15)/100);
            System.out.println("Em percentual: 15 %");
        }
        if (n>=400.01 && n<=800) {
            System.out.printf("Novo salario: %.2f\n",n+(n*12)/100);
            System.out.printf("Reajuste ganho: %.2f\n",(n*12)/100);
            System.out.println("Em percentual: 12 %");
        }
        if (n>=800.01 && n<=1200) {
            System.out.printf("Novo salario: %.2f\n",n+(n*10)/100);
            System.out.printf("Reajuste ganho: %.2f\n",(n*10)/100);
            System.out.println("Em percentual: 10 %");
        }
        if (n>=1200.01 && n<=2000) {
            System.out.printf("Novo salario: %.2f\n",n+(n*7)/100);
            System.out.printf("Reajuste ganho: %.2f\n",(n*7)/100);
            System.out.println("Em percentual: 7 %");
        }
        if (n>2000) {
            System.out.printf("Novo salario: %.2f\n",n+(n*4)/100);
            System.out.printf("Reajuste ganho: %.2f\n",(n*4)/100);
            System.out.println("Em percentual: 4 %");
        }
        
        
    }
    
}
