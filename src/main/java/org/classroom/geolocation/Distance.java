package org.classroom.geolocation;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Distance
{

    private double value;
    private Unit unit;

    public static enum Unit {
        Kilometers,
        Meters
    }
}

