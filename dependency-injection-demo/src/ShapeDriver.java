public class ShapeDriver {
    public static void main(String[] args) {

        Shape circle = new Circle();

        // Injecting Circle dependency into ShapeService object at runtime
        ShapeService shapeService = new ShapeService(circle);
        shapeService.printShape();

        Shape rectangle = new Rectangle();
        // Injecting Rectangle dependency into ShapeService object at runtime
        ShapeService rectangleService = new ShapeService(rectangle);
        rectangleService.printShape();

    }
}
