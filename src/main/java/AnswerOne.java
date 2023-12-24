public class Answer {

    public static int countNTriangle(int n) {
        if (n < 1) {
            return -1;
        }

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        return sum;
    }

    public static void main(String[] args) {
        int n = 4;
        int nTriangle = countNTriangle(n);
        System.out.println("n-ое треугольное число для n = " + n + " равно " + nTriangle);

    }
}

