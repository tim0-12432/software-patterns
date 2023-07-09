package de.tim0_12432.builder;

public class Person {

    enum Gender {
        MALE, FEMALE, OTHER
    }

    private String name;
    private String surname;
    private int age;
    private Gender gender;

    public Person(String name, String surname, int age, Gender gender) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public Gender getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "Person={"
                + "name: " + name + ", "
                + "surname: " + surname + ", "
                + "age: " + age + ", "
                + "gender: " + gender + "}";
    }
}
