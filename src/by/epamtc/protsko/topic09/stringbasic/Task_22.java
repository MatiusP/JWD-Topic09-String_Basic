package by.epamtc.protsko.topic09.stringbasic;

//Удаление из строки слов заданной длины

public class Task_22 {

    public static String deleteWordsGivenLength(String stringLine, int wordLength) {
        return stringLine
                .replaceAll("\\b[\\w]{" + wordLength + "," + wordLength + "}\\b", "");
    }


    //----- check result -----
    public static void main(String[] args) {
        String line = "Java is one of the most popular programming fds language";
        String line1 = "Java is java of yy12 most popular programming fds language type";
        System.out.println(deleteWordsGivenLength(line, 4));
        System.out.println(deleteWordsGivenLength(line1, 11));
    }


}
