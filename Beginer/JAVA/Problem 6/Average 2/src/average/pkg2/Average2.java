
package average.pkg2;
import java.util.Scanner;
public class Average2 {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double A,B,C,MEDIA;
        A = input.nextDouble();
        B = input.nextDouble();
        C = input.nextDouble();
        MEDIA = ((A*2)+(B*3)+(C*5))/10;
        System.out.printf("MEDIA = %.1f\n",MEDIA);
    }
    
}
