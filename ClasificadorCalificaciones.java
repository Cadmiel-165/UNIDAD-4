import java.util.Scanner;

public class ClasificadorCalificaciones {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Pedimos la calificación al usuario
        System.out.println("Ingresa la calificación (0-100):");
        int calificacion = input.nextInt();

        // Llamamos a la función que está abajo
        String resultado = clasificarCalificacion(calificacion);

        // Mostramos el resultado
        System.out.println("La calificación es: " + resultado);

        input.close();
    }

    // Función
    public static String clasificarCalificacion(int calificacion) {
        if (calificacion >= 90 && calificacion <= 100) {
            return "Sobresaliente";
        } else if (calificacion >= 80 && calificacion <= 89) {
            return "Notable";
        } else if (calificacion >= 70 && calificacion <= 79) {
            return "Aprobatorio";
        } else if (calificacion >= 0 && calificacion <= 69) {
            return "Reprobatorio";
        } else {
            return "Calificación inválida";
        }
    }
}
