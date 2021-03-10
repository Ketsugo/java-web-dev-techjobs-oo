package org.launchcode.techjobs_oo.Tests;


import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import javax.swing.text.Position;

import static org.junit.Assert.*;

public class JobTest {
    Job testJob;
    Job testJob2;
    Job testJob3;

    @Before
    public void createJobs(){
        testJob = new Job();
        testJob2 = new Job();
        testJob3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    }


    @Test
    public void testSettingJobId(){
        System.out.println(testJob.getID());
        System.out.println(testJob2.getID());
        assertTrue((testJob.getID() != testJob2.getID()));
    }

    @Test
    public void testJobConstructorSetsAllFields(){
        System.out.println(testJob3.getID());
        assertTrue("Job name is set correctly.", testJob3.getName().equals("Product tester"));

        assertTrue("Job employer is an instance of Employer", testJob3.getEmployer() instanceof Employer);
        assertTrue("Job employer is ACME", testJob3.getEmployer().getValue().equals("ACME"));

        assertTrue("Job location is an instance of Location", testJob3.getLocation() instanceof Location);
        assertTrue("Job location is Desert", testJob3.getLocation().getValue().equals("Desert"));

        assertTrue("Job PositionType is an instance of PositionType", testJob3.getPositionType() instanceof PositionType);
        assertTrue("Job position type is quality control", testJob3.getPositionType().getValue().equals("Quality control"));

        assertTrue("Job core competency is an instance of CoreCompetency", testJob3.getCoreCompetency() instanceof CoreCompetency);
        assertTrue("Job core competency is Persistence", testJob3.getCoreCompetency().getValue().equals("Persistence"));

    }

    @Test
    public void testJobEqualsMethod(){
        assertFalse("Test testJob.equals() method",testJob.equals(testJob2));
    }

    @Test
    public void testJobtoStringMethod(){
        // System.out.println(testJob3.toString());
        assertTrue("toString method outputs all the job fields correctly.", testJob3.toString().equals("\nID: 3\nName: Product tester\nEmployer: ACME\nLocation: Desert\nPosition Type: Quality control\nCore Competency: Persistence\n"));
    }
}
