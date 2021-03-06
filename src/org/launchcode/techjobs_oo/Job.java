package org.launchcode.techjobs_oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;



    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.

    public Job() {
        id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }


    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    @Override
    public boolean equals(Object o) {  // Two objects are equal if they have the same id.
        if (this == o) return true;
        if (!(o instanceof Job)) return false;
        Job job = (Job) o;
        return getID() == job.getID();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getID());
    }

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.


    @Override
    public String toString() {


        //
        // Making sure blank fields are given something human-understandable.
        //

        if(this.name.equals("")){
            this.name = "Not Applicable";
        }

        if(this.employer.toString().equals("")){
            this.employer.setValue("Not Applicable");
        }

        if(this.location.toString().equals("")){
            this.location.setValue("Not Applicable");
        }

        if(this.positionType.toString().equals("")){
            this.positionType.setValue("Not Applicable");
        }

        if(this.coreCompetency.toString().equals("")){
            this.coreCompetency.setValue("Not Applicable");
        }

        return "\nID: " + this.id + "\nName: " + this.name + "\nEmployer: " + this.employer.getValue() + "\nLocation: " + this.location.getValue() + "\nPosition Type: " + this.positionType.getValue() + "\nCore Competency: " + this.coreCompetency.getValue() + "\n";
    }

    public int getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
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
