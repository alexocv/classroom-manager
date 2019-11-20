package org.classroom.domain;

import org.classroom.domain.shapes.Shape;
import org.classroom.geolocation.Distance;
import org.classroom.geolocation.Location;

import lombok.AllArgsConstructor;
import lombok.Data;


/**
 * Classroom representation
 * Classroom does calculation to know if there is any distance inside the room.
 *
 * @author alex
 *
 */
@Data
@AllArgsConstructor
public class Classroom
{
    /**
     * Classroom name
     */
    private String name;

    /**
     * Classroom center location
     */
    private Location location;

    private Shape shape;

    /**
     * Return true if the distance is inside the room.
     *
     * TODO: there is a big assumption here, there is no knowledge about the
     * room orientation, just the center doesn't give enough information to calculate proper distances
     *
     * Consequently now it is only handled max square distance, for 20x20 area, which is not the
     * 10 meters. I am using pitagoras formula, the value is hardcoded for now
     */
    public boolean isDistanceInsideRoom(Distance distance)
    {
        return shape.getMaxDistanceFromCenter().getValue() - distance.getValue() > 0 ;
    }

}
