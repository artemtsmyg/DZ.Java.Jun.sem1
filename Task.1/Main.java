import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Программа для вычисления среднего значения всех четных чисел в списке с использованием Stream API.
 */
public class Main {

    /**
     * Метод для вычисления среднего значения всех четных чисел в списке.
     * @param numbers список чисел
     * @return среднее значение всех четных чисел в списке
     */
    public static double averageOfEvenNumbers(List<Integer> numbers) {
        return numbers.stream()
                    .filter(num -> num % 2 == 0)
                    .mapToDouble(num -> num)
                    .average()
                    .orElse(0);
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12);

        double average = averageOfEvenNumbers(numbers);
        System.out.println("Среднее значение всех четных чисел в списке: " + average);
    }
}