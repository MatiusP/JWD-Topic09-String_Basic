package by.epamtc.protsko.topic09.stringbasic;

// Замена в самом длинном слове буквы "a" на букву "b"
// Найти длину самого короткого слова в строке
// Определить количество слов в строке

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task_13_14_15 {

    private static String[] getStringLineWords(String stringLine) {
        return stringLine.replaceAll("[^\\w]", " ")
                .replaceAll("[\\s]+", "*")
                .split("\\*");
    }

    public static int getLengthLongestWord(String stringLine) {
        String[] stringLineWords = getStringLineWords(stringLine);
        int maxWordLength = stringLineWords[0].length();

        for (String stringLineWord : stringLineWords) {
            if (stringLineWord.length() >= maxWordLength) {
                maxWordLength = stringLineWord.length();
            }
        }
        return maxWordLength;
    }


    //Найти длину самого короткого слова в строке
    public static int getLengthShortestWord(String stringLine) {
        String[] stringLineWords = getStringLineWords(stringLine);
        int minWordLength = stringLineWords[0].length();

        for (String stringLineWord : stringLineWords) {
            if (stringLineWord.length() <= minWordLength) {
                minWordLength = stringLineWord.length();
            }
        }
        return minWordLength;
    }

    public static String[] getArrayLongestWords(String stringLine) {
        StringBuilder longestWords = new StringBuilder();
        String[] stringLineWords = getStringLineWords(stringLine);
        int maxWordLength = getLengthLongestWord(stringLine);

        for (String stringLineWord : stringLineWords) {
            if (stringLineWord.length() == maxWordLength) {
                longestWords.append(stringLineWord).append(" ");
            }
        }
        return longestWords.toString().trim().split(" ");
    }


    // Замена в самом длинном слове буквы "a" на букву "b"
    public static String changeSymbolsInLongestWords(String stringLine) {
        String[] stringLineLongestWords = getArrayLongestWords(stringLine);
        String changedStringLine = stringLine;

        for (String stringLineLongestWord : stringLineLongestWords) {
            Pattern pattern = Pattern.compile(stringLineLongestWord);
            Matcher matcher = pattern.matcher(stringLine);
            while (matcher.find()) {
                String changedWord = matcher.group().replaceAll("a", "b");
                changedStringLine = changedStringLine.replace(stringLineLongestWord, changedWord);
            }
        }
        return changedStringLine;
    }

    //----- check result -----
    public static void main(String[] args) {
        String line = "Java javac javac, java! java - ^ javasg javava";
        System.out.println(changeSymbolsInLongestWords(line));

        System.out.println("Length of shortest word in string line = " + getLengthShortestWord(line));
        System.out.println("Count words in string line = " + getStringLineWords(line).length);
    }
}
