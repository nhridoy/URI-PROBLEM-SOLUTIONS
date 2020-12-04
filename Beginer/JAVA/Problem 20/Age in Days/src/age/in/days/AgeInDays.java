/*
 * Name: Nahidujjaman Hridoy
 * email: hridoyboss12@gmail.com
 * University: Daffodil International University.
 * Warning: Do Not Copy Without Credit.
 */
package age.in.days;

import java.util.Scanner;

/**
 *
 * @author Hridoy
 */
public class AgeInDays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,d,m,y;
        a = input.nextInt();
        
        y = a/350;
        
        a = a-(y*365);
        m = a/30;
        
        d = a-(m*30);
        System.out.println(y+" ano(s)");
        System.out.println(m+" mes(es)");
        System.out.println(d+" dia(s)");
    }
    
}
