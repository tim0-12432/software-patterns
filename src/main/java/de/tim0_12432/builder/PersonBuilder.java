package de.tim0_12432.builder;

public class PersonBuilder {

    private String name;
    private String surname;
    private int age;
    private Person.Gender gender;

    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public PersonBuilder setGender(Person.Gender gender) {
        this.gender = gender;
        return this;
    }

    public Person build() {
        return new Person(name, surname, age, gender);
    }
}
