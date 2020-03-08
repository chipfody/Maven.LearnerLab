package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestPerson {

    @Test
    public void testConstructor() {
        String expectedName = "Clint Barton";
        long expectedId = 139875;
        Person testPerson = new Person(expectedName, expectedId);

        String actualName = testPerson.getName();
        long actualId = testPerson.getId();

        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedId, actualId);
    }

    @Test
    public void testSetName() {
        String expected = "Natasha Romanov";
        long id = 667669;
        Person personExpected = new Person (expected, id);

        personExpected.setName(expected);
        String actualPerson  = personExpected.getName();

        Assert.assertEquals(expected, actualPerson);
    }



}
