package ch.hslu.oop.sw01;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Hans Müller", "S01");
        Student student2 = new Student("Jakob Meyer", "S02");
        Student student3 = new Student("Max Mustermann", "S03");

        LabClass labClass = new LabClass(3);
        labClass.enrollStudent(student1);
        labClass.enrollStudent(student2);
        labClass.enrollStudent(student3);

        labClass.setTime("Tuesday, 8pm");
        labClass.setRoom("201");
        labClass.setInstructor("Jack Jones");

        labClass.printList();
    }
}
