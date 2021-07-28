public class FizzBuzz {
    public static void main(String[] args) {
        FizBuz();
    }

    public static void FizBuz() {
        for (int i = 1; i <= 100; i++) {
            if ((i % 3 == 0) & (i % 5 == 0)) {
                System.out.println(i + "FizzBuzz");
            } else if ((i % 3 == 0) & (i % 5 != 0)) {
                System.out.println("Fizz");
            } else {
                if ((i % 5 == 0) & (i % 3 != 0)) {
                    System.out.println("Buzz");
                }
            }
        }
    }
}