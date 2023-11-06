package ch.hslu.oop.sw07;

import nl.jqno.equalsverifier.EqualsVerifier;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PersonTest {
    @Test
    void instantiation_ShouldSetIdAndName_WhenPersonIsCreated() {
        Person person = new Person(46758778, "Max", "Mustermann");

        EqualsVerifier.forClass(Person.class).verify();
        assertEquals("Max", person.getFirstname());
        assertEquals("Mustermann", person.getLastname());
        assertEquals(46758778, person.getId());
    }
}