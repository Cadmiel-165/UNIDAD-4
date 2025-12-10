 import java.util.Scanner;

public class VCF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[3];
        int i = 0;

        while (i < 3) {
            System.out.println("Ingresa un número mayor a 0:");
            int n = sc.nextInt();
            if (n > 0) {
                numeros[i] = n;
                i++;
            } else {
                System.out.println("El número debe ser mayor a 0, intenta de nuevo:");
            }
        }

        for (i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                numeros[i] += 5;
            } else {
                numeros[i] -= 1;
            }
        }

        int suma = 0;
        for (i = 0; i < numeros.length; i++) {
            suma += numeros[i];
        }

        int VCF = suma * 3;
        System.out.println("El VCF es: " + VCF);

        sc.close();
    }
}



