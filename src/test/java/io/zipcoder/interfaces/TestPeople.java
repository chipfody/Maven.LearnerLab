package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TestPeople {

    Person testPerson = new Person("John Smith", 123456);
    Person testPerson2= new Person("Jane Doe", 369246);
    Person testPerson3 = new Person("Mickey Mouse", 15963);

    @Test
    public void testAddPerson() {
        List<Person> testList = new ArrayList<Person>();
        People people = new People(testList);

        Integer expected = 2;
        people.addPerson(testPerson, testList);
        people.addPerson(testPerson2, testList);

        Integer actual = people.countPeople(testList);

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testRemovePerson() {
        List<Person> testList = new ArrayList<Person>();
        People people = new People(testList);


        people.addPerson(testPerson, testList);
        people.addPerson(testPerson2, testList);
        people.addPerson(testPerson3, testList);
        people.removePerson(testPerson3);

        Boolean actual = people.containsPerson(testPerson3);

        Assert.assertFalse(actual);
    }

    @Test
    public void testFindById() {
        List<Person> testList = new ArrayList<Person>();
        testList.add(testPerson);
        testList.add(testPerson2);
        testList.add(testPerson3);
        People people = new People(testList);
        double id = testPerson2.getId();
        Assert.assertEquals(testPerson2,people.findPersonById(id));

    }

    @Test
    public void testRemoveById () {
        List<Person> testList = new ArrayList<Person>();
        testList.add(testPerson);
        testList.add(testPerson2);
        testList.add(testPerson3);
        People people = new People(testList);
        double id = testPerson2.getId();
        people.removeById(id);

        Assert.assertNotEquals(testPerson2,people.findPersonById(id));
    }

    @Test
    public void testRemoveAllPeople () {
        List<Person> testList = new ArrayList<Person>();
        testList.add(testPerson);
        testList.add(testPerson2);
        testList.add(testPerson3);
        People people = new People(testList);
        people.removeAllPeople();

        Assert.assertEquals(0, testList.size());
    }

    @Test
    public void testIteratorPeople() {
        List<Person> testList = new ArrayList<Person>();
        testList.add(testPerson);
        testList.add(testPerson2);
        testList.add(testPerson3);
        People people = new People(testList);
        people.iteratorPeople(testList);
    }

}
