package hhovsepyan;

import java.util.Arrays;

public final class Person {

    private String firstName;

    private String lastName;

    private String middleName;

    private short age;
    private Address[] addresses;



    public Person(final String firstName, final String lastName, final String middleName, final short age, final Address[] addresses) {

        this.firstName = firstName;

        this.lastName = lastName;

        this.middleName = middleName;

        this.age = age;
        this.addresses = addresses;


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


    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", age=" + age +
                ", address=" + Arrays.toString(addresses) +
                '}';
    }

    public short getAge() {

        return age;


        public Address[] getAddresses() {

            return addresses;    }





    }

}
