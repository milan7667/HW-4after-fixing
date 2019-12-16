package hw4.shape.plane;

import hw4.Vertex.Vertex2D;
import hw4.interfaces.AreaMeasurable;
import hw4.interfaces.PerimeterMeasurable;
import hw4.interfaces.Shape;


public abstract class PlaneShape extends Shape implements PerimeterMeasurable, AreaMeasurable {

    public PlaneShape(Vertex2D vertexA) {
        super(vertexA);
    }
}



