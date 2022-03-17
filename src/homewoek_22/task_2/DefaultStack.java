package homewoek_22.task_2;

import java.util.LinkedList;

public class DefaultStack implements Stack {

    private final int[] nums;
    public int index;
    private static final int MAX_SIZE = 5;

    public DefaultStack() {
        super();
        nums = new int[MAX_SIZE];
    }

    @Override
    public void push(int val) {
        if (index == MAX_SIZE) {
            throw new StackIndexOutOfBoundsException(
                    this.index,
                    MAX_SIZE);
        }
        nums[index] = val;
        index++;
    }

    @Override
    public int pop() {
        if (index == 0) {
            throw new EmptyStackException("Stack is empty");
        }
        int val = nums[this.index - 1];
        this.nums[this.index - 1] = 0;
        this.index--;
        return val;
    }

    public void print() {
        for (int i = index-1; i > 0; i--) {
            System.out.println(nums[i]);
        }
        System.out.println("_______________________");
    }

}
