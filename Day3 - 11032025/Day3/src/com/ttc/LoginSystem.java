package com.ttc;
import java.util.Scanner;

public class LoginSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String correctPassword = "secure123";  // Predefined password
        String enteredPassword;
        int attempts = 0;
        int maxAttempts = 3;

        while (attempts < maxAttempts) {  
            System.out.print("Enter your password: ");
            enteredPassword = scanner.nextLine();
            
            if (enteredPassword.equals(correctPassword)) {
                System.out.println("✅ Login successful! Welcome!");
                break;  // Exit loop if the password is correct
            } else {
                attempts++;
                System.out.println("❌ Incorrect password. Attempts left: " + (maxAttempts - attempts));
                if (attempts < maxAttempts) {
                    System.out.println("🔁 Try again...");
                    continue;  // Skip the rest of the loop and ask for the password again
                }
            }

            if (attempts == maxAttempts) {
                System.out.println("⛔ Too many failed attempts. Account locked.");
            }
        }

        scanner.close();
    }
}
