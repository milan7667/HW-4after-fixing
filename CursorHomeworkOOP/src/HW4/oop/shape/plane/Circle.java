package hw4.shape.plane;

import hw4.vertex.Vertex2D;
import hw4.interfaces.AreaMeasurable;
import hw4.interfaces.PerimeterMeasurable;

public class Circle extends PlaneShape implements PerimeterMeasurable, AreaMeasurable {

        private double radius;

    public Circle(double radius, Vertex2D vertexA) {

        super(vertexA);
        this.radius = radius;

    }

    private double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.round(2 * Math.PI * getRadius());
    }

    @Override
    public double getPerimeter() {
        return Math.round(Math.PI * Math.pow(getRadius(), 2));
    }

    @Override
    public String toString() {
        return "Circle: " + "vertex " + getVertexA() + ", radius = " + getRadius() +
                ", perimeter = " + getPerimeter() + ", area = " + getArea();
    }

}

