import java.util.Scanner;

public class Contraseña {
    public static void main(String[] args) {
        String ContraseñaG = "1234567890";

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese su contraseña: ");
        String ContraseñaI = scanner.nextLine();

        if (ContraseñaG.equalsIgnoreCase(ContraseñaI)) {
            System.out.println("Contraseña CORRECTA ");
        }
        else {
            System.out.println("Contraseña INCORRECTA ");

        }
    }
}
