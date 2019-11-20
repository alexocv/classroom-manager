package org.classroom.geolocation;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * A simple distance POJO
 * @author alexc
 *
 */
@Data
@AllArgsConstructor
public class Distance
{
    /**
     * the distance value, it can be on different units
     */
    private double value;
    /**
     * the distance unit
     */
    private Unit unit;

    public static enum Unit {
        Kilometers,
        Meters
    }
}

