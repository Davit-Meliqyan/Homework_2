package homework_20.task_1;


public class Square extends Shape{

    @Override
    protected double getArea(double a) {
        return Math.pow(a,2);
    }

    @Override
    public double getPerimeter(double a) {
        return 4*a;
    }
}
