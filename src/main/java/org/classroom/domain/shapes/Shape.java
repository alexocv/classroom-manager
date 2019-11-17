package org.classroom.domain.shapes;

import org.classroom.geolocation.Distance;

/**
 * Room shape, it represents the room shape.
 *
 * @author alexc
 *
 */
public abstract class Shape {

    public abstract Distance getMaxDistanceFromCenter();

}
