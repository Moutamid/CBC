package com.moutamid.bankingapp.model;

public class TransactionModel {
    public int icon;
    public String top, bottom, money, heure, detailOpr, adresse, numero, dateOpe, dateVal;

    public TransactionModel(int icon, String top, String bottom, String money, String heure, String detailOpr, String adresse, String numero, String dateOpe, String dateVal) {
        this.icon = icon;
        this.top = top;
        this.bottom = bottom;
        this.money = money;
        this.heure = heure;
        this.detailOpr = detailOpr;
        this.adresse = adresse;
        this.numero = numero;
        this.dateOpe = dateOpe;
        this.dateVal = dateVal;
    }
}
