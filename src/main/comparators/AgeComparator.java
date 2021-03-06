package main.comparators;

import main.model.Student;

import java.util.Comparator;

public class AgeComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getDateOfBirth() - o2.getDateOfBirth();
    }
}

