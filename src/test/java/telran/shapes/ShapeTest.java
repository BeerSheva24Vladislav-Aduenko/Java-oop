package telran.shapes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class ShapeTest {
    @Test()
    void CanvasTestPerimeter() {
        Canvas canvas = new Canvas();
        assertEquals(0, canvas.perimiter());
        canvas.addShape(new Rectangle(5, 10));
        canvas.addShape(new Square(5));
        assertEquals(50, canvas.perimiter());
    }

    @Test()
    void CanvasTestSquare() {
        Canvas canvas = new Canvas();
        assertEquals(0, canvas.square());
        canvas.addShape(new Rectangle(10, 20));
        canvas.addShape(new Square(10));
        assertEquals(300, canvas.square());
    }

    @Test()
    void RectangleTestPerimeter() {
        assertEquals(0, new Rectangle(0, 0).perimiter());
        assertEquals(30, new Rectangle(5, 10).perimiter());
        assertEquals(60, new Rectangle(10, 20).perimiter());
    }

    @Test()
    void RectangleestSquare() {
        assertEquals(0, new Rectangle(0, 0).square());
        assertEquals(50, new Rectangle(10, 5).square());
    }


    @Test()
    void SquareTestPerimeter() {
        assertEquals(0, new Square(0).perimiter());
        assertEquals(40, new Square(10).perimiter());
        assertEquals(120, new Square(30).perimiter());
    }

    @Test()
    void SquareTestSquare() {
        assertEquals(0, new Square(0).square());
        assertEquals(100, new Square(10).square());
        assertEquals(100, new Square(-10).square());
    }
}