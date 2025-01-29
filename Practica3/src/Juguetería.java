import java.util.Scanner;

public class Juguetería {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el número de payasos vendidos: ");
        int payasos = scanner.nextInt();

        System.out.print("Introduce el número de muñecas vendidas: ");
        int muñecas = scanner.nextInt();

        final int pesoPayaso = 112;
        final int pesoMuñeca = 75;

        int pesoTotal = (payasos * pesoPayaso) + (muñecas * pesoMuñeca);

        System.out.println("El peso total del paquete es: " + pesoTotal + "gramos.");

    }
}
