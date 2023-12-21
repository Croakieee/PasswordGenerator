import java.security.SecureRandom;

public class PasswordGenerator {

    private static final String UPPER = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String LOWER = "abcdefghijklmnopqrstuvwxyz";
    private static final String DIGITS = "0123456789";
    private static final String SPECIAL = "!@#$%^&*()-_=+[]{}|;:'\",.<>?/";

    public static String generatePassword(int length, boolean useUppercase, boolean useLowercase, boolean useDigits, boolean useSpecial) {
        StringBuilder password = new StringBuilder();
        SecureRandom random = new SecureRandom();

        String characters = "";
        if (useUppercase) characters += UPPER;
        if (useLowercase) characters += LOWER;
        if (useDigits) characters += DIGITS;
        if (useSpecial) characters += SPECIAL;

        if (characters.isEmpty()) {
            throw new IllegalArgumentException("At least one character set must be selected.");
        }

        for (int i = 0; i < length; i++) {
            int index = random.nextInt(characters.length());
            password.append(characters.charAt(index));
        }

        return password.toString();
    }

    public static String generatePasswordWithPattern(int length, String pattern) {
        StringBuilder password = new StringBuilder();
        SecureRandom random = new SecureRandom();

        for (int i = 0; i < length; i++) {
            int index = random.nextInt(pattern.length());
            password.append(pattern.charAt(index));
        }

        return password.toString();
    }

    public static void main(String[] args) {
        int passwordLength = 12;
        boolean useUppercase = true;
        boolean useLowercase = true;
        boolean useDigits = true;
        boolean useSpecial = true;

        String generatedPassword = generatePassword(passwordLength, useUppercase, useLowercase, useDigits, useSpecial);
        System.out.println("Generated Password: " + generatedPassword);

        String pattern = "Aa0!"; // Uppercase, lowercase, digit, special character
        String patternPassword = generatePasswordWithPattern(passwordLength, pattern);
        System.out.println("Generated Password with Pattern: " + patternPassword);
    }
}
