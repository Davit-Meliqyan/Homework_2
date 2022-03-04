package homework_21.task_3;

public class Animal {

    protected int age;
    protected String name;

    public void sound() {
        System.out.println("Animal");
    }

    public Animal(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
