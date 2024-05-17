package org.launchcode.techjobs.oo;

import org.junit.Test;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.*;

//public class JobTest {
//    //TODO: Create your unit tests here
//}



//public class JobTest {
//
//    @Test
//    public void testSettingJobId() {
//        Job job1 = new Job();
//        Job job2 = new Job();
//
//        assertNotEquals(job1.getId(), job2.getId());
//    }
//}


//public class JobTest {
//
//    @Test
//    public void testSettingJobId() {
//        Job job1 = new Job();
//        Job job2 = new Job();
//
//        assertNotEquals(job1.getId(), job2.getId());
//    }
//
//    @Test
//    public void testJobConstructorSetsAllFields() {
//        // Declare and initialize a new Job object with provided data
//        Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
//                new PositionType("Quality control"), new CoreCompetency("Persistence"));
//
//        // Test that the constructor correctly assigns both the class and value of each field
//        assertTrue(job.getName() instanceof String);
//        assertEquals("Product tester", job.getName());
//
//        assertTrue(job.getEmployer() instanceof Employer);
//        assertEquals("ACME", job.getEmployer().getValue());
//
//        assertTrue(job.getLocation() instanceof Location);
//        assertEquals("Desert", job.getLocation().getValue());
//
//        assertTrue(job.getPositionType() instanceof PositionType);
//        assertEquals("Quality control", job.getPositionType().getValue());
//
//        assertTrue(job.getCoreCompetency() instanceof CoreCompetency);
//        assertEquals("Persistence", job.getCoreCompetency().getValue());
//    }
//}


public class JobTest {

    @Test
    public void testSettingJobId() {
        Job job1 = new Job();
        Job job2 = new Job();

        assertNotEquals(job1.getId(), job2.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        // Declare and initialize a new Job object with provided data
        Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality control"), new CoreCompetency("Persistence"));

        // Test that the constructor correctly assigns both the class and value of each field
        assertTrue(job.getName() instanceof String);
        assertEquals("Product tester", job.getName());

        assertTrue(job.getEmployer() instanceof Employer);
        assertEquals("ACME", job.getEmployer().getValue());

        assertTrue(job.getLocation() instanceof Location);
        assertEquals("Desert", job.getLocation().getValue());

        assertTrue(job.getPositionType() instanceof PositionType);
        assertEquals("Quality control", job.getPositionType().getValue());

        assertTrue(job.getCoreCompetency() instanceof CoreCompetency);
        assertEquals("Persistence", job.getCoreCompetency().getValue());
    }

    @Test
    public void testJobsForEquality() {
        // Generate two Job objects that have identical field values EXCEPT for id
        Job job1 = new Job("Software Developer", new Employer("Tech Solutions"), new Location("City"),
                new PositionType("Full Stack"), new CoreCompetency("Java"));

        Job job2 = new Job("Software Developer", new Employer("Tech Solutions"), new Location("City"),
                new PositionType("Full Stack"), new CoreCompetency("Java"));

        // Test that equals returns false
        assertFalse(job1.equals(job2));
    }

    // Created first test to check to see if the job object returns a string that starts and ends with blank line
    @Test
    public void testToStringStartsAndEndsWithNewLine() {
        Job job = new Job();
        String jobString = job.toString();

        assertEquals(System.lineSeparator(), jobString.substring(0, 1));
        assertEquals(System.lineSeparator(), jobString.substring(jobString.length() - 1));
    }

    // Created second test
    @Test
    public void testToStringContainsCorrectLabelsAndData() {
        Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality control"), new CoreCompetency("Persistence"));

        String expected = System.lineSeparator() +
                "ID: " + job.getId() + System.lineSeparator() +
                "Name: Product tester" + System.lineSeparator() +
                "Employer: ACME" + System.lineSeparator() +
                "Location: Desert" + System.lineSeparator() +
                "Position Type: Quality control" + System.lineSeparator() +
                "Core Competency: Persistence" + System.lineSeparator();

        assertEquals(expected, job.toString());
    }

    //Created third test
    @Test
    public void testToStringHandlesEmptyField() {
        Job job = new Job("Product tester", new Employer(""), new Location("Desert"),
                new PositionType(""), new CoreCompetency("Persistence"));

        String expected = System.lineSeparator() +
                "ID: " + job.getId() + System.lineSeparator() +
                "Name: Product tester" + System.lineSeparator() +
                "Employer: Data not available" + System.lineSeparator() +
                "Location: Desert" + System.lineSeparator() +
                "Position Type: Data not available" + System.lineSeparator() +
                "Core Competency: Persistence" + System.lineSeparator();

        assertEquals(expected, job.toString());
    }
}

