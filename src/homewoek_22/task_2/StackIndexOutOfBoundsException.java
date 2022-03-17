package homewoek_22.task_2;

public class StackIndexOutOfBoundsException extends RuntimeException {
    public StackIndexOutOfBoundsException(int index, int size) {
        super(index + " index is out of bound for stack size " + size);
    }
}
