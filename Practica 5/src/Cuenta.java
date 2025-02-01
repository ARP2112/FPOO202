import java.util.Scanner;

public class Cuenta {
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa un número entero positivo: ");
        int numero = scanner.nextInt();

        if (numero < 0) {
            System.out.println("El número debe ser entero. ");
            scanner.close();
            return;
        }
        StringBuilder cuentaAtras = new StringBuilder();

        for (int i = numero; i >= 0; i--) {
            if(cuentaAtras.length() > 0) {
                cuentaAtras.append(", ");
            }
            cuentaAtras.append(i);
        }
        System.out.println("La cuenta atrás es: " + cuentaAtras);
    }
}
