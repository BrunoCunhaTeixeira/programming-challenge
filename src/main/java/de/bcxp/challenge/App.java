package de.bcxp.challenge;

import de.bcxp.challenge.logic.CountryLogic;
import de.bcxp.challenge.logic.WeatherLogic;
import de.bcxp.challenge.model.Country;
import de.bcxp.challenge.model.Weather;
import de.bcxp.challenge.reader.CSVToBeanReader;

/**
 * The entry class for your solution. This class is only aimed as starting point and not intended as baseline for your software
 * design. Read: create your own classes and packages as appropriate.
 */
public final class App {

    /**
     * This is the main entry method of your program.
     *
     * @param args The CLI arguments passed
     */
    public static void main(String... args) {
        // Your preparation code …
        // Your day analysis function call …
        int dayWithSmallestTempSpread = new WeatherLogic().getSolution(
                new CSVToBeanReader("src/main/resources/de/bcxp/challenge/weather.csv", Weather.class, ','));
        System.out.printf("Day with smallest temperature spread: %s%n", dayWithSmallestTempSpread);

        String countryWithHighestPopulationDensity = new CountryLogic().getSolution(
                new CSVToBeanReader("src/main/resources/de/bcxp/challenge/countries.csv",
                        Country.class, ';'));
        ; // Your population density analysis function call …
        System.out.printf("Country with highest population density: %s%n", countryWithHighestPopulationDensity);
    }
}
