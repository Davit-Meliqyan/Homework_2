package homework_21.task_3;

public class Cat extends Animal{

    @Override
    public void sound(){
        System.out.println("Cat");
    }


    public Cat(int age, String name) {
        super(age, name);
    }
}
