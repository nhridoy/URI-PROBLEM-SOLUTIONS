/*
 * Name: Nahidujjaman Hridoy
 * email: hridoyboss12@gmail.com
 * University: Daffodil International University.
 * Warning: Do Not Copy Without Credit.
 */
package banknotes.and.coins;

import java.util.Scanner;
import java.text.DecimalFormat;

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
        res = (int)n/100;
        n -= (res*100);
        System.out.println("NOTAS:");
        System.out.println(res+" nota(s) de R$ 100.00");
        
        res = (int)n/50;
        n -= (res*50);
        System.out.println(res+" nota(s) de R$ 50.00");
        
        res = (int)n/20;
        n -= (res*20);
        System.out.println(res+" nota(s) de R$ 20.00");
        
        res = (int)n/10;
        n -= (res*10);
        System.out.println(res+" nota(s) de R$ 10.00");
        
        res = (int)n/5;
        n -= (res*5);
        System.out.println(res+" nota(s) de R$ 5.00");
        
        res = (int)n/2;
        n -= (res*2);
        System.out.println(res+" nota(s) de R$ 2.00");
        
        res = (int)n/1;
        n -= (res*1);
        System.out.println("MOEDAS:");
        System.out.println(res+" moeda(s) de R$ 1.00");
        
        res = (int)(n/.50);
        n -= (res*.50);
        System.out.println(res+" moeda(s) de R$ 0.50");
        
        res = (int)(n/.25);
        n -= (res*.25);
        System.out.println(res+" moeda(s) de R$ 0.25");
        
        res = (int)(n/.10);
        n -= (res*.10);
        System.out.println(res+" moeda(s) de R$ 0.10");
        
        res = (int)(n/.05);
        n -= (res*.05);
        System.out.println(res+" moeda(s) de R$ 0.05");
        
        res = (int)(n/.01);
        n -= (res*.01);
        DecimalFormat df = new DecimalFormat("0.00");
        String formate = df.format(n); 
        n = Double.parseDouble(formate);
        System.out.println(res+(int)(n/0.01)+" moeda(s) de R$ 0.01");
    }
    
}
