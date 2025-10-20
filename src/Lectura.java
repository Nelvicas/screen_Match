
/*

La clase Scanner de Java se utiliza para leer datos de entrada en un programa Java.
Estos datos pueden ser leídos desde varias fuentes de entrada, como archivos,
flujos de entrada, cadenas e incluso la entrada del usuario a través del teclado


Luego, utilizamos el método ‘nextLine()’ para leer una línea de texto

 */


import java.util.Scanner;

public class Lectura {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escribe el nombre de tu pelicula favorita: ");
        String pelicula = teclado.nextLine();
        System.out.println("Escribe la fecha de lanzamiento: ");
        int fechaeLanzamiento = teclado.nextInt();
        System.out.println("Que not le das a esta pelicula: ");
        double nota = teclado.nextDouble();

        System.out.println(pelicula);
        System.out.println(fechaeLanzamiento);
        System.out.println(nota);
    }
}
