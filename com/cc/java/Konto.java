package com.cc.java;

public class Konto {

    private int kontostand;
    private int ueberkredit;

    
    //Konstruktor
    public Konto() {
    }

    public Konto(int kontostand) {
        this.kontostand = kontostand;
    }


// public Konto(double ueberkredit) {
//         this.ueberkredit = ueberkredit;
//     }

public Konto(int kontostand, int ueberkredit) {
        this.kontostand = kontostand;
        this.ueberkredit = ueberkredit;
    }


    //Getter /Setter
    public int getKontostand() {
        return kontostand;
    }

    public int getUeberkredit() {
        return ueberkredit;
    }

    public void setKontostand(int kontostand) {
        this.kontostand = kontostand;
    }

    public void setUeberkredit(int ueberkredit) {
        this.ueberkredit = ueberkredit;
    }

    // Kombination: int returnKontostand => holen
    // int kontostand => übergeben
public int returnKontostand(int kontostand){
    return kontostand + ueberkredit;
}


        
    }
    
    
    

