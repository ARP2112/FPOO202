import java.util.Scanner;

public class PagoHrs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Introduce el número de horas trabajadas: ");
        double horas_trabajadas = scanner.nextDouble();

        System.out.print("Introduce el costo por hora trabajada: ");
        double costo_hora = scanner.nextDouble();

        double Paga_Total = horas_trabajadas * costo_hora;

        System.out.printf("La paga que te corresponde es: %.1f pesos.%n ", Paga_Total);

    }
}
