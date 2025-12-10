import java.util.Scanner;

public class BusquedaNumero {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Declaramos un arreglo de 7 números enteros (valores de ejemplo)
        int[] numeros = {4, 12, 7, 9, 15, 3, 10};

        // Pedimos al usuario el número que quiere buscar
        System.out.print("Ingresa el número que quieres buscar: ");
        int buscado = sc.nextInt();

        // Variable para recorrer el arreglo con while
        int i = 0;

        // Bandera para saber si encontramos el número
        boolean encontrado = false;

        // Ciclo while para revisar cada número del arreglo
        while (i < 7 && !encontrado) {
            // Se repite mientras no lleguemos al final del arreglo
            // y mientras aún no lo hayamos encontrado

            // Revisamos si el número en la posición i es el que buscamos
            if (numeros[i] == buscado) {
                System.out.println("Número encontrado en la posición: " + i);
                encontrado = true;   // Activamos la bandera
            }

            // Aumentamos i para pasar al siguiente número
            i++;
        }

        // Si terminado el ciclo la bandera sigue en false, no se encontró
        if (!encontrado) {
            System.out.println("El número no se encuentra en el arreglo.");
        }
    }
}
