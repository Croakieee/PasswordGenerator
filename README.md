# Password Generator

A Java program for generating random passwords with customizable options.

## Features

- Generate passwords of specified length.
- Include or exclude uppercase letters, lowercase letters, digits, and special characters.
- Ensure at least one character set is selected.
- Display a warning if no character set is selected.
- Generate passwords based on a custom pattern.

## How to Use

1. Clone or download the repository.
2. Open the project in your Java development environment.
3. Run the `PasswordGenerator` class to generate a random password.
4. Adjust the options in the `main` method to customize password generation.

## Example

```java
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
