package org.example;

public class User {
    private String imie;
    private String nazwisko;
    private String login;
    private int pesel;
    private int numerKonta;
    private double saldo;

    public User(String imie, String nazwisko, int pesel) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.pesel = pesel;
        this.login = loginGenerator(imie, nazwisko);
        this.saldo = 100;
        this.numerKonta = 1;
    }

    public String loginGenerator(String imie, String nazwisko) {
        return (imie.substring(0, 3) + nazwisko.substring(0, 3));
    }

    public void uzytkownikDetails(){
        System.out.println("Numer konta: "+numerKonta+ "\n Imię: "+imie+"\n Nazwisko: "+nazwisko+"\n Login: "+login+"\n PESEL: "+pesel+"\n Saldo: "+saldo);
    }
}
