import java.util.Scanner;

public class BankManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double balance = 1000.00;
        int choice;

        do {
            System.out.println("\n===== BANK MANAGEMENT SYSTEM =====");
            System.out.println("1. Deposit Money");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter deposit amount: ");
                    double deposit = sc.nextDouble();

                    if (deposit > 0) {
                        balance += deposit;
                        System.out.println("Deposit successful!");
                        System.out.printf(
                            "Current balance: %.2f%n", balance
                        );
                    } else {
                        System.out.println(
                            "Deposit amount must be greater than zero."
                        );
                    }
                    break;

                case 2:
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawal = sc.nextDouble();

                    if (withdrawal <= 0) {
                        System.out.println(
                            "Withdrawal amount must be greater than zero."
                        );
                    } else if (withdrawal > balance) {
                        System.out.println("Insufficient balance!");
                    } else {
                        balance -= withdrawal;
                        System.out.println("Withdrawal successful!");
                        System.out.printf(
                            "Current balance: %.2f%n", balance
                        );
                    }
                    break;

                case 3:
                    System.out.printf(
                        "Available balance: %.2f%n", balance
                    );
                    break;

                case 4:
                    System.out.println(
                        "Thank you for using our banking system!"
                    );
                    break;

                default:
                    System.out.println(
                        "Invalid choice. Please select 1-4."
                    );
            }

        } while (choice != 4);

        sc.close();
    }
}