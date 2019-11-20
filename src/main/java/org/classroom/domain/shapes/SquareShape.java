package org.classroom.domain.shapes;

import org.classroom.geolocation.Distance;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Square shape has  one side and the same is being used to create a shape.
 *
 * @see Distance
 * @author alexc
 *
 */
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class SquareShape extends Shape
{
    private Distance side = new Distance(20, Distance.Unit.Meters);

    /**
     * Max side calculation is calculated by getting hypotenuse.
     */
    @Override
    public Distance getMaxDistanceFromCenter()
    {
        return new Distance (Math.hypot(side.getValue()/2, side.getValue()/2), side.getUnit());
    }

}
