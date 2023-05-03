import java.util.Arrays;
import java.util.*;
public class Main {
    public static void main(String[] args) {

        //laba 7_1
        //Инициализируем строку алфавитом
        String alphabet = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        //String alphabet =("abcdefghijklmnopqrstuvwxyz");

        //Вводим свой текст
        String str1 = "";
        str1 = "Мы ехали в лес. Завернули направо.";

        //Преобразуем строку в массив char'ов
        char[] charArray = str1.toLowerCase().toCharArray();

        //Выводим в консоль введенные символы с двумя пробелами
        for (int i = 0; i < str1.length(); i++) {
            if (charArray[i] == ' ' || charArray[i] == '.') {

            } else {
                System.out.printf("%3s", charArray[i]);
            }
        }
        // System.out.printf("%3s", charArray[i]);
        System.out.println();

        //Выводим в консоль номер позиции буквы в алфавите
        // System.out.print(" ");
        for (char x : charArray) {
            //Игнорируем символ пробела в веденном тексте

            if (x == ' ' || x == '.') {
                System.out.print("");
            } else {
                int i = alphabet.lastIndexOf(x);
                i += 1;
                System.out.printf("%3s", i);
            }
        }
        // laba 7_2
        String str = "Раман был учеником, у него не было пораков. Его отец - шахтер."
                .replace("Ра", "Ро").replace("ра", "ро");
        System.out.println();
        System.out.println(str);

        // laba 7_3
        int count = 1;
        String text = "Я вышел в магазин, ведь я меня отправили за банананами, но я не хотел идти в магазин!";
        String[] words = text.toLowerCase().replaceAll("[,.!:?]", "").split("\\s");
        Arrays.sort(words);
        //System.out.println(Arrays.toString(words));
        for (int i = 1; i < words.length; i++) {
            if (words[i].equals(words[i - 1])) {
                do {
                    count++;
                    i++;
                } while (i < words.length && words[i].equals(words[i - 1]));
            }
            System.out.println("Слово \"" + words[i - 1] + "\" встречается в тексте: " + count + " раз.");
            count = 1;
        }
        //laba 7_4
        String str_4 = "hihiughrkejhh";
        char[] new_str4 = str_4.toCharArray();
        int index=1;
        int col=1;

        for (int i=0;i<new_str4.length;i++){
            int colv=1;
            for (int j=i+1;j<new_str4.length;j++){
                if (new_str4[i]==new_str4[j]){
                    colv++;
                }
            }
            if (colv>col){
                col=colv;
                index=i;
            }
        }
        System.out.println();
        System.out.println("Максимальное количество вхождений: " + new_str4[index] + ":" + col);


        // laba7_5

        String my_text = "Первое предложение. Второе. Третье предложение";

        String[] sentences = my_text.split("[.!?]\\s*");
        Map<String, Integer> wordCounts = new HashMap<>();

        for (String sentence : sentences) {
            String[] words_5 = sentence.split("\\s+");
            for (String word_5 : words_5) {
                if (wordCounts.containsKey(word_5)) {
                    wordCounts.put(word_5, wordCounts.get(word_5) + 1);
                } else {
                    wordCounts.put(word_5, 1);
                }
            }
        }

        int maxSentences = 0;
        for (String sentence : sentences) {
            String[] words_5 = sentence.split("\\s+");
            for (String word_5 : words_5) {
                if (wordCounts.get(word_5) > 1) {
                    maxSentences++;
                    break;
                }
            }
        }

        System.out.println("Предложений с одинаковыми словами: " + maxSentences);

        // laba7_6
        String text_7 = "Может поможет вот это зелье. Может найти такое слово в первом предложении. " +
                "Которого нет ни в одном из остальных предложений вот это";

        String[] sentences_7 = text_7.toLowerCase().split("[.!?]\\s*");
        String[] firstSentenceWords = sentences_7[0].split("\\s+");
        Set<String> uniqueWords = new HashSet<>(Arrays.asList(firstSentenceWords));

        for (int i = 1; i < sentences_7.length; i++) {
            String[] words_7 = sentences_7[i].split("\\s+");
            for (String word_7 : words_7) {
                if (uniqueWords.contains(word_7)) {
                    uniqueWords.remove(word_7);
                }
            }
        }

        System.out.println("Слова из 1-го предложения, которых нет в других: " + uniqueWords);

        // laba7_7
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите текст:");
        String text_8 = scanner.nextLine();

        System.out.println("Введите слова через пробел");
        String[] wordList = scanner.nextLine().split("\\s+");

        Map<String, Integer> wordCount = new HashMap<>();
        for (String word : wordList) {
            wordCount.put(word, 0);
        }

        String[] wordsInText = text_8.split("\\s+");
        for (String word : wordsInText) {
            if (wordCount.containsKey(word)) {
                wordCount.put(word, wordCount.get(word) + 1);
            }
        }

        List<Map.Entry<String, Integer>> sortedWordCount = new ArrayList<>(wordCount.entrySet());
        sortedWordCount.sort((o1, o2) -> o2.getValue().compareTo(o1.getValue()));

        System.out.println("Вхождения слов:");
        for (Map.Entry<String, Integer> entry : sortedWordCount) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // laba7_8

        Scanner scanner_9 = new Scanner(System.in);

        System.out.println("Введите текст:");
        String text_9 = scanner_9.nextLine().toLowerCase();

        String[] wordsInText_9 = text_9.split("\\s+");
        Arrays.sort(wordsInText_9, (o1, o2) -> {
            if (o2.length() != o1.length()) {
                return o2.length() - o1.length();
            } else {
                int vowelCount1 = countVowels(o1);
                int vowelCount2 = countVowels(o2);
                return vowelCount1 - vowelCount2;
            }
        });

        System.out.println("Отсортированные по длине слова:");
        for (String word : wordsInText_9) {
            System.out.println(word);
        }
    }

    private static int countVowels(String word) {
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (c == 'а' || c == 'о' || c == 'у' || c == 'ы' || c == 'э' || c == 'е' || c == 'ё' ||
                    c == 'и' || c == 'ю' || c == 'я') {
                count++;
            }
        }
        return count;
    }
}