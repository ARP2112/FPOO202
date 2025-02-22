import javax.swing.*;

public class Password {
    public String password;

    public Password(int length, boolean includeUppercase, boolean includeSpecials) {
        this.password = generatePassword(length, includeUppercase, includeSpecials);
    }

    public String getPassword(){
        return password;
    }

    public String generatePassword(int length, boolean includeUppercase, boolean includeSpecials) {
        String lowercase = "abcdefghijklmnñopqrstuvwxyz";
        String uppercase = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
        String digits = "123456789";
        String specials = "!#$%&/()=?¡¿'-_.,:;+*[]{}<>^";

        String characters = lowercase + digits;
        if (includeUppercase) characters += uppercase;
        if (includeSpecials) characters += specials;

        char[] passwordArray = new char[length];
        for (int i = 0; i < length; i++){
            int index = (int) (Math.random() * characters.length());
            passwordArray[i] = characters.charAt(index);
        }
        return new String(passwordArray);
    }

    public String checkPasswordStrength() {
        int score = 0;
        if (password.length() >= 8) score++;
        if (password.matches(".*[A-Z].*")) score++;
        if (password.matches(".*[0-9].*")) score++;
        if (password.matches(".*[!#$%&/()=?¡¿'-_.,:;+*{}<>].*")) score++;

        switch (score) {
            case 4: return "Muy fuerte";
            case 3: return "Fuerte";
            case 2: return "Media";
            case 1: return "Débil";
            default: return "Muy débil";

        }
    }


}
