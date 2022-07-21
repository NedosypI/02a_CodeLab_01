package com.cc.java;

public class App {
    
    public static void main(String[] args) {
     
        // die 10000 ist wichtig wegen def. von Konstruktor
    Konto konto1 = new Konto(10000);    
    System.out.println("Anfang: Konto1: " + konto1.getKontostand() + " €");

    Konto konto2 = new Konto(10000);    
    System.out.println("Anfang: Konto2: " + konto2.getKontostand() + " €");

    Konto konto3 = new Konto(10000);    
    System.out.println("Anfang: Konto3: " + konto3.getKontostand() + " €");

    System.out.println("-------------------------------");

    konto1.setKontostand(konto1.getKontostand() * 2);
    konto2.setKontostand(konto2.getKontostand() * 3);
    konto3.setKontostand(konto3.getKontostand() * 10);


    System.out.println("Aktuell: Konto1: " + konto1.getKontostand() + " €");
    System.out.println("Aktuell: Konto2: " + konto2.getKontostand() + " €");
    System.out.println("Aktuell: Konto3: " + konto3.getKontostand() + " €");

}


    }



    

    



