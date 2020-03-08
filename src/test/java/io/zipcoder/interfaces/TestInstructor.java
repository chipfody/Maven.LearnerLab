package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructor {

    Instructor testInstructor = new Instructor("The Ancient One", 00001);
    Student testStudent = new Student("Steven Strange", 666921);
    Student testStudent2 = new Student("Wong", 45081);
    Student testStudent3 = new Student("Clea", 80908);


    @Test
    public void testImplementation() {
        Assert.assertTrue(testInstructor instanceof Teacher);
    }

    @Test
    public void testInheritance() {
        Assert.assertTrue(testInstructor instanceof Person);
    }

    @Test
    public void testTeach() {
        testInstructor.teach(testStudent, 5);
        double expected = 5;
        double actual = testStudent.getTotalStudyTime();

        Assert.assertEquals(expected, actual, 0.0);
    }

    @Test
    public void testLecture() {
        Learner[] testLearners = new Learner[3];
        testLearners[0] = testStudent;
        testLearners[1] = testStudent2;
        testLearners[2] = testStudent3;

        double expected = 3;
        testInstructor.lecture(testLearners, 9);
        double actual = testLearners[1].getTotalStudyTime();

        Assert.assertEquals(expected, actual, 0.0);
    }
}
