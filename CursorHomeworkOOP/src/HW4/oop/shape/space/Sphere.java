package hw4.shape.space;

import hw4.vertex.Vertex3D;

public class Sphere extends SpaceShape {

    private double radius;

    public Sphere(Vertex3D vertexA, double radius) {
        super(vertexA);
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double getArea() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double getVolume() {
        return (4 * Math.PI * Math.pow(radius, 3)) / 3;
    }

    @Override
    public String toString() {
        return "Sphere: "
                + "Vertex ( " + getVertexA() +
                "), radius = " + getRadius() +
                ", area = " + getArea() +
                ", volume = " + getVolume() + ".";
    }
}
