package de.bcxp.challenge.logic;

import de.bcxp.challenge.Exceptions.FileIsEmptyException;
import de.bcxp.challenge.Exceptions.FileIsInvalidException;
import de.bcxp.challenge.model.Weather;
import de.bcxp.challenge.reader.IReader;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * This class calculates the solution of the weather task based on the list returned by the reader method of the IReader
 */
public class WeatherLogic {
    private static final Log log = LogFactory.getLog(WeatherLogic.class);


    public int getSolution(IReader reader) {
        try {
            List<Weather> weatherList = reader.read();

            return calcMinTempDiff(weatherList);

        } catch (FileIsInvalidException e) {
            log.warn("File is invalid", e);
        } catch (FileIsEmptyException e) {
            log.warn("File is empty", e);
        } catch (FileNotFoundException e) {
            log.warn("File could not be found, maybe the file is inaccessible", e);
        } catch (NoSuchFieldException e) {
            log.warn("File could not be found", e);

        } catch (IOException e) {
            log.fatal("Something went wrong while reading the csv file", e);

        } catch (Exception e) {
            log.warn("Something went wrong", e);
        }
        return 0;
    }

    /**
     * Calculates the difference between the minimum and maximum temperature of each Weather Element and returns
     * the day of the weather with the lowest difference.
     *
     * @param weatherList List from the Reader with weather objects
     * @return Number (int) of the Day with the lowest difference
     */
    public int calcMinTempDiff(List<Weather> weatherList) {
        int dayWithSmallestTempDiff = 0;
        double minTempDiff = Double.MAX_VALUE;

        for (int i = 0; i < weatherList.size(); i++) {

            double actDiff = weatherList.get(i).getMaxTemp() - weatherList.get(i).getMinTemp();

            if (actDiff < minTempDiff) {
                minTempDiff = actDiff;
                dayWithSmallestTempDiff = i;
            }
        }

        return dayWithSmallestTempDiff + 1;
    }

}
