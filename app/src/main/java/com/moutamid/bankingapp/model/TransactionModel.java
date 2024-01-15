package com.moutamid.bankingapp.model;

public class TransactionModel {
    public int icon;
    public String top, bottom, money;

    public TransactionModel(int icon, String top, String bottom, String money) {
        this.icon = icon;
        this.top = top;
        this.bottom = bottom;
        this.money = money;
    }
}
