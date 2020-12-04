/*
 * Name: Nahidujjaman Hridoy
 * email: hridoyboss12@gmail.com
 * University: Daffodil International University.
 * Warning: Do Not Copy Without Credit.
 */
package time.conversion;

import java.util.Scanner;

/**
 *
 * @author Hridoy
 */
public class TimeConversion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N,h,m,s;
        N = input.nextInt();
        h = (N/60)/60;
        
        N = N-(h*60)*60;
        m = N/60;
        
        s = N-(m*60);
        System.out.println(h+":"+m+":"+s);
    }
    
}
