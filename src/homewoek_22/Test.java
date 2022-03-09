package homewoek_22;

import homewoek_22.task_2.DefaultStack;

import java.util.Scanner;

public class Test {

    public static int inputNumOrString() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("input again");
            }
        }
    }

    public static void main(String[] args) {
//        System.out.println("input number");
//        System.out.println(inputNumOrString());

        DefaultStack stack = new DefaultStack();
//        stack.pop();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.print();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.print();
    }
}
