import java.util.ArrayList;
import java.util.Arrays;

class AnswerAny{
            public static ArrayList<Integer> removeEvenNumbers(Integer[] arr) {
                ArrayList<Integer> list = new ArrayList<>(Arrays.asList(arr));

                list.removeIf(n -> n % 2 == 0);

                return list;
            }
        }




        // Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
    public class PrinterAny {
        public static void main(String[] args) {
            Integer[] arr = {};

            if (args.length == 0) {
                // При отправке кода на Выполнение, вы можете варьировать эти параметры
                arr = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
            }
            else{
                arr = Arrays.stream(args[0].split(", "))
                        .map(Integer::parseInt)
                        .toArray(Integer[]::new);
            }

            AnswerAny ans = new AnswerAny();
            ans.removeEvenNumbers(arr);
        }
    }
}

