package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestStudent {

    Student testStudent = new Student("Steven Strange", 666921);


    @Test
    public void testStudentImplementation() {
        Assert.assertTrue(testStudent instanceof Learner);
    }

    @Test
    public void testInheritance() {
        Assert.assertTrue(testStudent instanceof Person);
    }

    @Test
    public void testLearn() {
        testStudent.learn(5);

        double expected = 5;
        double actual = testStudent.getTotalStudyTime();

        Assert.assertEquals(expected, actual, 0.0);
    }
}
