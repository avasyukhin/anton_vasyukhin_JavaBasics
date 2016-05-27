package java8.stream;

import java8.person.Person;

import java.util.stream.Stream;

/**
 * Created by Aphex on 25.05.2016.
 */
public class AverageAgeGetter {


    public static double getAverageAge(Stream<Person> personStream) {
        return personStream
                .mapToInt((person) -> person.getAge())
                .average()
                .getAsDouble();
    }
}
