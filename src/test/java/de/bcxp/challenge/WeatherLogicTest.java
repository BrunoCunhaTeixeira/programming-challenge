package de.bcxp.challenge;

import de.bcxp.challenge.logic.CountryLogic;
import de.bcxp.challenge.logic.WeatherLogic;
import de.bcxp.challenge.model.Country;
import de.bcxp.challenge.model.Weather;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WeatherLogicTest {
    private List<Weather> listWithWeather = new ArrayList<>();

    @BeforeEach
    public void setup() {
        listWithWeather.add(new Weather(1, 54.3f, 32.4f, 45, 23, 8, 5, 4,
                3, 1, 2, 5, 4, 3, 6, 2));
        listWithWeather.add(new Weather(2, 29.3f, 14.3f, 45, 23, 8, 5, 4,
                3, 1, 2, 5, 4, 3, 6, 2));

    }

    @Test
    public void testCalcMaxPopDens() {
        int expected = 2;
        int actual = new WeatherLogic().calcMinTempDiff(listWithWeather);

        assertEquals(expected, actual);
    }
}
