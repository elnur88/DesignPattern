package com.company.BridgeDesignPattern;


public class Client {
    public static void main(String[] args) {

        MoneyAccountAbstraction usdAccount = new UsdAccount();
        BankAbstraction usdManagerOfBankPasha = new BankPasha(usdAccount);

        MoneyAccountAbstraction eurAccount = new UsdAccount();
        BankAbstraction eurManagerOfBankPasha = new BankPasha(eurAccount);

        usdManagerOfBankPasha.depositUsd(250);
        eurManagerOfBankPasha.depositEuro(480);

        usdManagerOfBankPasha.account.showBalance();
        eurManagerOfBankPasha.account.showBalance();


        usdManagerOfBankPasha.depositUsd(250);
        usdManagerOfBankPasha.account.showBalance();

    }
}
