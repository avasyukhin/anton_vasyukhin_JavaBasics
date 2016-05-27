package java8.stream;

import java8.person.Person;

import java.util.stream.Stream;

/**
 * Created by Aphex on 27.05.2016.
 */
public class UnderageRemover {
    public static Stream<Person> removeUnderages(Stream<Person> stream) {
        return stream.filter(person -> person.getAge() >= 18);
    }
}
