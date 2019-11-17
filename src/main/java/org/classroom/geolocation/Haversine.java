package org.classroom.geolocation;

/**
 *
 * Gives the distance between two points using the Haversine formula.
 * Formula from the Internet.
 * @author alexc
 *
 */
public class Haversine
{

    public static Distance EARTH_RADIUS = new Distance(6371.01, Distance.Unit.Kilometers);

    /**
     * Calcualtes the distance between to Locations by using the
     * Haversine formula
     *
     * @param pointA Location from
     * @param pointB Location to
     *
     * @return a Distance representation in kilometers between points.
     */
    public static Distance distance(Location pointA, Location pointB)
    {

        double latDistance = Math.toRadians(pointB.getLatitude() - pointA.getLatitude());
        double lonDistance = Math.toRadians(pointB.getLongitude() - pointA.getLongitude());
        double a = Math.sin(latDistance / 2) * Math.sin(latDistance / 2)
                + Math.cos(Math.toRadians(pointA.getLatitude())) * Math.cos(Math.toRadians(pointB.getLatitude()))
                * Math.sin(lonDistance / 2) * Math.sin(lonDistance / 2);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
        double distance = EARTH_RADIUS.getValue() * c * 1000; // convert to meters


        distance = Math.pow(distance, 2);

        return new Distance(Math.sqrt(distance), Distance.Unit.Kilometers);
    }
}

