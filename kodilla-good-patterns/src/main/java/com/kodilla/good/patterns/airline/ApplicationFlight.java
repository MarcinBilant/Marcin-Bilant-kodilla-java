package com.kodilla.good.patterns.airline;

import java.util.Set;

public class ApplicationFlight {
    public static void main(String[] args) {
        FlightSearch flightSearch = new FlightSearch();
        Set<Flight> flightSet1 = flightSearch.findFlightFrom("Warszawa");
        System.out.println(flightSet1);

        Set<Flight> flightSet2 = flightSearch.findFlightTo("Wrocław");
        System.out.println(flightSet2);

        Set<Flight> flightSet3 = flightSearch.findFlightVia("Kraków");
        System.out.println(flightSet3);
    }
}
