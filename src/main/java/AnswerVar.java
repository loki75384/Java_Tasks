public class Answer {

    public static void main(String[] args) {
        printPrimeNums();
    }

    public static void printPrimeNums() {
        for (int number = 2; number <= 1000; number++) {
            boolean isPrime = true;

            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println(number);
            }
        }
    }
}

