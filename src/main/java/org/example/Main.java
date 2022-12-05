package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Witaj w naszym Banku!");
        System.out.println("Wprowadź imię.");
        Scanner scanner = new Scanner(System.in);
        String imie = scanner.nextLine();
        System.out.println("Wprowadź nazwisko.");
        String nazwisko = scanner.nextLine();
        System.out.println("Wprowadź PESEL.");
        int pesel = scanner.nextInt();

        User uzytkownik = new User(imie, nazwisko, pesel);

        int opcja;
        do {
            System.out.println("Menu: \n 1 - Informacje o koncie \n 2 - Wpłata pieniędzy \n 3 - Wypłata pieniędzy \n 4 - Wyjście");
            System.out.println("Wybierz opcję.");
            opcja = scanner.nextInt();
            switch (opcja) {
                case 1:
                    System.out.println("Informacje o koncie:");
                    uzytkownik.uzytkownikDetails();
                    break;
                case 2:
                    System.out.println("Wprowadź kwotę, jaką chcesz wpłacić.");
                    double moneyToDeposit = scanner.nextDouble();
                    uzytkownik.deposit(moneyToDeposit);
                    System.out.println("Aktualny stan konta: " + uzytkownik.getSaldo());
                    break;
                case 3:
                    System.out.println("Wprowadź kwotę, jaką chcesz wypłacić.");
                    double moneyWithdraw = scanner.nextDouble();
                    uzytkownik.withdraw(moneyWithdraw);
                    System.out.println("Saldo twojego konta wynosi: " + uzytkownik.getSaldo());
                case 4:
                    System.out.println("Do zobaczenia! :)");
                    break;

            }
        }
        while(opcja!=4);
    }
}