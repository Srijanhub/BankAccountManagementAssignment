public class Main {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("1001", "Aarav Sharma", 5000.0);
        BankAccount account2 = new BankAccount("1002", "Priya Verma", 10000.0);

        account1.deposit(2000.0);
        account1.withdraw(1500.0);
        account1.withdraw(7000.0);

        account2.deposit(3000.0);
        account2.withdraw(5000.0);
        account2.withdraw(12000.0);

        System.out.println("Account 1 Details:");
        account1.displayDetails();
        account1.checkBalance();

        System.out.println();

        System.out.println("Account 2 Details:");
        account2.displayDetails();
        account2.checkBalance();
    }
}
