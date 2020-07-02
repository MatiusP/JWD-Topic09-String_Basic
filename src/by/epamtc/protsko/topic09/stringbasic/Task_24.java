package by.epamtc.protsko.topic09.stringbasic;

//Выделение слов из строки

public class Task_24 {

    public static String[] wordsFromStringLine(String stringLine) {
        String notWordRegex = "[^a-zA-ZА-Яа-я0-9]";

        return stringLine.replaceAll(notWordRegex, " ")
                .replaceAll("[\\s]+", " ")
                .split(" ");
    }


    //----- check result -----
    public static void main(String[] args) {
        String line = "Java is !!! %^&  one of the most      popular programming ! ###    fds  language";
        String[] stringLineWords = wordsFromStringLine(line);
        for (String stringLineWord : stringLineWords) {
            System.out.println(stringLineWord);
        }
    }
}
