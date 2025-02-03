public class ShapeService {

    Shape shape;

    // Constructor injection
    public ShapeService(Shape shape) {
        this.shape = shape;
    }

    public void printShape() {
        shape.draw();
    }
}