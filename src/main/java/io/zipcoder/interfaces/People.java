package io.zipcoder.interfaces;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class People {
    List<Person> personList;

    public People(List<Person> personList) {
        this.personList = personList;
    }

    public void addPerson(Person person, List<Person> personList) {
        personList.add(person);
    }

    public Person findPersonById (double idNumber) {
        Person target = null;
        for (Person p : personList)
            if (p.getId() == idNumber)
                target =  p;
        return target;
    }

    public boolean containsPerson (Person person) {
        return personList.contains(person);
    }

    public void removePerson(Person person) {
        personList.remove(person);
    }

    public void removeById (double id) {
        for (Person p : personList)
            if (p.getId() == id)
                personList.remove(p);
    }

    public void removeAllPeople() {
        personList.clear();
    }

    public Integer countPeople(List<Person> personList) {
        return personList.size();
    }

    public String toArray(List<Person> personList) {
        StringBuilder listPeople = new StringBuilder();
        for (int i = 0; i < personList.size(); i++) {
            listPeople.append(personList.get(i)).append("\n");
        }
        System.out.println(listPeople);
        return listPeople.toString();
    }

    public void iteratorPeople(List<Person> personList) {
        ListIterator<Person> iteratePeople = personList.listIterator();
        while (iteratePeople.hasNext()) {
            Person p = iteratePeople.next();
        }
    }
}
