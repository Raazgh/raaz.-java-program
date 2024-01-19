import com.sun.source.tree.UsesTree;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Bank
{
    private final String bankName;
    final Map<String,BankAccount> account;

     public Bank(final String bankName)
    {
        this.bankName = bankName;
        this.account = new HashMap<>();
    }


    public void addAcount(final BankAccount account)
    {
         this.account.put(account.getAccountNumber(),account);
    }

    public BankAccount getAccount(String accountNumber)
    {
         return account.get(accountNumber);
    }

    public void removeAccount(BankAccount account)
    {
         this.account.remove(account.getAccountNumber(),account);
    }
    public int getAccountNumber()
    {
         return account.size();
    }

    public Double getTotalAccountBalance(){
          Double totalCdn=0.0;
          final Set<String> keys;
          keys = account.keySet();
          for (final String key : keys){
              final BankAccount accounts = account.get(key);
              totalCdn+=accounts.getBalanceCad();
          }
          return totalCdn;}

    public void depositeTo(double accountCdn, String accpuntNymber){
         account.get(accountCdn).deposit(accountCdn);
     }


     public void printAllCustomerDate(){
         final Set<String> keys;
         keys=account.keySet();
         for (final String key : keys){
             final BankAccount accounts = account.get(key);

             System.out.println("Customer"+ accounts.getMemberLastName()+" has"+accounts.getBalanceCad()+"in accpont"+accounts.getAccountNumber());
             System.out.println("Total bank ballance in all account for"+ bankName +"is"+ getTotalAccountBalance());}
     }

}
