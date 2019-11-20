package org.classroom.domain.shapes;

import org.classroom.geolocation.Distance;

/**
 * Shape, Used to represent the room shape.
 * a shape does know the max distance from center.
 *
 * @author alexc
 *
 */
public abstract class Shape {

    public abstract Distance getMaxDistanceFromCenter();

}
