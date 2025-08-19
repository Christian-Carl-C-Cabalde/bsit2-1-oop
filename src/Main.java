public class Main {
    public static void main (String[] args){
        bankAccount account1 = new bankAccount("dudots", 2000);
        bankAccount account2 = new bankAccount("jose", 3000);
        bankAccount account3 = new bankAccount("jd", 4000);

        account1.displayAccountInfo();
    }
}