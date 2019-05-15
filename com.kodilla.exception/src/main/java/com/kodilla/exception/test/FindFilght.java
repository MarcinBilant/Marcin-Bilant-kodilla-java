package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FindFilght {

    public void findFilghtPlane(Flight flight) throws RouteNotFoundException {
            Map<String, Boolean> isAirportInMap = new HashMap<String, Boolean>();
            isAirportInMap.put("Okęcie", true);
            isAirportInMap.put("Modlin", false);
            isAirportInMap.put("Wrocław", true);
            isAirportInMap.put("Kraków", false);

            if (isAirportInMap.get(flight.getArrivalAirport()) == null) {
                throw new RouteNotFoundException ("Not found arrival airport");
            }

            if (isAirportInMap.get(flight.getDepartureAirport()) == null) {
                throw new RouteNotFoundException(" Not found departue airport");
            }


        }
    }