package homewoek_22;

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
        System.out.println("input number");
        System.out.println(inputNumOrString());
    }
}
