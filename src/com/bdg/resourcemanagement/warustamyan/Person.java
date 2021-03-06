package com.bdg.resourcemanagement.warustamyan;

public final class Person {
    private String firstName;
    private String lastName;
    private String middleName;
    private short age;

    public Person(final String firstName, final String lastName, final String middleName, final short age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.age = age;
    }


    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public short getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", age=" + age +
                '}';
    }
}
