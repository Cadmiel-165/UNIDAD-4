import java.util.Scanner;

public class InversorArreglo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Declaramos un arreglo de 5 enteros
        int numeros[] = new int[5];

        // Pedimos al usuario que ing rese 5 números
        System.out.println("Ingresa 5 números enteros:");
        //mientras i sea menor que 5, se repite, y cada vez que termina una vuelta le suma 1
        for (int i = 0; i < 5; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt(); // Guardamos cada número en el arreglo
        }

        //recorre el arreglo desde la última posición hasta la primera, imprimiendo los números al revés
        System.out.println("\nLos números en orden inverso son:");
        for (int i = 4; i >= 0; i--) {
            System.out.println(numeros[i]);
        }

        sc.close();
    }
}

