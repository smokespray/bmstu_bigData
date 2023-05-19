import java.util.Arrays;
import java.util.List;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        // laba9_1
        List<String> collection = Arrays.asList("apple", "banana", "cherry", "date");
        String pattern = "a.*e"; // шаблон

        boolean allMatch = collection.stream().allMatch(str -> str.matches(pattern));
        String firstElement = collection.stream().findFirst().orElse(null);

        System.out.println("Первый элемент коллекции: " + firstElement);
        System.out.println("Существуют ли все совпадения с шаблоном: " + allMatch);

        // laba9_2
        List<Integer> collection_2 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        int sum = collection_2.stream()
                .filter(num -> num % 2 != 0) // оставляем только нечетные числа
                .mapToInt(Integer::intValue) // преобразуем Integer в int
                .sum(); // суммируем все числа

        System.out.println("Сумма нечетных чисел: " + sum);

        // laba9_3
        class People {
            private String name;
            private int age;

            public People(String name, int age) {
                this.name = name;
                this.age = age;
            }

            public String getName() {
                return name;
            }

            public int getAge() {
                return age;
            }

            @Override
            public String toString() {
                return "People{" +
                        "name='" + name + '\'' +
                        ", age=" + age +
                        '}';
            }
        }
        Collection<People> peoples = Arrays.asList(
                new People("Ivan", 16),
                new People("Petr", 23),
                new People("Maria", 42)
        );

        System.out.println("Сортировка по алфавиту в обратном порядке");

        peoples.stream()
                .sorted(Comparator.comparing(People::getName).reversed()) // сортируем по имени в обратном порядке
                .forEach(System.out::println); // выводим результат

        //laba9_4
        System.out.println("Сортировка по возрасту");
        // Сортировка по возрасту
        peoples.stream()
                .sorted(Comparator.comparingInt(People::getAge))
                .forEach(System.out::println);
    }
}