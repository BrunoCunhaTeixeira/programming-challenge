package de.bcxp.challenge;


import de.bcxp.challenge.logic.CountryLogic;
import de.bcxp.challenge.model.Country;
import de.bcxp.challenge.model.Weather;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CountryLogicTest {

    private List<Country> listWithCountries = new ArrayList<>();

    @BeforeEach
    public void setup() {
        listWithCountries.add(new Country("Test1", "Test1Capital", "2000", "45000",
                100, 50, 30, 5));
        listWithCountries.add(new Country("Test2", "Test2Capital", "2000", "75000",
                3500, 50, 30, 4));

    }

    @Test
    public void testCalcMaxPopDens() {
        String expected = "Test1";
        String actual = new CountryLogic().calcMaxPopDens(listWithCountries);

        assertEquals(expected, actual);
    }

    @Test
    public void testCalcMaxPopDensWithNegativeArea() {
        listWithCountries.add(new Country("Test3WithNegativArea", "Test3Capital", "2000", "375000",
                -20, 50, 30, 3));
        assertThrows(ArithmeticException.class, () -> {
            new CountryLogic().calcMaxPopDens(listWithCountries);
        });
    }


}
