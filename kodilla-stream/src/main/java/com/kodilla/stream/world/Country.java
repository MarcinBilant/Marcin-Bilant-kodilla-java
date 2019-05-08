package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.Objects;

public final class Country {
    private final String countryName;
    private final BigDecimal peopleQaunity;

    public Country(String countryName, BigDecimal peopleQaunity) {
        this.countryName = countryName;
        this.peopleQaunity = peopleQaunity;
    }

    public String getCountryName() {
        return countryName;
    }

    public BigDecimal getPeopleQaunity() {
        return peopleQaunity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Country country = (Country) o;
        return Objects.equals(countryName, country.countryName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(countryName);
    }

}
