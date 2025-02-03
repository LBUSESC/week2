package com.sesc.unistudycircle.dependency;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ShapeService {
    @Autowired
    private Circle circle;  // field injection

    public void printShape() {
        System.out.println("Shape");
        circle.draw();
    }

}
