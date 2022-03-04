package homework_20.task_1;

public class Circle extends Shape {

    @Override
    protected double getArea(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double getPerimeter(double radius) {
        return 2 * Math.PI * radius;
    }
}
