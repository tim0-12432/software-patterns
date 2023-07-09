package de.tim0_12432.builder;

public class Main {

    public static void main(String[] args) {

        PersonBuilder builder = new PersonBuilder();
        Person person = builder
            .setName("Tim")
            .setSurname("Schneider")
            .setAge(18)
            .setGender(Person.Gender.MALE)
            .build();

        System.out.println(person);
    }
}
