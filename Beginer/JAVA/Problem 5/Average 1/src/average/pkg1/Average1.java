
package average.pkg1;
import java.util.Scanner;
public class Average1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a,b,MEDIA;
        a = input.nextDouble();
        b = input.nextDouble();
        if (a>=0 && a<=10 && b>=0 && b<=10) {
            MEDIA = ((a*3.5)+(b*7.5))/11;
            System.out.printf("MEDIA = %.5f\n",MEDIA);
        }else
            System.out.println("Between 0-10");
    }
    
}
