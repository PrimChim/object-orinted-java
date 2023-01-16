package workshop;

import java.util.Scanner;

public class BankingTransaction {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Banking b = new Banking();
        while (true) {
            System.out.println("Enter name to create account: ");
            String name = scan.nextLine();
            System.out.println("Enter amount to deposit: ");
            double amount = scan.nextDouble();
            b.createAccount(name, amount);
            System.out.println("Enter 1 to deposit, 2 to withdraw, 3 to check balance, 4 to quit");
            int choice = scan.nextInt();
            b.switchCase(choice, name);
            }
        }
}