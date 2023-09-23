package org.launchcode.techjobs.oo;

import java.util.Objects;

//provide a base for subclasses to extend and implement the abstract methods
//and override or use the implemented methods in abstract class
public abstract class JobField {

    //Shared fields
    private int id;
    private static int nextId = 1;
    private String value;


    //Shared constructors
    public JobField() {
        id = nextId;
        nextId++;
    }

    public JobField(String value) {
        this();
        this.value = value;
    }
    //super will allow subclasses to access constructor from this base class


    //Shared methods
    public String toString() {
        return value;
    }

    public boolean equals(Object toBeCompared) {
        if (toBeCompared == this) {
            return true;
        }
        if (toBeCompared == null) {
            return false;
        }
        if (toBeCompared.getClass() != this.getClass()) {
            return false;
        }
        JobField job = (JobField) toBeCompared;
        return job.getId() == this.getId();
    }

    public int hashCode() {
        return (Objects.hash(id));
    }


    //Getters and setters
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


