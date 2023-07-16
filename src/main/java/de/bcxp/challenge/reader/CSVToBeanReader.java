package de.bcxp.challenge.reader;

import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

import de.bcxp.challenge.Exceptions.FileIsEmptyException;
import de.bcxp.challenge.Exceptions.FileIsInvalidException;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * This class reads a csv file and parse it to a bean with the library opencsv. I used opencsv because the functions
 * available in it are useful for this task (CSV to Bean), furthermore the functions are already tested,
 * which reduces the development time.
 *
 * @param <T> Class of the Bean
 */
public class CSVToBeanReader<T> implements IReader {
    private static final Log log = LogFactory.getLog(CSVToBeanReader.class);
    private String pathToCSV;
    private Class classOfBean;
    private char seperator;

    public CSVToBeanReader(String pathToCSV, Class classOfBean, char seperator) {
        this.pathToCSV = pathToCSV;
        this.classOfBean = classOfBean;
        this.seperator = seperator;
    }

    /**
     * Reads the CSV file and converts to a List of Beans
     *
     * @return List of <T> Bean
     */
    @Override
    public List<T> read() throws Exception {
        List<T> answer = new ArrayList<>();
        try {
            Reader reader = Files.newBufferedReader(Paths.get(pathToCSV));

            //check if file is empty
            if (new File(pathToCSV).length() == 0) {
                throw new FileIsEmptyException("File is Empty");
            }

            CsvToBean<T> ctb = new CsvToBeanBuilder<T>(reader).withType(classOfBean).withThrowExceptions(false).withSeparator(seperator).build();

            ctb.parse().forEach(x -> {
                answer.add(x);
            });

            //workaround to get the exception
            if ((ctb.getCapturedExceptions().size()) > 0) {
                throw new FileIsInvalidException("Inconsistent data");
            }


            return answer;

        } catch (FileIsInvalidException e) {
            throw e;
        } catch (FileIsEmptyException e) {
            throw e;
        } catch (FileNotFoundException e) {
            throw e;
        } catch (NoSuchFileException e) {
            throw e;
        } catch (IOException e) {
            throw e;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }


}
