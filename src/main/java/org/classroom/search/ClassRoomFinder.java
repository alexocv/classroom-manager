package org.classroom.search;

import java.util.LinkedList;
import java.util.List;

import org.classroom.domain.Classroom;
import org.classroom.domain.Student;
import org.classroom.geolocation.Distance;

/**
 * Utility to find if student is in a class room area based on their locations
 *
 * @author alexc
 *
 */
public class ClassRoomFinder
{

    /**
     * Return all the students that are in the class room area based on their location
     * Searching is based on room center location, the distance that exists between the student
     * and the location should match the max distance from the room center.
     *
     * @param students a list of students
     * @param classrooms the class room to search students.
     * @return
     */
    public List<Student> studentsInClasses(List<Student> students, List<Classroom> classrooms)
    {
        List<Student> result = new LinkedList<Student>();
        for (Student student : students)
        {
            for (Classroom classroom : classrooms)
            {
                Distance distance =
                    classroom.getLocation().getDistanceFrom(student.getLocation());

                if (classroom.isDistanceInsideRoom(distance))
                {
                    result.add(student);
                    break;
                }
            }
        }

        return result;
    }

}
