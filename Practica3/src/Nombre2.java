import java.util.Scanner;

public class Nombre2 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce tu nombre: ");
        String nombre = scanner.nextLine();

        String nombreMay = nombre.toUpperCase();
        int longitud = nombre.length();

        System.out.println(nombreMay + " tiene " + longitud + " letras. ");
    }
}
