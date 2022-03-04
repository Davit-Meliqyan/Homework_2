package car;

public class Test {

    public static void main(String[] args) {

        Engine engine = new Engine(110, 20000, 120);
        Car car = new Car(1996, "c180", "Mers", engine);


        car.getEngine().setHorsepower(1111);
        System.out.println(car);
        car.getEngine().setHorsepower(11102020);
        System.out.println(car);
        System.out.println(engine);
        engine.setHorsepower(254);
        System.out.println(engine);
        car.getEngine().setHorsepower(254);
        System.out.println(car);

    }
}
