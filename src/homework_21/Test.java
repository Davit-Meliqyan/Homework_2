package homework_21;

import homework_21.task_1.Cat;
import homework_21.task_1.Horse;
import homework_21.task_3.Animal;
import homework_21.task_4.Circle;
import homework_21.task_4.Rectangle;
import homework_21.task_4.Square;


public class Test {

    public static void main(String[] args) {

        Horse horse = new Horse();
        Cat cat = new Cat();

        horse.sound();
        cat.sound();

        Animal animal = new Animal(12, "Bob");
        animal.sound();
        System.out.println(animal);

        homework_21.task_3.Cat cat1 = new homework_21.task_3.Cat(5, "Mur");
        cat1.sound();
        System.out.println(cat1);

        Circle circle = new Circle(10);
        System.out.println(circle.area());
        System.out.println(circle.parameter());

        Square square = new Square(10);
        System.out.println(square.area());
        System.out.println(square.parameter());

        Rectangle rectangle = new Rectangle(5,17);
        System.out.println(rectangle.area());
        System.out.println(rectangle.parameter());
    }
}
