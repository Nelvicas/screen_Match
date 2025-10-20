public class Decisiones {

    public static void main(String[] args) {
        int fechaDeLanzamiento = 1999;
        boolean incluidoEnElPlan = false;
        double notaDeLaPelicula = 8.2;
        String tipoPlan = "plus";


        // operadores relacionales

        if (fechaDeLanzamiento >= 2022){
            System.out.println("Peliculas mas populares");
        }else {
            System.out.println("Pelicula retro que aun vale la pena ver");
        }

        // operadores logicos

        if (incluidoEnElPlan || tipoPlan.equals("plus")){
            System.out.println("Disfrute su pelicula");
        }else{
            System.out.println("Pelicula no disponible para su plan actual");
        }


        //  Switch es una alternativa para if/else


        int dia = 3;
        switch (dia) {
            case 1:
                System.out.println("El día 1 es lunes");
                break;
            case 2:
                System.out.println("El día 2 es martes");
                break;
            case 3:
                System.out.println("El día 3 es miércoles");
                break;
            // otros casos posibles...
            default:
                System.out.println("Día no válido");
        }
    }
}
