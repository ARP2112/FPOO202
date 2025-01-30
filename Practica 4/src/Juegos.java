import java.util.Scanner;

public class Juegos {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce la edad del cliente: ");
        int edad = scanner.nextInt();

        int precio;
        if (edad < 4) {
            precio = 0;
        }
        else if (edad <= 18) {
            precio = 110;
        }
        else  {
            precio = 190;
        }

        if (precio == 0) {
            System.out.println("La entrada es GRATIS ");

        }
        else {
            System.out.println("El costo de la entrada es $ " + precio);
        }
    }
}
