/*
 * Name: Nahidujjaman Hridoy
 * email: hridoyboss12@gmail.com
 * University: Daffodil International University.
 * Warning: Do Not Copy Without Credit.
 */
package banknotes.and.coins;

import java.util.Scanner;

/**
 *
 * @author Hridoy
 */
public class BanknotesAndCoins {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double n;
        int res;
        
        n = input.nextDouble();
         if (n >= 0 && n <= 1000000.00) {
        System.out.println("NOTAS:");
        res = (int) n/100;
        System.out.println(res+" nota(s) de R$ 100.00");
        
        n = n-(res*100);
        res = (int)n/50;
        System.out.println(res+" nota(s) de R$ 50.00");
        
        n = n-(res*50);
        res = (int)n/20;
        System.out.println(res+" nota(s) de R$ 20.00");
        
        n = n-(res*20);
        res = (int)n/10;
        System.out.println(res+" nota(s) de R$ 10.00");
        
        n = n-(res*10);
        res = (int)n/5;
        System.out.println(res+" nota(s) de R$ 5.00");
        
        n = n-(res*5);
        res = (int)n/2;
        System.out.println(res+" nota(s) de R$ 2.00");
        
        System.out.println("MOEDAS:");
        n = n-(res*2);
        res = (int)n/1;
        System.out.println(res+" moeda(s) de R$ 1.00");
        
        n = n-(res*1);
        res = (int) (n/.50);
        System.out.println(res+" moeda(s) de R$ 0.50");
        
        n = n-(res*.50);
        res = (int) (n/.25);
        System.out.println(res+" moeda(s) de R$ 0.25");
        
        n = n-(res*.25);
        res = (int) (n/.10);
        System.out.println(res+" moeda(s) de R$ 0.10");
        
        n = n-(res*.10);
        res = (int) (n/.05);
        System.out.println(res+" moeda(s) de R$ 0.05");
        
        n = n-(res*.05);
        res = (int) (n/.01);
        System.out.println(res+" moeda(s) de R$ 0.01\n");
         }
    }
    
}
