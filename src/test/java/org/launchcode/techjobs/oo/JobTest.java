package org.launchcode.techjobs.oo;

import org.junit.Before;
import org.junit.Test;
import org.testng.annotations.BeforeTest;

import static org.junit.Assert.*;

public class JobTest {
    //TODO: Create your unit tests here

    @Test
    public void testSettingJobId () {
        Job test_job = new Job();
        Job test_job_2 = new Job();
        assertNotEquals(test_job.getId(), test_job_2.getId());
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
}
