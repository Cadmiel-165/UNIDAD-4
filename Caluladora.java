import java.util.Scanner;

public class Caluladora {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int opcion;
        double area;
        double radio;
        double base;
        double altura;

        System.out.println("===Calculadora de área de Círculo o Rectangulo🤓===");
        System.out.println("Escribe 1 para circulo o 2 para rectangulo🤗");
        opcion = input.nextInt();

        if (opcion == 1) {
            System.out.print("Introduce el radio: ");
            radio = input.nextDouble();

            area = Math.PI * radio * radio;
            System.out.println("Área del círculo: " + area);

            if (area > 100) {
                System.out.println("El área es mayor que 100 unidades cuadradas.");
            } else {
                System.out.println("El área es menor o igual a 100 unidades cuadradas.");
            }
        }
        else if (opcion == 2) {
            System.out.print("Introduce la base: ");
            base = input.nextDouble();

            System.out.print("Introduce la altura: ");
            altura = input.nextDouble();

            area = base * altura;
            System.out.println("Área del rectángulo: " + area);

            if (area > 100) {
                System.out.println("El área es mayor que 100 unidades cuadradas.");
            } else {
                System.out.println("El área es menor o igual a 100 unidades cuadradas.");
            }
        }
        else {
            System.out.println("Opción inválida😧. Por favor selecciona 1 para círculo o 2 para rectángulo.");
        }

    }


}
