package java8.stream;

import java8.person.Person;

import java.util.function.Function;
import java.util.stream.Stream;

/**
 * Created by Aphex on 27.05.2016.
 */
public class StreamMapper {
    public static Stream<Person> transformStream(Stream<Person> personStream, Function function) {
        return personStream.map(function);
    }
}
