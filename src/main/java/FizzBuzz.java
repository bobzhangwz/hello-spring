public class FizzBuzz {

    public static String print(int num) {
        if (num % 3 == 0 && num % 5 == 0) {
            return "FizzBuzz";
        }
        if (num % 3 == 0) {
            return "Fizz";
        }
        if (num % 5 == 0) {
            return "Buzz";
        }
        return "";
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            System.out.println(print(i));
        }
    }
}
