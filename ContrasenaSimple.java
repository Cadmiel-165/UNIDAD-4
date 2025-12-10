import java.util.Scanner;

public class ContrasenaSimple {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String contra = "Ingeniera2025";
        String intento;
        int intentos = 0;

        System.out.println("Ingresa la contraseña: ");

        intento = input.nextLine();
       //Mientras la contraseña esté mal y aún queden intentos, se vuelve a pedir
        while (!intento.equals(contra) && intentos < 3) {

            intentos++;  // contamos este intento

            if (intento.equals(contra)) {
                break;  // si ya la atinó, nos pelamos del while
            }

            // si no le atinó, pedimos de nuevo
            if (intentos < 3) {
                System.out.println("Contraseña incorrecta😕, inténtalo otra vez:");
                intento = input.nextLine();
            }
        }

         // si le atina a la contra
        if (intento.equals(contra)) {
            System.out.println("Acceso concedido");
        } else {
            System.out.println("Acceso denegado. Contacte a soporte.");
        }


    }




    }

