package homewoek_22.task_2;

public class DefaultStack implements Stack {

    public int[] nums;
    public int index ;
    public int MAX_SIZE =5;

    public DefaultStack() {
        index = -1;
        nums = new int[MAX_SIZE];
    }

    @Override
    public void push(int val) {
        if (index == MAX_SIZE-1) {
            throw new StackIndexOutOfBoundsException();
        }
        nums[++index] = val;
    }

    @Override
    public int pop() {
        if (index == -1) {
            throw new EmptyStackException();
        }
        return nums[index--];
    }

    public void print() {
        for (int i = index; i > -1; i--) {
            System.out.println(nums[i]);
        }
        System.out.println("_______________________");
    }
}
