public class bankAccount {
    static String bankName = "Liceo Bank";
    static int totalAccounts = 0;
    static double interestRate = 0.03;
    static int accountCount = 1;

    String accountNumber;
    String accountHolderName;
    double balance;

    bankAccount (String accountName, double initialBalance){
        accountNumber = generateAccountNumber();
        accountHolderName = accountName;
        balance = initialBalance;
        totalAccounts++;
        System.out.println("Account Created " + accountNumber + " for " + accountName + " with initial balance: $" + initialBalance);
    }

    static String generateAccountNumber(){
        return String.format("ACC%03d", accountCount++);
    }

    double calculateInterest(){
        return balance * interestRate;
    }

    public void displayAccountInfo(){
        System.out.println("Bank Name: " + bankName + "\nInterest Rate: " + interestRate);
    }
}
