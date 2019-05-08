package com.kodilla.stream.world;

import org.junit.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class WorldTestSuite {

    @Test
    public void testGetPeopleQuantity() {
        //Given
        Country poland = new Country("Poland", new BigDecimal("38000000"));
        Country france = new Country("Francce", new BigDecimal("66000000"));
        Country spain = new Country("Spain", new BigDecimal("48000000"));
        Country russia = new Country("Russia", new BigDecimal("142000000"));
        Country egypt = new Country("Egypt", new BigDecimal("97000000"));
        Country ethiopia = new Country("Ethiopia", new BigDecimal("105000000"));
        Country kenya = new Country("Kenya", new BigDecimal("48000000"));
        Country nigeria = new Country("Nigeria", new BigDecimal("190000000"));
        Country mexico = new Country("Mexico", new BigDecimal("107000000"));
        Country usa = new Country("USA", new BigDecimal("309000000"));
        Country canada = new Country("Canada", new BigDecimal("34000000"));
        Country cuba = new Country("Cuba", new BigDecimal("13000000"));

        //When

        List<Country> countriesOfEurope = new ArrayList<>();
        countriesOfEurope.add(poland);
        countriesOfEurope.add(france);
        countriesOfEurope.add(spain);
        countriesOfEurope.add(russia);
        Continent europa = new Continent("Europa",countriesOfEurope );

        List<Country> countriesOfAfrica = new ArrayList<>();
        countriesOfAfrica.add(egypt);
        countriesOfAfrica.add(ethiopia);
        countriesOfAfrica.add(kenya);
        countriesOfAfrica.add(nigeria);
        Continent africa = new Continent("Africa", countriesOfAfrica);

        List<Country> countriesOfNorthAmerica = new ArrayList<>();
        countriesOfNorthAmerica.add(mexico);
        countriesOfNorthAmerica.add(usa);
        countriesOfNorthAmerica.add(canada);
        countriesOfNorthAmerica.add(cuba);
        Continent northAmerica = new Continent("North America", countriesOfNorthAmerica);

        List<Continent> continents = new ArrayList<>();
        continents.add(europa);
        continents.add(africa);
        continents.add(northAmerica);

        World world = new World(continents);

        //Then

        BigDecimal quantityPeople = world.getPeopleQuantity();
        BigDecimal expectedQuantityPeople = new BigDecimal("1197000000");
        Assert.assertEquals(expectedQuantityPeople, quantityPeople);
    }
}
