import java.util.Scanner;

public class PromedioArreglo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Declaramos un arr eglo de 5 calificaciones
        float[] calificaciones = new float[5];

        // Pedimos al usuario que llene el arreglo
        System.out.println("Ingresa 5 calificaciones:");

        for (int i = 0; i < 5; i++) {
            System.out.print("Calificación " + (i + 1) + ": ");
            calificaciones[i] = sc.nextFloat(); // Guardamos la calificación en el arreglo
        }

        // Llamamos a la función calcularPromedio y guardamos el resultado
        float promedio = calcularPromedio(calificaciones, 5);

        // Mostramos el promedio al usuario
        System.out.println("El promedio de las 5 calificaciones es: " + promedio);

        sc.close();
    }

    // Función que calcula el promedio de un arreglo de flotantes
    public static float calcularPromedio(float[] calificaciones, int tamaño) {
        float suma = 0; // Variable para acumular la suma de las calificaciones

        // Ciclo para recorrer el arreglo y sumar cada calificación
        for (int i = 0; i < tamaño; i++) {
            suma += calificaciones[i]; // Suma la calificación actual
        }

        // Retorna la suma dividida entre el número de elementos (promedio)
        return suma / tamaño;
    }
}

