import java.util.Scanner;

public class ContadorVocales {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Creamos un a rreglo de 10 caracteres
        char[] letras = new char[10];

        // Pedimos al usuario que escriba 10 letras
        System.out.println("Ingresa 10 letras en minúsculas:");

        // Ciclo para guardar cada letra en el arreglo
        for (int i = 0; i < 10; i++) {
            System.out.print("Letra " + (i + 1) + ": ");
            //Aquí vamos guardando la letra que pone el usuario, llenando el arreglo de atrás hacia adelante.
            letras[i] = sc.next().charAt(0);  // Guardamos solo el primer carácter
        }

        // Contador para saber cuántas vocales hay
        int contadorVocales = 0;

        // Recorremos el arreglo para buscar vocales
        for (int i = 0; i < 10; i++) {

            // Si la letra es una vocal, aumentamos el contador
            if (letras[i] == 'a' || letras[i] == 'e' || letras[i] == 'i' || letras[i] == 'o' || letras[i] == 'u') {
                contadorVocales++;
            }
        }

        // Mostramos el total de vocales encontradas
        System.out.println("Cantidad de vocales: " + contadorVocales);
    }
}

