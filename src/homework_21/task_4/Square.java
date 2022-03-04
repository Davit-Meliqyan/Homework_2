package homework_21.task_4;

public class Square implements Shape{

    int a;

    public Square(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    @Override
    public double area() {
        return a*a;
    }

    @Override
    public double parameter() {
        return 4*a;
    }
}
