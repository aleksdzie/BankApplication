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

        System.out.println("Menu: \n 1 - Informacje o koncie \n 2 - Wpłata pieniędzy \n 3 - Wypłata pieniędzy \n 4 - Wyjście");
        System.out.println("Wybierz opcję.");
        int opcja = scanner.nextInt();
        switch (opcja) {
            case 1:
                System.out.println("Informacje o koncie:");
                uzytkownik.uzytkownikDetails();
                break;
            case 2:
                System.out.println("Wprowadź kwotę, jaką chcesz wpłacić.");
                double moneyToDeposit = scanner.nextDouble();
                uzytkownik.deposit(moneyToDeposit);
                System.out.println("Aktualny stan konta: " +uzytkownik.getSaldo());
                break;
//            case 3:
//                System.out.println("Wprowadź kwotę, jaką chcesz wypłacić.");
//                int kwota2 = scanner.nextInt();
//                if (kwota2 > saldo) {
//                    System.out.println("Przekroczono limit konta!");
//                }
//                else {
//                    System.out.println("Kwota wypłaty: " + kwota2);
//                    System.out.println("Aktualny stan konta: " + (saldo -= kwota2));}
//                    break;
//                case 4:
//                    System.out.println("Case 4");
//                    break;
                }
        }
    }