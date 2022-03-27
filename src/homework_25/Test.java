package homework_25;

public class Test {


    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static int factorial(int n) {
        if (n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static boolean isPalindrome(String str) {
        if (str == null) {
            return false;
        }
        if (str.length() == 0 || str.length() == 1) {
            return true;
        }
        if (str.charAt(0) == str.charAt(str.length() - 1)) {
            return isPalindrome(str.substring(1, str.length() - 1));
        }
        return false;
    }

    //6
    public static int countX(String str) {
        if (str.length() == 0) {
            return 0;
        }
        if (str.charAt(0) == 'x') {
            return 1 + countX(str.substring(1));
        }
        return countX(str.substring(1));
    }

    //7
    public static String removeX(String str) {
        if (str.length() == 0) {
            return "";
        }
        if (str.charAt(0) == 'x') {
            return removeX(str.substring(1));
        }
        return str.charAt(0) + removeX(str.substring(1));
    }

    //8
    public static String reverse(String str) {
        if ((str == null) || (str.length() <= 1)) {
            return str;
        }
        return str.charAt(str.length() - 1) + reverse(str.substring(0, str.length() - 1));
    }
    //9

    //10
    public static String singleChar(String str) {
        if ((str == null) || (str.length() < 2)) {
            return str;
        }
        if (str.charAt(0) == str.charAt(1)) {
            return singleChar(str.substring(1));
        }
        return str.charAt(0) + singleChar(str.substring(1));
    }

    //11
    static boolean isPrime(int num, int i) {
        if (i == 1 || i == 2 || i > num / 2) {
            return true;
        }
        if (num % i == 0) {
            return false;
        }
        return isPrime(num, i + 1);
    }

    //12

    //13
    public static int countDigit(String str) {
        if (str.length() == 0) {
            return 0;
        }
        if ((int) str.charAt(0) > 47 && (int) str.charAt(0) < 58) {
            return 1 + countDigit(str.substring(1));
        }
        return countDigit(str.substring(1));
    }

    //14
    public static String addAsterisk(String str) {
        if ((str == null) || (str.length() < 2)) {
            return str;
        }
        System.out.println(str.length());
        str = str.charAt(0) + "*" + str.substring(1);
        System.out.println(str.length());
        return str.substring(0, 2) + addAsterisk(str.substring(2));
    }

    //15
    public static String addParentheses(String str) {
        if ((str == null) || (str.length() < 3)) {
            return str;
        }
        System.out.println(str.length());
        str = str.charAt(0) + "(" + str.substring(1, str.length() - 1) + ")" + str.charAt(str.length() - 1);
        System.out.println(str.length());
        return str.substring(0, 2) + addParentheses(str.substring(2, str.length() - 2)) + str.substring(str.length() - 2);
    }

    //16
    public static String mirror(String str) {
        if ((str == null) || (str.length() < 2)) {
            return str;
        }
        return str+ str.charAt(str.length() - 1) + mirror(str.substring(0, str.length() - 1));
    }

    public static void main(String[] args) {
        String s = "cara";
//        System.out.println(isPalindrome(s));
//        System.out.println(countX(s));
//        System.out.println(removeX(s));
//        System.out.println(reverse(s));
//        System.out.println(singleChar(s));
//        System.out.println(isPrime(12, 2));
//        System.out.println(countDigit(s));
//        System.out.println(addParentheses(s));
        System.out.println(mirror(s));

    }
}
