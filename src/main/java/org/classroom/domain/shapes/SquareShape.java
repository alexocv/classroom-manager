package org.classroom.domain.shapes;

import org.classroom.geolocation.Distance;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class SquareShape extends Shape
{
    private Distance side = new Distance(20, Distance.Unit.Meters);

    @Override
    public Distance getMaxDistanceFromCenter()
    {
        return new Distance (Math.hypot(side.getValue()/2, side.getValue()/2), side.getUnit());
    }

}
