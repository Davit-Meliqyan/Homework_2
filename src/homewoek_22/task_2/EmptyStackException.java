package homewoek_22.task_2;

public class EmptyStackException extends RuntimeException{
    public EmptyStackException() {
        super("You can't pop from an empty stack");
    }
}
