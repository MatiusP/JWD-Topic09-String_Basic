package by.epamtc.protsko.topic09.stringbasic;

//Выделение слов из строки

public class Task_24 {

    public static String[] getWordsFromStringLine(String stringLine) {
        return stringLine.replaceAll("[^a-zA-ZА-Яа-я0-9]", " ")
                .replaceAll("[\\s]+", " ")
                .split(" ");
    }


    //----- check result -----
    public static void main(String[] args) {
        String line = "Java is !!! %^&  one of the most      popular programming ! ###    fds  language Процко";
        String[] stringLineWords = getWordsFromStringLine(line);
        for (String stringLineWord : stringLineWords) {
            System.out.println(stringLineWord);
        }
    }
}
