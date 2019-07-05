package com.kodilla.good.patterns.airline;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.stream.Collectors;

public class FlightSearch {
    private Set<Flight> flights = new HashSet<Flight>();

    public FlightSearch() {
        flights.add(new Flight("Warszawa", "Wrocław"));
        flights.add(new Flight("Warszawa", "Kraków"));
        flights.add(new Flight("Kraków", "Wrocław"));
        flights.add(new Flight("Radom", "Wrocław"));
        flights.add(new Flight("Gdańsk", "Warszawa"));

    }

    public Set<Flight> findFlightFrom(String airport) {

        return flights.stream()
                .filter(f -> airport.equals(f.getArrival()))
                .collect(Collectors.toSet());
    }

    public Set<Flight> findFlightTo(String airport) {
        return flights.stream()
                .filter(f ->airport.equals(f.getDeparture()))
                .collect(Collectors.toSet());

    }


    public Set<Flight> findFlightVia(String airportVia){
        return  flights.stream()
                .filter(f->!(airportVia.equals(f.getDeparture()) == (airportVia.equals(f.getArrival()))))
                .collect(Collectors.toSet());
    }


}
