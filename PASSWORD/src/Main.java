import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        int length = getLength();
        boolean includeUppercase = confirmOption("¿Quieres incluir mayúsculas?");
        boolean includeSpecials = confirmOption("¿Quieres incluir caracteres especiales?");

        Password generator = new Password(length, includeUppercase, includeSpecials);

        JOptionPane.showMessageDialog(null,
                "Contraseña: " + generator.getPassword() +
                "\nFortaleza: " + generator.checkPasswordStrength());

    }
    public static int getLength() {
        String input = JOptionPane.showInputDialog("Ingresa la longitud deseada de tu contraseña (por defecto 8):");
        try {
            int length = Integer.parseInt(input);
            return Math.max(length, 8);
        }
        catch (NumberFormatException e) {
            return 8;
        }
    }
    public static boolean confirmOption(String message) {
        int response = JOptionPane.showConfirmDialog(null, message, "Confirmación", JOptionPane.YES_NO_OPTION);
        return response == JOptionPane. YES_OPTION;
    }
}