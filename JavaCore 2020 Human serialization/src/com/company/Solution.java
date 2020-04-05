package com.company;

/*

2020 Human serialization
Serialize the Person class the standard way. If necessary, add some transient modifier to some fields.

Requirements:
1. The Person class must support the Serializable interface.
2. The fullName field must be marked with the transient modifier.
3. The greetingString field must be marked with the transient modifier.
4. The outputStream field must be marked with the transient modifier.
5. The logger field must be marked with the transient modifier.
6. The firstName field should NOT be marked with the transient modifier.
7. The lastName field should NOT be marked with the transient modifier.
8. The country field should NOT be marked with the transient modifier.
9. The sex field should NOT be marked with the transient modifier.


 */

import java.io.PrintStream;
import java.io.Serializable;
import java.util.logging.Logger;



public class Solution {

    public static class Person implements Serializable{
        String firstName;
        String lastName;
        transient String fullName;
        transient final String greetingString;
        String country;
        Sex sex;
        transient PrintStream outputStream;
        transient Logger logger;

        Person(String firstName, String lastName, String country, Sex sex) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.fullName = String.format("%s, %s", lastName, firstName);
            this.greetingString = "Hello, ";
            this.country = country;
            this.sex = sex;
            this.outputStream = System.out;
            this.logger = Logger.getLogger(String.valueOf(Person.class));
        }
    }

    enum Sex {
        MALE,
        FEMALE
    }

    public static void main(String[] args) {

    }
}

