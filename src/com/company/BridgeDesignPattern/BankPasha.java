package com.company.BridgeDesignPattern;

public class BankPasha extends BankAbstraction{

    public BankPasha(MoneyAccountAbstraction account) {
        super(account);
    }

    @Override
    void depositUsd(double amount) {
        //check control 2;
        account.deposit(amount);
    }

    @Override
    void depositEuro(double amount) {
        //check control 6;
        account.deposit(amount);
    }
}
