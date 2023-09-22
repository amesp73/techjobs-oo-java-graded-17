package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;
    /* static makes it shared between every object of Job
    if not static, number will not be shared and
    all objects will be an ID of 1 */

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
    public boolean equals(Object toBeCompared) {
        if(toBeCompared == this) {
            return true;
        }
        if (toBeCompared == null) {
            return false;
        }
        if (toBeCompared.getClass() != this.getClass()) {
            return false;
        }
        Job job = (Job) toBeCompared;
        return job.getId() == this.getId();
    }

    public int hashCode() {
        return(Objects.hash(id));
    }

    public String toString() {
        String newline = System.lineSeparator();
        String nameString;
        String employerString;
        String locationString;
        String positionString;
        String coreCompString;



        if(name == null || name.equals("")) {
            nameString = "Data not available";
        } else {
            nameString = name;
        }

        if(employer == null || employer.getValue().equals("")) {
            employerString = "Data not available";
        } else {
            employerString = employer.getValue();
        }

        if(location == null || location.getValue().equals("")) {
            locationString = "Data not available";
        } else {
            locationString = location.getValue();
        }

        if(positionType == null || positionType.getValue().equals("")) {
            positionString = "Data not available";
        } else {
            positionString = positionType.getValue();
        }

        if(coreCompetency == null || coreCompetency.getValue().equals("")) {
            coreCompString = "Data not available";
        } else {
            coreCompString = coreCompetency.getValue();
        }



        if(nameString.equals("Data not available") && employerString.equals("Data not available") && locationString.equals("Data not available")
          && positionString.equals("Data not available") && coreCompString.equals("Data not available")) {
            return "OOPS! This job does not exist";
        } else {
            return newline +
                    "ID: " + id + newline +
                    "Name: " + nameString + newline +
                    "Employer: " + employerString + newline +
                    "Location: " + locationString + newline +
                    "Position Type: " + positionString + newline +
                    "Core Competency: " + coreCompString + newline;
        }
    }

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.

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

    public int getId() {
        return id;
    }
}
