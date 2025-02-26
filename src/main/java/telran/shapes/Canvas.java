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

    public int count() {
        int res = 0;
        for (int i = 0; i < shapes.length; i++) {
            res++;
            if (shapes[i] instanceof Canvas canvas) {
                res += canvas.count();
            }
        }
        return res;
    }

    // public int count() {
    //     int res = 0;
    //     for (int i = 0; i < shapes.length; i++) {
    //         res++;
    //         if (shapes[i] instanceof Canvas ) {
    //             res += ((Canvas)shapes[i]).count();
    //         }
    //     }
    //     return res;
    // }

}
