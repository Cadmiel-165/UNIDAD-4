import java.util.Scanner;

public class PerImpar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pedimos al usuario que ingrese un número entero positivo
        System.out.print("Ingresa un número entero positivo: ");
        int N = sc.nextInt();

        // Llamamos a la función para generar la secuencia
        generarSecuencia(N);
    }

    // Función que genera la secuencia desde 1 hasta N
    public static void generarSecuencia(int N) {
        // Ciclo para recorrer del 1 hasta N
        for (int i = 1; i <= N; i++) {
            // Verificamos si el número es divisible entre 2
            if (i % 2 == 0) {
                System.out.println("Par"); // Si es divisible, es par
            } else {
                System.out.println("Impar"); // Si no, es impar
            }
        }
    }
}

