package com.ttc;

import java.util.Scanner;
public class WhileLoopATMWithDrawl {
   
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double balance = 5000.0;  // Initial account balance
        double withdrawalAmount;

        while (true) { // Infinite loop until user exits
            System.out.println("\n💳 ATM Withdrawal System");
            System.out.println("Current Balance: $" + balance);
            System.out.print("Enter withdrawal amount (or 0 to exit): ");
            
            withdrawalAmount = scanner.nextDouble();

            if (withdrawalAmount == 0) {
                System.out.println("✅ Transaction ended. Thank you!");
                break; // Exit the loop
            }

            if (withdrawalAmount > balance) {
                System.out.println("❌ Insufficient balance. Try a lower amount.");
            } else {
                balance -= withdrawalAmount;
                System.out.println("✅ Withdrawal successful! New Balance: $" + balance);
            }

            if (balance == 0) {
                System.out.println("❌ No funds left. Exiting...");
                break;
            }
        }

        scanner.close();
    }
}
