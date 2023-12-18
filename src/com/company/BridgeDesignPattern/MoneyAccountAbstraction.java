package com.company.BridgeDesignPattern;

abstract class MoneyAccountAbstraction implements MoneyAccount{
    protected double totalAmount;
    protected boolean isActive;

    public MoneyAccountAbstraction() {
        totalAmount = 0;
        isActive = true;
    }

    @Override
    public void deposit(double amount) {
        if (isActive) {
            totalAmount+=amount;
        }
    }

    @Override
    public void witdraw(double amount) {
        if(isActive){
            totalAmount-=amount;
        }
    }

    @Override
    public void showBalance() {
        System.out.println("Cari Balans : "+totalAmount);
    }
}
