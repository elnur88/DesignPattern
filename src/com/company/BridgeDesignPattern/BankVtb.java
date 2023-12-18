package com.company.BridgeDesignPattern;

public class BankVtb extends BankAbstraction{

    public BankVtb(MoneyAccountAbstraction account) {
        super(account);
    }

    @Override
    void depositUsd(double amount) {
        //check control 5;
        account.deposit(amount);
    }

    @Override
    void depositEuro(double amount) {
        //check control 2;
        account.deposit(amount);
    }
}
