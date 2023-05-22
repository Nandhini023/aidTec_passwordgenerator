
import java.util.Random;
import java.util.Scanner;

public class passwordgenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);        
        System.out.print("Enter the length of the password: ");
        int length = scanner.nextInt();        
        System.out.print("Enter the character set (1: Uppercase, 2: Lowercase, 3: Numbers, 4: Special Characters): ");
        String characterSet = scanner.next();
        String password = generatePassword(length, characterSet);
        System.out.println("Generated Password: " + password);
        scanner.close();
    }    
    public static String generatePassword(int length, String characterSet) {
        StringBuilder password = new StringBuilder();
        
        String uppercaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowercaseLetters = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
        String specialCharacters = "!@#$%^&*()-_=+\\|[{]};:'\",<.>/?";
        
        String chosenCharacters = "";
        
        if (characterSet.contains("1")) {
            chosenCharacters += uppercaseLetters;
        }
        
        if (characterSet.contains("2")) {
            chosenCharacters += lowercaseLetters;
        }
        
        if (characterSet.contains("3")) {
            chosenCharacters += numbers;
        }
        
        if (characterSet.contains("4")) {
            chosenCharacters += specialCharacters;
        }
        
        Random random = new Random();
        
        for (int i = 0; i < length; i++) {
            int randomIndex = random.nextInt(chosenCharacters.length());
            char randomChar = chosenCharacters.charAt(randomIndex);
            password.append(randomChar);
        }
        
        return password.toString();
       
    }
    
}

