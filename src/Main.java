import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /**
         * Принимаем от пользователя строку
         */
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
//        System.out.println(text);

        /**
         * Обрезаем пробелы по краям строки(если они есть)
         */
        text = text.trim();
//        System.out.println(text);

        /**
         * Разбиваем исходную строку на массив слов
         */
        String[] words = text.split(" ");

//        for (String word : words){
//            System.out.println(word);
//        }

        /**
         * Сортируем буквы в каждом слове
         */
        String[] sortedWords = new String[words.length];
        System.arraycopy(words,0,sortedWords,0,words.length);
        for (int i = 0; i < sortedWords.length; i++) {
            char[] letters = sortedWords[i].toCharArray();
            Arrays.sort(letters);
            sortedWords[i] = String.copyValueOf(letters);
        }
//        for (String sortedWord : sortedWords){
//            System.out.println(sortedWord);
//        }

        /**
         * Проверяем слова на анограммы и выводим попарно
         */
        for (int i = 0; i < sortedWords.length - 1; i++){
            for (int j = i + 1; j < sortedWords.length; j++){
                if (sortedWords[i].equalsIgnoreCase(sortedWords[j])){
                    System.out.println(words[i] + " - " + words[j]);
                }
            }
        }
//        for (String word : words){
//            System.out.println(word);
//        }
    }
}
