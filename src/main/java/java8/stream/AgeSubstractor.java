package java8.stream;

import java8.person.Person;

import java.util.function.Function;
import java.util.function.Predicate;

/**
 * Created by Aphex on 27.05.2016.
 */
public class AgeSubstractor {
    private static int SUBSTRACTED_AGE = 10;
    private static Predicate<Person> ageIsSustractable =
            person -> person.getAge() - SUBSTRACTED_AGE >= Person.getMinimalAge();
    private static Predicate<Person> isFemale =
            person -> person.getGender() == Person.Gender.FEMALE;
    public static Function<Person, Person> substractAge = person -> {
        if (isFemale.and(ageIsSustractable).test(person)) {
            person.setAge(person.getAge() - SUBSTRACTED_AGE);
        }
        return person;
    };

    public static int getSubstractedAge() {
        return SUBSTRACTED_AGE;
    }
}
