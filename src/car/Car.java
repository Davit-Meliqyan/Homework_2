package car;

public final class Car {

    private int year;
    private String model;
    private String mark;
    private final Engine engine;


    public int getYear() {
        return year;
    }

    public String getModel() {
        return model;
    }

    public String getMark() {
        return mark;
    }

    public Engine getEngine() {
        return engine.copy();
    }

    public Car(int year, String model, String mark, Engine engine) {
        this.year = year;
        this.model = model;
        this.mark = mark;
        this.engine = new Engine(engine);
    }

    public Car(Car car) {
        this(car.getYear(), car.getModel(), car.getMark(), new Engine(car.getEngine()));
    }

    @Override
    public String toString() {
        return "Car{" +
                "year=" + year +
                ", model='" + model + '\'' +
                ", mark='" + mark + '\'' +
                ", engine=" + engine +
                '}';
    }
}
