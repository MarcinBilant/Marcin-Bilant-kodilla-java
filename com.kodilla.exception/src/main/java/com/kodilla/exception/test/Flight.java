package com.kodilla.exception.test;

public class Flight {

    private String departureAirport;
    private String arrivalAirport;

    public Flight(String arrivalAirport,String departureAirport) {
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public String getArrivalAirport() {
        return arrivalAirport;
    }
}
