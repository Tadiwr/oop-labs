package com.tadiwa.account;

import java.util.List;

public class AccountDemo {

    public static void main(String[] args) {
        List<Account> accounts = List.of(
                new SavingsAccount(100),
                new CurrentAccount(43)
        );

        // EXPLAIN: deposit 60 into each account, did not have to define
        // method on both `SavingsAccount.java` and `CurrentAccount.java`
        accounts.forEach(a -> a.deposit(60));

        // EXPLAIN: apply monthly fee/charge to each account
        accounts.forEach(Account::monthlyFee);

        // EXPLAIN: print the balances
        accounts.forEach(a -> {
            System.out.println(a.name + " balance: " + a.balance);
        });

    }

}
