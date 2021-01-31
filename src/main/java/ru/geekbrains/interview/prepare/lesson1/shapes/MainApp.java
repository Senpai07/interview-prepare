package ru.geekbrains.interview.prepare.lesson1.shapes;

public class MainApp {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[]{new Triangle(), new Square(), new Circle()};

        for (Shape shape : shapes) {
            shape.draw();
        }
    }
}
