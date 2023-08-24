public class BankMain {
    public static void main(String[] args) {
    BankAccount bank1 = new BankAccount("William", 2000);

    bank1.withdraw(200);
    bank1.deposit(3000);
    bank1.withdraw(2000);

    System.out.println(bank1.getOwner());
    System.out.println(bank1.getBalance());

    }
}
