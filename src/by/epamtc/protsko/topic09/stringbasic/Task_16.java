package by.epamtc.protsko.topic09.stringbasic;

//Поменять слова местами

import java.util.Arrays;
import java.util.List;

public class Task_16 {

    public static String swapWords(String stringLine, String firstWord, String secondWord) {
        StringBuilder swapWordsLine = new StringBuilder();

        List<String> stringLineWords = Arrays.asList(stringLine.split(" "));

        if (stringLineWords.contains(firstWord) && stringLineWords.contains(secondWord)) {
            for (String stringLineWord : stringLineWords) {
                if (!stringLineWord.equalsIgnoreCase(firstWord) && !stringLineWord.equalsIgnoreCase(secondWord)) {
                    swapWordsLine.append(stringLineWord).append(" ");
                } else if (stringLineWord.equals(firstWord)) {
                    swapWordsLine.append(secondWord).append(" ");
                } else {
                    swapWordsLine.append(firstWord).append(" ");
                }
            }
        }
        return swapWordsLine.toString();
    }


    //----- check result -----
    public static void main(String[] args) {
        String line = "Java C++ Java C++ C++ Python";
        String changedStringLine = swapWords(line, "Java", "C++");
        System.out.println(changedStringLine);
    }
}
