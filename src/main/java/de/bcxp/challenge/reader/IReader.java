package de.bcxp.challenge.reader;

import java.util.*;

/**
 * This interface serves for extensibility. In the future, different classes could implement this interface and read
 * data from different sources.
 *
 * @param <T> Class of the Bean
 */
public interface IReader<T> {

    List<T> read() throws Exception;

}
