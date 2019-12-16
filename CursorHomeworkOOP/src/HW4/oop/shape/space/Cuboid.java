package hw4.shape.space;

import hw4.vertex.Vertex3D;

public class Cuboid extends SpaceShape {
    private double width;
    private double height;
    private double depth;

    public Cuboid(Vertex3D vertexA, double width, double height, double depth) {
        super(vertexA);
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setDepth(double depth) {
        this.depth = depth;
    }

    public double getDepth() {
        return depth;
    }

    @Override
    public double getArea() {
        return 2 * (width * height + height * depth + width * depth);
    }

    @Override
    public double getVolume() {
        return width * height * depth;
    }

    @Override
    public String toString() {
        return "Cuboid: " + "Vertex (" + getVertexA() +
                "), width=" + width +
                ", height=" + height +
                ", depth=" + depth + ", area = " + getArea() + ", volume = " + getVolume() +
                '.';
    }
}
