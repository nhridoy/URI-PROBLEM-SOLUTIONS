/*
 * Name: Nahidujjaman Hridoy
 * email: hridoyboss12@gmail.com
 * University: Daffodil International University.
 * Warning: Do Not Copy Without Credit.
 */
package banknotes;

import java.util.Scanner;

/**
 *
 * @author Hridoy
 */
public class Banknotes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,res;
        a = input.nextInt();
        res = a/100;
        System.out.println(a);
        System.out.println(res+" nota(s) de R$ 100,00");
        a = a - (res*100);
        res = a/50;
        System.out.println(res+" nota(s) de R$ 50,00");
        a = a - (res*50);
        res = a/20;
        System.out.println(res+" nota(s) de R$ 20,00");
        a = a - (res*20);
        res = a/10;
        System.out.println(res+" nota(s) de R$ 10,00");
        a = a - (res*10);
        res = a/5;
        System.out.println(res+" nota(s) de R$ 5,00");
        a = a - (res*5);
        res = a/2;
        System.out.println(res+" nota(s) de R$ 2,00");
        a = a - (res*2);
        res = a/1;
        System.out.println(res+" nota(s) de R$ 1,00");
    }
    
}
