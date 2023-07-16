package de.bcxp.challenge.Exceptions;

/**
 * This Exception is thrown in CSVToBeanReader if the file is empty.
 */
public class FileIsEmptyException extends Exception {
    public FileIsEmptyException(String errorMessage) {
        super(errorMessage);
    }
}
