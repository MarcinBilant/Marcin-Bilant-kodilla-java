package com.kodilla.exception.test;

public class ExceptionHandling {
    public static void main(String[] args) {

        SecondChallenge secondChallenge = new SecondChallenge();
        try {
        secondChallenge.probablyIWillThrowException(1,1.5);

        } catch (Exception e) {
            System.out.println("X can't be: x >= 2 || x < 1 or Y can't be = 1,5 " + e);
        } finally {
            System.out.println("Problem with method arguments  ");
        }
    }
}
