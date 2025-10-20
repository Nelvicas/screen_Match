import java.util.Scanner;

public class Evaluaciones {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double nota = 0;
        double mediaEvaluacion = 0;
        double totalEvaluacion = 0;

        while ( nota != -1){
            System.out.println("Escriba la nota que le daria a la pelicula Matrix: ");
            nota = teclado.nextDouble();

            if (nota != -1){
                mediaEvaluacion += nota;
                totalEvaluacion++;
            }
        }
        System.out.println("La media de evaluaciones  para Matrix es: " + mediaEvaluacion / totalEvaluacion);
    }
}
