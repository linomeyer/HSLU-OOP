package ch.hslu.oop.sw07;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class PersonNameComparatorTest {

    private PersonNameComparator personNameComparator;

    @BeforeEach
    void setUp() {
        personNameComparator = new PersonNameComparator();
    }

    @Test
    void comparePersonLastnameIsLarger() {
        Person person = new Person(46758778, "Max", "Zurmühle");
        Person person2 = new Person(46758778, "Max", "Mustermann");

        assertTrue(personNameComparator.compare(person, person2) > 0);
    }

    @Test
    void comparePersonLastnameIsSmaller() {
        Person person = new Person(46758778, "Max", "Apfelbaum");
        Person person2 = new Person(46758778, "Max", "Mustermann");

        assertTrue(personNameComparator.compare(person, person2) < 0);
    }

    @Test
    void comparePersonPersonIsEqual() {
        Person person = new Person(46758778, "Max", "Mustermann");
        Person person2 = new Person(46758778, "Max", "Mustermann");

        assertTrue(personNameComparator.compare(person, person2) == 0);
    }

    @Test
    void comparePersonLastnameIsEqualAndFirstnameIsLarger() {
        Person person = new Person(46758778, "Max", "Mustermann");
        Person person2 = new Person(46758778, "Aaron", "Mustermann");

        assertTrue(personNameComparator.compare(person, person2) > 0);
    }

    @Test
    void comparePersonLastnameIsEqualAndFirstnameIsSmaller() {
        Person person = new Person(46758778, "Aaron", "Mustermann");
        Person person2 = new Person(46758778, "Max", "Mustermann");


        assertTrue(personNameComparator.compare(person, person2) < 0);
    }
}