package hw4.shape.plane;

import hw4.vertex.Vertex2D;
import hw4.interfaces.AreaMeasurable;
import hw4.interfaces.PerimeterMeasurable;

public class Rectangle extends PlaneShape implements PerimeterMeasurable, AreaMeasurable {

    private double width;
    private double height;

    public Rectangle(Vertex2D vertexA, double width, double height) {
        super(vertexA);
        this.height = height;
        this.width = width;
    }
    private double getWidth() {
        return width;
    }

    private void setWidth (double width)  {
       this.width = width;
    }

    private double getHeight() {
        return height;
    }

    private void setHeight (double width)  {
        this.height = height;
    }

    @Override
    public double getArea() {
        return getWidth() * getHeight();
    }

    @Override
    public double getPerimeter() {
        return (getWidth() + getHeight()) * 2;
    }
}
