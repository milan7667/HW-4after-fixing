package hw4.shape.plane;

import hw4.vertex.Vertex;
import hw4.vertex.Vertex2D;
import hw4.interfaces.AreaMeasurable;
import hw4.interfaces.PerimeterMeasurable;

public class Triangle extends PlaneShape implements PerimeterMeasurable, AreaMeasurable {
    private Vertex2D vertexB;
    private Vertex2D vertexC;

    public Triangle(Vertex2D vertexA, Vertex2D vertexB, Vertex2D vertexC) {
        super(vertexA);
        this.vertexB = vertexB;
        this.vertexC = vertexC;

    }

    public Vertex2D getVertexB() {
        return vertexB;
    }

    public void setVertexB(Vertex2D vertexB) {
        this.vertexB = vertexB;
    }

    public Vertex2D getVertexC() {
        return vertexC;
    }

    public void setVertexC(Vertex2D vertexC) {
        this.vertexC = vertexC;
    }

    public double getLengthPartAB(Vertex vertexA, Vertex vertexB) {
        return Math.sqrt(Math.pow((vertexA.getX() - vertexB.getX()), 2)
                + Math.pow((vertexA.getY() - vertexB.getY()), 2));

    }

    public double getLengthPartBC(Vertex vertexB, Vertex vertexC) {
        return Math.sqrt(Math.pow((vertexB.getX() - vertexC.getX()), 2)
                + Math.pow((vertexB.getY() - vertexC.getY()), 2));

    }

    public double getLengthPartCA(Vertex vertexC, Vertex vertexA) {
        return Math.sqrt(Math.pow((vertexC.getX() - vertexA.getX()), 2)
                + Math.pow((vertexC.getY() - vertexA.getY()), 2));

    }


    @Override
    public double getPerimeter() {
        return this.getLengthPartAB() + this.getLengthPartBC() + this.getLengthPartCA();
        double p = this.getPerimeter() / 2;
    }

    @Override
    public double getArea() {
        double p;
        return Math.sqrt(p * ((p - this.getLengthPartAB()) * (p - this.getLengthPartBC()) * (p - this.getLengthPartCA()));
    }

}
