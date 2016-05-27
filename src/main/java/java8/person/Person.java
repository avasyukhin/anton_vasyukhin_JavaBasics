package java8.person;

/**
 * Created by Aphex on 21.05.2016.
 */
public class Person {
    static final int minimalAge = 1;
    private String name;
    private int age;
    private Gender gender;

    public Person(String name, int age, Gender gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public static int getMinimalAge() {
        return minimalAge;
    }

    @Override
    public String toString() {
        return "Name: " + name +
                " Age: " + age +
                " Gender: " + gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public enum Gender {MALE, FEMALE}
}
