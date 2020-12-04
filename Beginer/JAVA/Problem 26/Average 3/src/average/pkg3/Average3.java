/*
 * Name: Nahidujjaman Hridoy
 * email: hridoyboss12@gmail.com
 * University: Daffodil International University.
 * Warning: Do Not Copy Without Credit.
 */
package average.pkg3;

import java.util.Scanner;

/**
 *
 * @author Hridoy
 */
public class Average3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float N1, N2, N3, N4, average, N5, recalaverage;
        N1 = input.nextFloat();
        N2 = input.nextFloat();
        N3 = input.nextFloat();
        N4 = input.nextFloat();

        average = ((N1 * 2) + (N2 * 3) + (N3 * 4) + (N4 * 1)) / 10;

        if (average >= 7.0) {

            System.out.printf("Media: %.1f\n", average);
            System.out.println("Aluno aprovado.");
        } else if (average >= 5.0 && average <= 6.9) {
            System.out.printf("Media: %.1f\n", average);
            System.out.println("Aluno em exame.");
            N5 = input.nextFloat();

            System.out.println("Nota do exame: " + N5);
            recalaverage = (average + N5) / 2;
            if (average >= 5.0) {
                System.out.println("Aluno aprovado.");
            } else {
                System.out.println("Aluno reprovado.");
            }
            System.out.printf("Media final: %.1f\n", recalaverage);
        } else if (average < 5.0) {
            System.out.printf("Media: %.1f\n", average);
            System.out.println("Aluno reprovado.");
        }
    }

}
