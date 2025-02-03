public class ShapeService {

   Circle circle;
   Rectangle rectangle;


    public ShapeService() {
        //Directly creating a Circle object and Rectangle object inside the
        // class that shows tight coupling with the Circle and Rectangle.
        this.circle = new Circle();
        this.rectangle = new Rectangle();
    }

    public void printShape() {

        circle.draw();
        rectangle.draw();
    }
}