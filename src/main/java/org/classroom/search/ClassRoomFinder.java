package org.classroom.search;

import java.util.LinkedList;
import java.util.List;

import org.classroom.domain.Classroom;
import org.classroom.domain.Student;
import org.classroom.geolocation.Distance;

public class ClassRoomFinder
{

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
