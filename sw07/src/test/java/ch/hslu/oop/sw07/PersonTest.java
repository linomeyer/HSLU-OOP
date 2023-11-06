package ch.hslu.oop.sw07;

import nl.jqno.equalsverifier.EqualsVerifier;
import nl.jqno.equalsverifier.Warning;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class PersonTest {
    @Test
    void verifyEqualsTrue() {
        Person person = new Person(46758778, "Max", "Mustermann");

        EqualsVerifier.forClass(Person.class).suppress(Warning.NONFINAL_FIELDS).verify();
        assertEquals("Max", person.getFirstname());
        assertEquals("Mustermann", person.getLastname());
        assertEquals(46758778, person.getId());
    }

    @Test
    void verifyEqualsFalse() {
        Person person = new Person(46758778, "Max", "Mustermann");
        Person person2 = new Person(46758779, "Jimmy", "Neutron");

        assertNotEquals(person2, person);
    }

    @Test
    void verifyEqualHashCodeWhenObjectsEqual() {
        Person person = new Person(46758778, "Max", "Mustermann");
        Person person2 = new Person(46758778, "Max", "Mustermann");

        assertEquals(person2, person);
        assertEquals(person2.hashCode(), person.hashCode());
    }

    @Test
    void comparePersonIdIsLarger() {
        Person person = new Person(46758790, "Max", "Mustermann");
        Person person2 = new Person(46758779, "Aaron", "Zurmühle");

        assertEquals(1, person.compareTo(person2));
    }

    @Test
    void comparePersonIdIsSmaller() {
        Person person = new Person(46758745, "Max", "Mustermann");
        Person person2 = new Person(46758779, "Aaron", "Zurmühle");

        assertEquals(-1, person.compareTo(person2));
    }

    @Test
    void comparePersonIdIsEqual() {
        Person person = new Person(46758779, "Max", "Mustermann");
        Person person2 = new Person(46758779, "Aaron", "Zurmühle");

        assertEquals(0, person.compareTo(person2));
    }
}