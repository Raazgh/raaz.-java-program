/**
 * information of a Bank account
 * @author hamraz
 * version 1.0
 */

public class Bank
{
    private double ballanceCdn;
    private final String accountNumber;
    private final String memberLastName;

    /**
     * @param ballanceCdn is the ballance of an account in the bank
     * @param accountNumber is the account number which is a string
     * @param memberLastName is the name and last name of user of the bank
     */

    public Bank(final double ballanceCdn,
                final String accountNumber,
                final String memberLastName)


    {
        this.ballanceCdn    = ballanceCdn;
        this.accountNumber  = accountNumber;
        this.memberLastName = memberLastName;

    }

    /**
     * this gets money from bank account
     * @param  amountCdn is the amount of money that is going away.
     */
    public void withdraw(double amountCdn) {
        this.ballanceCdn -= amountCdn;
    }
    /**
     * the money that is going to be added to an account
     * @param amountCdn the amont that is adding up
     */
    public void deposite(double amountCdn) {this.ballanceCdn += amountCdn;}
    /**
     * the amount money from one bank account to another
     * @param amountCdn
     */
    public void transfer(double amountCdn, final Bank transfering) {
        transfering.deposite(amountCdn);
        this.withdraw(amountCdn);
    }
    /**
     * @return the amount of ballance in  the bank account
     */
    public double getBallanceCdn () {
        return ballanceCdn;
    }
    /**
     * @return the account number
     */
    public String getAccountNumber () {
        return accountNumber;
    }
    /**
     * @return the last name of the bank account
     */

    public String getMemberLastName () {
        return memberLastName;
    }
}
