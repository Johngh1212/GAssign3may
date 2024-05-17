package org.launchcode.techjobs.oo;

import java.util.Objects;

// Create Base class to move all the repeated codes from Employer, Location, CoreCompetency,
// and PositionType into base class JobField
public abstract class JobField {

    private int id;
    private static int nextId = 1;
    private String value;

    // Default constructor
    public JobField() {
        this.id = nextId;
        nextId++;
    }

    // Constructor with a string parameter
    public JobField(String value) {
        this(); // Calling the default constructor to initialize the id field
        this.value = value; // Assigning the parameter to the value field
    }

    // Custom toString, equals, and hashCode methods:
    //Add a custom toString() method that returns the data stored in 'value'.
    @Override
    public String toString() {
        return value;
    }

    @Override
    public boolean equals(Object o) {  // Two objects are equal if they have the same id.
        if (this == o) return true;
        if (!(o instanceof JobField)) return false;
        JobField field = (JobField) o;
        return getId() == field.getId();
    }

    // Custom hashCode method based on the id field
    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    // Getters and Setters:

    public int getId() {
        return id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

}
