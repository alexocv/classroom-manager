package org.classroom.search;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.classroom.domain.Classroom;
import org.classroom.domain.PersonalInformation;
import org.classroom.domain.Student;
import org.classroom.domain.shapes.SquareShape;
import org.classroom.geolocation.Location;
import org.junit.Before;
import org.junit.Test;

public class ClassRoomFinderTest {

    List<Classroom> rooms ;
    ClassRoomFinder finder;

    @Before
    public void setUp()
    {
        rooms = new LinkedList<Classroom>();
        finder = new ClassRoomFinder();
        addClassRoom("Principles of computational geo-location analysis",
                34.069140, -118.442689, rooms );
        addClassRoom("Sedimentary Petrology", 34.069585, -118.441878 , rooms);
        addClassRoom("Introductory Psychobiology", 34.069742, -118.441312, rooms );
        addClassRoom("Art of Listening', 'latitude", 34.070223, -118.440193, rooms );
        addClassRoom("Art Hitory", 34.071528, -118.441211 , rooms);
    }

    @Test
    public void findeAllStudents() {
        List<Student> students = new LinkedList<Student>();
        addStudens( "John Wilson", 34.069149, -118.442639 , students);
        addStudens ( "Jane Graham", 34.069601, -118.441862, students );
        addStudens( "Pam Bam", 34.071513, -118.441181 , students );

        ArrayList<String> expectedNames = new ArrayList<String>(3);
        expectedNames.add("John Wilson");
        expectedNames.add("Jane Graham");
        expectedNames.add("Pam Bam");

        List<Student> studentsInClasses = finder.studentsInClasses(students, rooms);

        assertEquals(3, studentsInClasses.size());

        for (Student student : studentsInClasses) {
            assertTrue(expectedNames.contains(student.getPersonalInfo().getName()));
        }
    }

    @Test
    public void findeOneStudents() {
        List<Student> students = new LinkedList<Student>();
        addStudens( "John Wilson", 34.069849, -118.443539 , students);
        addStudens ( "Jane Graham", 34.069901, -118.441562, students );
        addStudens( "Pam Bam", 34.071523, -118.441171 , students );

        ArrayList<String> expectedNames = new ArrayList<String>(1);
        expectedNames.add("Pam Bam");

        List<Student> studentsInClasses = finder.studentsInClasses(students, rooms);

        assertEquals(1, studentsInClasses.size());

        for (Student student : studentsInClasses) {
            assertTrue(expectedNames.contains(student.getPersonalInfo().getName()));
        }
    }

    private void addClassRoom
        (String name, double latitude, double longitude, List<Classroom> rooms)
    {
        Location location = new Location(latitude, longitude);
        Classroom room = new Classroom(name, location, new SquareShape());
        rooms.add(room);
    }

    private void addStudens
    (String name, double latitude, double longitude, List<Student> students)
    {
        Location location = new Location(latitude, longitude);
        PersonalInformation info = new PersonalInformation(name);
        Student room = new Student(info, location);
        students.add(room);
    }
}
