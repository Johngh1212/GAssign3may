package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // Constructor to initialize a unique ID
    public Job() {
        id = nextId;
        nextId++;
    }

    // Constructor to initialize all fields
    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this(); // Call the first constructor to initialize the 'id' field
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

    // Custom equals method to compare two Job objects based on their id fields
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Job)) return false;
        Job job = (Job) o;
        return getId() == job.getId();
    }

    // Custom hashCode method based on the id field
    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    // toString method
    @Override
    public String toString() {
        String idValue = (id == 0) ? "Data not available" : String.valueOf(id);
        String nameValue = (name == null || name.isEmpty()) ? "Data not available" : name;
        String employerValue = (employer == null || employer.getValue() == null || employer.getValue().isEmpty()) ? "Data not available" : employer.getValue();
        String locationValue = (location == null || location.getValue() == null || location.getValue().isEmpty()) ? "Data not available" : location.getValue();
        String positionTypeValue = (positionType == null || positionType.getValue() == null || positionType.getValue().isEmpty()) ? "Data not available" : positionType.getValue();
        String coreCompetencyValue = (coreCompetency == null || coreCompetency.getValue() == null || coreCompetency.getValue().isEmpty()) ? "Data not available" : coreCompetency.getValue();

        return System.lineSeparator() +
                "ID: " + idValue + System.lineSeparator() +
                "Name: " + nameValue + System.lineSeparator() +
                "Employer: " + employerValue + System.lineSeparator() +
                "Location: " + locationValue + System.lineSeparator() +
                "Position Type: " + positionTypeValue + System.lineSeparator() +
                "Core Competency: " + coreCompetencyValue + System.lineSeparator();
    }


    // Getters and Setters:

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }
}
