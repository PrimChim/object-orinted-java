package workshop;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Banking {

    private static Map<String, Double> account_details = new HashMap<>();
    private static Scanner scan = new Scanner(System.in);
    
    public Banking() {
        System.out.println("Welcome to XYZ Bank");
    }

    private static boolean checkAccount(String name) {
        if (account_details.containsKey(name)) {
            return false;
        } else {
            return true;
        }
    }

    public static void createAccount(String name, double amount) {
        if (checkAccount(name)) {
            account_details.put(name, amount);
            System.out.println("Account created successfully");
        } else {
            System.out.println("Account already exists");
        }
    }

    public static void depositAmount(String name, double amount) {
        if (checkAccount(name)) {
            System.out.println("Account does not exist");
        } else if (amount < 0) {
            System.out.println("Invalid amount");
        } else {
            double currentAmount = account_details.get(name);
            account_details.put(name, currentAmount + amount);
            System.out.println("Amount deposited successfully");
        }
    }

    public static void withdrawAmount(String name, double amount) {
        if (checkAccount(name)) {
            System.out.println("Account does not exist");
        } else if (amount < 0) {
            System.out.println("Invalid amount");
        } else {
            double currentAmount = account_details.get(name);
            if (currentAmount < amount) {
                System.out.println("Insufficient balance");
            } else {
                account_details.put(name, currentAmount - amount);
                System.out.println("Amount withdrawn successfully");
            }
        }
    }

    public static void checkBalance(String name) {
        if (checkAccount(name)) {
            System.out.println("Account does not exist");
        } else {
            double currentAmount = account_details.get(name);
            System.out.println("Current balance: " + currentAmount);
        }
    }

    public static void quitProgram() {
        System.exit(0);
    }

    public static void switchCase(int choice, String name) {
        switch (choice) {
            case 1:
                System.out.println("Enter amount to deposit: ");
                double amount = scan.nextDouble();
                depositAmount(name, amount);
                break;
            case 2:
                System.out.println("Enter amount to withdraw: ");
                double amount1 = scan.nextDouble();
                withdrawAmount(name, amount1);
                break;
            case 3:
                checkBalance(name);
                break;
            case 4:
                quitProgram();
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }
    }
}
