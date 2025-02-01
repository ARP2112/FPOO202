import java.util.Scanner;

public class Impares {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un número entero: ");
        int n = scanner.nextInt();

        if (n < 1) {
            System.out.println("El número debe ser entero. ");
            scanner.close();
            return;
        }
        StringBuilder impares = new StringBuilder();

        for (int i = 1; i <= n; i ++) {
            if (i % 2 != 0) {

                if (impares.length() > 0){
                    impares.append(", ");
            }
            impares.append(i);
        }
    }
    System.out.println("Números impares desde 1 hasta " + n + " : " + impares);
}
}
