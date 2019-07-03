package com.kodilla.good.patterns.challenges;

public class InformationServiceSent implements InformationService {
    public void inform(User user) {
        System.out.println("Order will be sent to " + user.getName() + " " + user.getSurname());

    }
}
