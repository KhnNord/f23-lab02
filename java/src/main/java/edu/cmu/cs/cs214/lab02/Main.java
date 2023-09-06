package edu.cmu.cs.cs214.lab02;

import edu.cmu.cs.cs214.lab02.shapes.Rectangle;

public class Main {
    public static void main(String[] args) {
        final int width = 3;
        final int height = 2;
        Rectangle rectangle = new Rectangle(height, width);

        Renderer renderer = new Renderer(rectangle);

        renderer.draw();
    }
}
