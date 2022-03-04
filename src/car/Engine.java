package car;

public class Engine {

    private int horsepower;
    private double mileage;
    private double weight;

    public Engine(Engine engine) {
        this(engine.horsepower, engine.mileage, engine.weight);
    }

    public Engine(int horsepower, double mileage, double weight) {
        this.horsepower = horsepower;
        this.mileage = mileage;
        this.weight = weight;
    }

    public Engine copy(){
        return new Engine(this);
    }
    public int getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "horsepower=" + horsepower +
                ", mileage=" + mileage +
                ", weight=" + weight +
                '}';
    }
}
