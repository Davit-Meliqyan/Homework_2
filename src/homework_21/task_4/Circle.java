package homework_21.task_4;

public class Circle implements Shape{

    private int radius;

    public Circle(int r) {
        this.radius = r;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI*Math.pow(radius,2);
    }

    @Override
    public double parameter() {
        return 2*Math.PI* radius;
    }
}
