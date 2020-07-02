package by.epamtc.protsko.topic09.stringbasic;

//Вывести слова строки в обратном порядке

public class Task_11 {

    public static String stringLineWithWordsInReverseOrder(String stringLine) {
        StringBuilder stringLineWithWordsInReverseOrder = new StringBuilder();
        String[] stringLineWords = stringLine.replaceAll("[^\\w]", " ")
                .replaceAll("[\\s]+", "*")
                .split("\\*");

        for (int i = stringLineWords.length - 1; i >= 0; i--) {
            String word = stringLineWords[i];
            if (i != 0) {
                stringLineWithWordsInReverseOrder.append(word).append(" ");
            } else {
                stringLineWithWordsInReverseOrder.append(word);
            }
        }
        return stringLineWithWordsInReverseOrder.toString();
    }


    //----- check result -----
    public static void main(String[] args) {
        String line = "Java is one of the most popular programming language :;?!-.,%&#$@";
        System.out.println(stringLineWithWordsInReverseOrder(line));
    }
}
