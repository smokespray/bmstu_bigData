import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class PairwiseSummation {

    public PairwiseSummation(ArrayList<Integer> numbers) {
        //int[] numbers = new int[]{2, 4, 6, 8, 10}; // произвольный конечный ряд чисел
        int result = pairwiseSummation(numbers);
        System.out.println("Результат попарного суммирования: " + result);
    }

    public static int pairwiseSummation(ArrayList<Integer> numbers) {
        Set<Integer> set = new HashSet<>(numbers);
        while (set.size() > 1) {
            Set<Integer> newSet = new HashSet<>();
            Integer prev = null;
            for (Integer number : set) {
                if (prev != null) {
                    int sum = prev + number;
                    newSet.add(sum);
                    prev = null;
                } else {
                    prev = number;
                }
            }
            if (prev != null) {
                newSet.add(prev);
            }
            set = newSet;
        }
        return set.iterator().next();
    }

}
