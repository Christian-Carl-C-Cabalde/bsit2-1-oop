public class Main {
    public static void main(String[] args) {
        System.out.println("Bank Name: " + bankAccount.bankName);
        System.out.println("Interest Rate: " + (bankAccount.interestRate * 100) + "%\n");

        bankAccount account1 = new bankAccount("Cabalde", 1000);
        bankAccount account2 = new bankAccount("Johnden", 2500);
        bankAccount account3 = new bankAccount("Ashton", 500);

        System.out.println("\n═══ Account Operations ═══");
        account1.deposit(500);
        account2.withdraw(300);

        System.out.println("\n═══ Interest Calculation ═══");
        System.out.println("Cabalde's interest: $" + account1.calculateInterest());
        System.out.println("Johnden's interest: $" + account2.calculateInterest());
        System.out.println("Ashton's interest: $" + account3.calculateInterest());

        System.out.println("\nTotal Accounts Created: " + BankAccount.totalAccounts);
    }
}