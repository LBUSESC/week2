package com.sesc.unistudycircle.dependency;

import org.springframework.stereotype.Component;

@Component
public class Circle {
    public void draw() {
        System.out.println("Drawing Circle");
    }
}
