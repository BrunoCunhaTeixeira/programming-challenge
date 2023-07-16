package de.bcxp.challenge.Exceptions;

/**
 * This Exception is thrown in CSVToBeanReader if the file has invalid Data, like a String instead of a int.
 */
public class FileIsInvalidException extends Exception {

    public FileIsInvalidException(String errorMessage) {
        super(errorMessage);
    }
}
