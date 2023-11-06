package ch.hslu.oop.sw07;

import java.util.Comparator;

public class PersonNameComparator implements Comparator<Person> {
    @Override
    public int compare(Person p1, Person p2) {
        int compare = p1.getLastname().compareTo(p2.getLastname());
        if (compare == 0) {
            compare = p1.getFirstname().compareTo(p2.getFirstname());
        }
        return compare;
    }
}
