package java8.stream;


import java8.person.Person;

import java.util.stream.Stream;

/**
 * Created by Aphex on 27.05.2016.
 */
public class StreamPrinter {
    public static void printPersons(Stream<Person> personStream) {
        personStream.forEach(person -> System.out.println(person));
    }
}
