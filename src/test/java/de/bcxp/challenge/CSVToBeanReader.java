package de.bcxp.challenge;

import de.bcxp.challenge.Exceptions.FileIsEmptyException;
import de.bcxp.challenge.Exceptions.FileIsInvalidException;
import de.bcxp.challenge.model.Country;
import de.bcxp.challenge.model.Weather;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class CSVToBeanReader {

    @Test
    public void testReadWithEmptyFile() {
        assertThrows(FileIsEmptyException.class, () -> {
            new de.bcxp.challenge.reader.CSVToBeanReader("src/test/resources/emptyData.csv", Country.class, ';').read();
        });
    }

    @Test
    public void testReadWithNoFile() {
        assertThrows(java.nio.file.NoSuchFileException.class, () -> {
            new de.bcxp.challenge.reader.CSVToBeanReader("src/test/resources/notExist.csv", Country.class, ';').read();
        });
    }

    @Test
    public void testReadWithInvalidFile() {
        assertThrows(FileIsInvalidException.class, () -> {
            new de.bcxp.challenge.reader.CSVToBeanReader("src/test/resources/invalidData.csv", Weather.class, ';').read();
        });
    }
}
