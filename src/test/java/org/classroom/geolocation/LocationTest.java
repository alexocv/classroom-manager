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
        Location a = new Location( 34.069149, -118.442639 );
        Location b = new Location( 34.069140, -118.442689);
        Distance result = a.getDistanceFrom(b);
        assertEquals(4.7129, result.getValue(), 0.01 );
    }

}
