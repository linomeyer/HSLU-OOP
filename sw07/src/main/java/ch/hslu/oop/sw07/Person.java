package ch.hslu.oop.sw07;

import java.util.Objects;

public final class Person {
    private final long id;
    private String firstname;
    private String lastname;

    public Person(long id, String firstname, String lastname) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public long getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstname, lastname);
    }

    @Override
    public boolean equals(Object object) {
        if (object != null && object.getClass() == getClass()) {
            Person person = (Person) object;
            return person.id == id && ((person.firstname != null && firstname != null || firstname == null && person.firstname == null) && person.firstname.equals(firstname)) &&
                    ((person.lastname != null && lastname != null || lastname == null && person.lastname == null) && person.lastname.equals(lastname));
        }
        return false;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                '}';
    }
}
