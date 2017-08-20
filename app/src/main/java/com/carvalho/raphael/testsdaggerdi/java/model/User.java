package com.carvalho.raphael.testsdaggerdi.java.model;

/**
 * Created by RaphaelCarvalho on 20/08/2017.
 */
public class User {

    private String firstName;
    private String lastName;

    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "User [firstName=" + firstName + ", lastName=" + lastName + "]";
    }
}
