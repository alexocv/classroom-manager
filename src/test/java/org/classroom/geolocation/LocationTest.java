package org.classroom.geolocation;

import static org.junit.Assert.*;

import org.junit.Test;

public class LocationTest {

    @Test
    public void CalculateDistancaSameLocation() {
        Location a = new Location( 34.069585, -118.441878);
        Distance result = a.getDistanceFrom(a);
        assertEquals(result.getValue(), 0.0, 0.0);
    }

    @Test
    public void CalculateDistancaOtherLocation() {
        Location a = new Location( 34.069585, -118.441878);
        Location b = new Location( 34.069742, -118.441312);
        Distance result = a.getDistanceFrom(b);
        assertEquals(0.054979, result.getValue(), 0.01 );
    }

}
