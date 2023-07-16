package de.bcxp.challenge.logic;

import de.bcxp.challenge.Exceptions.FileIsEmptyException;
import de.bcxp.challenge.Exceptions.FileIsInvalidException;
import de.bcxp.challenge.model.Country;
import de.bcxp.challenge.reader.IReader;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

/**
 * This class calculates the solution of the country task based on the list returned by the reader method of the IReader
 */
public class CountryLogic {
    private static final Log log = LogFactory.getLog(Country.class);

    public String getSolution(IReader reader) {

        try {
            List<Country> countryList = reader.read();
            return calcMaxPopDens(countryList);

        } catch (ArithmeticException e) {
            log.warn("Area is negativ or zero", e);
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
        return "Country not found";
    }

    /**
     * Calculates the population density of each country element and returns the name of the country with the
     * highest population density.
     *
     * @param countryList List from the reader with country objects
     * @return Name of Country with the highest population density
     */
    public String calcMaxPopDens(List<Country> countryList) {
        String countryWithMaxPopDens = "";
        double maxPopDens = Double.MIN_VALUE;

        for (int i = 0; i < countryList.size(); i++) {

            //conversion should be in the @CSVToBeanReader ...
            double actPopulation = Double.parseDouble(countryList.get(i).getPopulation()
                    .replace(".", "").replace(",", "."));

            if (countryList.get(i).getArea() <= 0) {
                throw new ArithmeticException("Area is zero or smaller than zero");
            }

            double actPopDens = actPopulation / countryList.get(i).getArea();

            if (actPopDens > maxPopDens) {
                maxPopDens = actPopDens;
                countryWithMaxPopDens = countryList.get(i).getName();
            }
        }

        return countryWithMaxPopDens;
    }
}
