package io.zipcoder.interfaces;

import java.util.List;

public class Instructor extends Person implements Teacher {
    public Instructor(String name, long id) {
        super(name, id);
    }

    public void teach(Learner learner, double numberOfHours) {
        learner.learn(numberOfHours);
    }

    public void lecture(Learner[] learners, double numberOfHours) {
        double numberOfHoursPerLearner = numberOfHours / learners.length;
        for (Learner i : learners) {
            i.learn(numberOfHoursPerLearner);
        }

    }
}
