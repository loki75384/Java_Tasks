import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
class Answer6{
    public static void analyzeNumbers(Integer[] arr) {
        // Введите свое решение ниже
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(arr));

        Collections.sort(list);

        System.out.println(list);

        int min = list.get(0);
        int max = list.get(list.size() - 1);
        double average = list.stream().mapToInt(Integer::intValue).average().orElse(0);

        System.out.println("Minimum is " + min);
        System.out.println("Maximum is " + max);
        System.out.println("Average is = " + average);


    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Printer6 {
    public static void main(String[] args) {
        Integer[] arr = {};

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            arr = new Integer[]{4, 2, 7, 5, 1, 3, 8, 6, 9};
        }
        else{
            arr = Arrays.stream(args[0].split(", "))
                    .map(Integer::parseInt)
                    .toArray(Integer[]::new);
        }

        Answer6 ans = new Answer6();
        ans.analyzeNumbers(arr);
    }
}