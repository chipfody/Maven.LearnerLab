package io.zipcoder.interfaces;

public class Student extends Person implements Learner{

    double totalStudyTime;

    public Student(String name, long id) {
        super(name, id);
        totalStudyTime = 0;
    }

    public void learn(double numberOfHours) {
        totalStudyTime += numberOfHours;
    }

    public Double getTotalStudyTime() {
        return totalStudyTime;
    }
}
