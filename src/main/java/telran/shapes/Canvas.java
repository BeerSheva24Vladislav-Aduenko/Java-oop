package telran.shapes;

import telran.util.Arrays;

public class Canvas implements Shape{
   Shape[] shapes;

    public Canvas() {
    shapes = new Shape[0];
    }

    public void addShape(Shape shape) {
    shapes = Arrays.add(shapes, shape);
    }

    @Override
    public int perimiter() {
        int totalPerimeter = 0;
        for (Shape shape : shapes) {
            totalPerimeter += shape.perimiter();
        }
        return totalPerimeter;
    }

    @Override
    public int square() {
        int totalSquare = 0;
        for (Shape shape : shapes) {
            totalSquare += shape.square();
        }
        return totalSquare;
    }

}
