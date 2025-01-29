import java.util.Scanner;

public class Nombre {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce tu nombre completo: ");
        String nombre_Completo = scanner.nextLine();

        System.out.println("Nombre completo en Minusculas: " + nombre_Completo.toLowerCase());

        System.out.println("Nombre completo en Mayusculas: " + nombre_Completo.toUpperCase());

        String[] palabras = nombre_Completo.trim().split("\\s+");

        StringBuilder nombreFormateado = new StringBuilder();

        for (String palabra : palabras) {
            if (!palabra.isEmpty()) {
                nombreFormateado.append(palabra.substring(0,1).toUpperCase());
                nombreFormateado.append(palabra.substring(1).toLowerCase());
                nombreFormateado.append(" ");

        System.out.println("Nombre con la primera letra de cada palabra mayúscula: " + nombreFormateado.toString().trim());



            }
        }




    }
}
