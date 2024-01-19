/**
 * A bank account program with 'deposit', 'withdraw', and 'transfer' functionalities
 *
 * @author raaz & sam ordonez
 * @version 1.0
 */

public class BankAccount
{
    private double       balanceCad;

    private final String accountNumber;
    private final String lastName;

    /**
     * @param balanceCad balance of bank account in CAD (canadian dollars)
     * @param accountNumber unique bank account number of person
     * @param lastName last name of the bank account owner
     */
    public BankAccount(final double balanceCad,
                       final String accountNumber,
                       final String lastName)
    {
        this.balanceCad = balanceCad;
        this.accountNumber = accountNumber;
        this.lastName = lastName;
    }

    /**
     * Withdraws money from bank account in CAD (canadian dollars)
     * @param amountCad amount of money in CAD (canadian dollars)
     */
    public void withdraw(double amountCad)
    {
        this.balanceCad -= amountCad;
    }

    /**
     * Deposits money into bank account in CAD (canadian dollars)
     * @param amountCad amount of money in CAD (canadian dollars)
     */
    public void deposit(double amountCad)
    {
        this.balanceCad += amountCad;
    }

    /**
     * Transfers amount of money in CAD into another bank account number
     * @param amountCad amount of money in CAD
     * @param recipientAccount account number of person receiving the transferred money in CAD (canadian dollars)
     */
    public void transfer(double amountCad,
                         final BankAccount recipientAccount)
    {
        recipientAccount.deposit(amountCad);
        this.withdraw(amountCad);
    }

    // Accessors

    /**
     *
     * @return balance amount in CAD (canadian dollars)
     */
    public double getBalanceCad()
    {
        return balanceCad;
    }

    /**
     * @return the unique bank account number of person
     */
    public String getAccountNumber()
    {
        return accountNumber;
    }

    /**
     * @return the unique last name of the bank account member
     */
    public String getMemberLastName()
    {
        return lastName;
    }
}
