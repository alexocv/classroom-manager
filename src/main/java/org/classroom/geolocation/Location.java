package org.classroom.geolocation;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Location, represented by latitude and longitude
 *
 * @author alex
 *
 */

@AllArgsConstructor
@Getter
public class Location
{
    /**
     * the latitude
     */
    private double latitude;
    /**
     * the longitude
     */
    private double longitude ;

    /**
     * Gets the distance from this location to another
     *
     * @param otherLocation the other location to calculate distance
     *
     * @return the distance to the input location
     */
    public Distance getDistanceFrom(Location otherLocation){

        return Haversine.distance(this, otherLocation);
    }
}
