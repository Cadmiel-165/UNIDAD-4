import java.util.Scanner;

public class ConversorUnidades {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double valor;   // aquí guardamos el número que el usuario quiere convertir
        int opcion;     // aquí guardamos qué conversión eligió el usuario (1, 2 o 3)

        // Pedimos el valor pa convertir
        System.out.println("Ingresa el valor que quieres convertir:");
        valor = input.nextDouble();  // guardamos ese número

        // Mostramos el menú para que escoja
        System.out.println("¿Qué conversión quieres hacer?");
        System.out.println("1. Kilómetros a Millas");
        System.out.println("2. Centígrados a Fahrenheit");
        System.out.println("3. Metros a Pies");
        opcion = input.nextInt();   // guardamos la opción que el usuario escogió

        // Aquí usamos switch para elegir qué fórmula aplicar según la opción
        switch (opcion) {
            case 1:
                // km → millas   (multiplicamos por 0.621371)
                System.out.println("Resultado: " + (valor * 0.621371) + " millas");
                break;

            case 2:
                // °C → °F   (fórmula: C * 9/5 + 32)
                System.out.println("Resultado: " + (valor * 9/5 + 32) + " °F");
                break;

            case 3:
                // metros → pies   (multiplicamos por 3.28084)
                System.out.println("Resultado: " + (valor * 3.28084) + " pies");
                break;

            default:
                // Si el usuario no eligió 1, 2 o 3
                System.out.println("Opción no válida 😕");
        }
    }
}

