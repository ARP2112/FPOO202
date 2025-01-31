import java.util.Scanner;


public class Palindromo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce una cadena de texto: ");
        String cadena = scanner.nextLine();

        String cadenaL = cadena.replaceAll("\\s+", "").toLowerCase();

        if (esPalindromo(cadenaL)) {
            System.out.println("La cadena es un palindromo.");
        }
        else {
            System.out.println("La cadena NO ES UN PALINDROMO.");
        }
    }
    public static boolean esPalindromo(String str) {
        int inicio = 0;
        int fin = str.length() - 1;

        while (inicio < fin) {
            if (str.charAt(inicio) != str.charAt(fin)) {
                return false;
            }
            inicio++;
            fin--;
        }
        return true;
    }

        }


