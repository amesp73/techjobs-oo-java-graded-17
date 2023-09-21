package org.launchcode.techjobs.oo;

import org.junit.Before;
import org.junit.Test;
import org.testng.annotations.BeforeTest;

import java.awt.desktop.SystemEventListener;

import static org.junit.Assert.*;

public class JobTest {
    //TODO: Create your unit tests here

    @Test
    public void testSettingJobId () {
        Job jobOne = new Job();
        Job jobTwo = new Job();
        assertNotEquals(jobOne.getId(), jobTwo.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        Job test_job = new Job("Product Tester",
                                new Employer("ACME"),
                                new Location("Desert"),
                                new PositionType("Quality control"),
                                new CoreCompetency("Persistence"));

        //5 assertTrue statements
        assertTrue(test_job.getName() instanceof String);
        assertTrue(test_job.getEmployer() instanceof Employer);
        assertTrue(test_job.getLocation() instanceof Location);
        assertTrue(test_job.getPositionType() instanceof PositionType);
        assertTrue(test_job.getCoreCompetency() instanceof CoreCompetency);

        //5 assertEquals statements
        assertEquals("Product Tester", test_job.getName());
        assertEquals("ACME", test_job.getEmployer().getValue());
        assertEquals("Desert", test_job.getLocation().getValue());
        assertEquals("Quality control", test_job.getPositionType().getValue());
        assertEquals("Persistence", test_job.getCoreCompetency().getValue());
    }

    @Test
    public void testJobsForEquality() {
        Job jobOne = new Job("Nurse",
                            new Employer("Hospital"),
                            new Location("St. Louis"),
                            new PositionType("Emergency Room"),
                            new CoreCompetency("Critical Thinking"));

        Job jobTwo = new Job("Nurse",
                            new Employer("Hospital"),
                            new Location("St. Louis"),
                            new PositionType("Emergency Room"),
                            new CoreCompetency("Critical Thinking"));

        assertNotEquals(jobOne, jobTwo);
    }

    @Test
    public void testToStringStartsAndEndsWithNewLine() {
        Job test_job = new Job();
        String newline = System.lineSeparator();
        String testString = test_job.toString();
        int testStringLength = testString.length();

        assertEquals(newline, testString.substring(0, 1));
//        assertTrue(testString.endsWith(newline));
        assertEquals(newline, testString.substring(testStringLength - 1));

    }

    @Test
    public void testToStringContainsCorrectLabelsAndData() {
        Job test_job = new Job("Nurse",
                new Employer("Hospital"),
                new Location("St. Louis"),
                new PositionType("Emergency Room"),
                new CoreCompetency("Critical Thinking"));
        String newline = System.lineSeparator();

        assertEquals(newline +
                    "ID: " + test_job.getId() + newline +
                    "Name: " + test_job.getName() + newline +
                    "Employer: " + test_job.getEmployer() + newline +
                    "Location: " + test_job.getLocation() + newline +
                    "Position Type: " + test_job.getPositionType() + newline +
                    "Core Competency: " + test_job.getCoreCompetency() + newline, test_job.toString());
    }
}
