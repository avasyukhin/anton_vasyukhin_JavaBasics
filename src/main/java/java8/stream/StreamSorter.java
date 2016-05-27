package java8.stream;

import java8.person.Person;

import java.util.stream.Stream;

/**
 * Created by Aphex on 25.05.2016.
 */
public class StreamSorter {
    public static Stream<Person> sortStreamByAge(Stream<Person> stream) {
        return stream.sorted((person1, person2) -> person1.getAge() - person2.getAge());
    }
}
