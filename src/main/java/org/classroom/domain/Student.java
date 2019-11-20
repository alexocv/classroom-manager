package org.classroom.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

import org.classroom.geolocation.Location;

/**
 * Student POJO
 * Students does know their location.
 *
 * @author alex
 *
 */
@Data
@AllArgsConstructor
public class Student
{
    /**
     * Student personal information
     */
    private PersonalInformation personalInfo;
    /**
     * Student location
     */
    private Location location;
}
