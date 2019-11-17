package org.classroom.domain.shapes;

import static org.junit.Assert.*;

import org.junit.Test;

public class SquareShapeTest {

    @Test
    public void squareShapeDefaultSide()
    {
        SquareShape shape = new SquareShape();
        double maxDistance = shape.getMaxDistanceFromCenter().getValue();

        assertEquals(14.1421, maxDistance, 0.01);

    }

}
