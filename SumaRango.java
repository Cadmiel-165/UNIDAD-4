import java.util.Scanner;

public class SumaRango {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int A, B;
        int suma = 0;

        // Pedimos los dos núme ros
        System.out.println("Ingresa el inicio del rango (A): ");
        A = input.nextInt();

        System.out.println("Ingresa el fin del rango (B): ");
        B = input.nextInt();

        // Si A es mayor que B, avisamos y terminamos
        if (A > B) {
            System.out.println("A debe ser menor o igual que B 😊");
            return;
        }

        // Usamos un ciclo for para sumar desde A hasta B
        for (int i = A; i <= B; i++) {
            suma += i;  // vamos sumando cada número
        }

        // Mostramos el resultado final
        System.out.println("La suma desde " + A + " hasta " + B + " es: " + suma);
    }
}

