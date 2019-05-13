package com.kodilla.rps;

import java.util.Random;
import java.util.Scanner;


public class RpsRunner {
    public static void main(String[] args) {
        String userName;
        int numbersOfRoundsWon;
        final int rock = 1;
        final int paper = 2;
        final int scissors = 3;
        int selectedKeyByUser;
        int selectedKeyByComputer;
        int numberWinningsByUser;
        int numberWinningsByComputer;
        int whichround;
        int endGame;
        boolean end = false;
        String continueOrEnd;
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Proszę o wpisanie swojego imienia:");
        userName = scanner.nextLine();

        while (!end) {
            whichround = 1;
            numberWinningsByUser = 0;
            numberWinningsByComputer = 0;
            System.out.println("Proszę o podanie liczby wygranych rund po których następuje zwycięstwo:");
            numbersOfRoundsWon = scanner.nextInt();
            System.out.println("Witaj " + userName + " w grze papier, kamień nożyce. ");
            System.out.println("Liczba wygranych rund po których następuje zwycięstwo wynosi " + numbersOfRoundsWon + "\n");

            System.out.println("Poniżej klawisze służące do obsługi gry:");
            System.out.println("klawisz 1 - zagranie kamień");
            System.out.println("klawisz 2 - zagranie papier");
            System.out.println("klawisz 3 - zagranie nożyce");
            System.out.println("klawisz x - zakończenie gry");
            System.out.println("klawisz n - uruchomienie gry od nowa");


            while (numberWinningsByUser < numbersOfRoundsWon && numberWinningsByComputer < numbersOfRoundsWon) {

                System.out.println("Rozpoczynamy rundę " + whichround + " proszę o wykonanie ruchu");
                System.out.println("1.Kamień.\n2.Papier.\n3.Nożyce.");
                selectedKeyByUser = scanner.nextInt();
                scanner.nextLine();
                selectedKeyByComputer = random.nextInt(2) + 1;


                if (selectedKeyByUser == 1 && selectedKeyByComputer == 1) {
                    System.out.println("Gracz " + userName + " wybrał kamień , komputer wybrał kamień. Remis");
                    System.out.println("Stan gry po rundzie " + whichround + " gracz ma " + numberWinningsByUser
                            + " wygranych, komputer ma " + numberWinningsByComputer + " wygranych");
                } else if (selectedKeyByUser == 1 && selectedKeyByComputer == 2) {
                    System.out.println("Gracz  " + userName + " wybrał kamień , komputer wybrał papier. Wygrał komputer");
                    numberWinningsByComputer++;
                    System.out.println("Stan gry po rundzie " + whichround + " gracz ma " + numberWinningsByUser
                            + " wygranych, komputer ma " + numberWinningsByComputer + " wygranych");

                } else if (selectedKeyByUser == 1 && selectedKeyByComputer == 3) {
                    System.out.println("Gracz  " + userName + "  wybrał kamień , komputer wybrał nożyce. Wygrał gracz");
                    numberWinningsByUser++;
                    System.out.println("Stan gry po rundzie " + whichround + " gracz ma " + numberWinningsByUser
                            + " wygranych, komputer ma " + numberWinningsByComputer + " wygranych");

                } else if (selectedKeyByUser == 2 && selectedKeyByComputer == 1) {
                    System.out.println("Gracz  " + userName + "  papier , komputer wybrał kamień. Wygrał gracz");
                    numberWinningsByUser++;
                    System.out.println("Stan gry po rundzie " + whichround + " gracz ma " + numberWinningsByUser
                            + " wygranych, komputer ma " + numberWinningsByComputer + " wygranych");

                } else if (selectedKeyByUser == 2 && selectedKeyByComputer == 2) {
                    System.out.println("Gracz  " + userName + "  wybrał papier , komputer wybrał papier. Remis");
                    System.out.println("Stan gry po rundzie " + whichround + " gracz ma " + numberWinningsByUser
                            + " wygranych, komputer ma " + numberWinningsByComputer + " wygranych");
                } else if (selectedKeyByUser == 2 && selectedKeyByComputer == 3) {
                    System.out.println("Gracz  " + userName + " wybrał papier , komputer wybrał nożyce. Wygrał komputer");
                    numberWinningsByComputer++;
                    System.out.println("Stan gry po rundzie " + whichround + " gracz ma " + numberWinningsByUser
                            + " wygranych, komputer ma " + numberWinningsByComputer + " wygranych");

                } else if (selectedKeyByUser == 3 && selectedKeyByComputer == 1) {
                    System.out.println("Gracz  " + userName + " wybrał nożyce , komputer wybrał kamień. Wygrał komputer");
                    numberWinningsByComputer++;
                    System.out.println("Stan gry po rundzie " + whichround + " gracz ma " + numberWinningsByUser
                            + " wygranych, komputer ma " + numberWinningsByComputer + " wygranych");

                } else if (selectedKeyByUser == 3 && selectedKeyByComputer == 2) {
                    System.out.println("Gracz  " + userName + "  wybrał nożyce , komputer wybrał papier. Wygrał gracz");
                    numberWinningsByUser++;
                    System.out.println("Stan gry po rundzie " + whichround + " gracz ma " + numberWinningsByUser
                            + " wygranych, komputer ma " + numberWinningsByComputer + " wygranych");

                } else if (selectedKeyByUser == 3 && selectedKeyByComputer == 3) {
                    System.out.println("Gracz  " + userName + "  wybrał nożyce , komputer wybrał nożyce. Remis");
                    System.out.println("Stan gry po rundzie " + whichround + " gracz ma " + numberWinningsByUser
                            + " wygranych, komputer ma " + numberWinningsByComputer + " wygranych");
                }
                whichround++;

            }
            System.out.println("Końcowy stan gry: \ngracz  " + userName + "  miał " + numberWinningsByUser + " wygranych, komputer miał "
                    + numberWinningsByComputer + " wygranych");
            System.out.println("Czy chcesz zagrać ponownie czy wyjść z gry ?\n" +
                    "wybierz n - uruchomienie gry od nowa.\n" +
                    "wybierz x - zakończenie gry ");
            continueOrEnd = scanner.nextLine();
            if (continueOrEnd.equals("n")) {
                end = false;
            } else if (continueOrEnd.equals("x")) {
                System.out.println("Czy na pewno zakończyć grę \n" +
                        "wybierz 1 - Tak\n" +
                        "wybierz 2 - Nie");
                endGame = scanner.nextInt();
                if (endGame == 1) {
                    System.out.println("Do zobaczenia ponownie");
                    end = true;
                }
                else {
                    end = false;
                }
            }

        }

    }
}
