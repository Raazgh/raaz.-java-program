public class Main
{
    public static void main(final String[] args)
    {
        final Bank bank;
        final BankAccount account1;
        final BankAccount account2;
        final BankAccount account3;
        final BankAccount account4;

        bank = new Bank("Bank of Kanada");
        account1 = new BankAccount(100.0,"abc111","woods");
        account2 = new BankAccount(200.0,"def222","gates");
        account3 = new BankAccount(300.0,"ghi333","bezos");
        account4 = new BankAccount(400.0,"jkl444","zuckerberg");

        Bank.addAccount(account1);
        Bank.addAccount(account2);
        Bank.addAccount(account3);
        Bank.addAccount(account4);

        Bank.depositeTo(22.22,"def222");
        Bank.getAccount("abc111").transfer(5.00,bank.getAccount("ghi333"));
        Bank.printAllCustomarsData():
    }
}









