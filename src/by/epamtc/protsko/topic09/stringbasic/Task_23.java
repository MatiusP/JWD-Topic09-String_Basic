package by.epamtc.protsko.topic09.stringbasic;

//Удаление лишних пробелов

public class Task_23 {

    public static String removeExtraSpaces(String stringLine) {
        return stringLine.replaceAll("[\\s]+", " ");
    }


    //----- check result -----
    public static void main(String[] args) {
        String line = "Java is one of the most      popular programming ! ###    fds  language";
        String lineWithoutExtraSpaces = removeExtraSpaces(line);
        System.out.println(lineWithoutExtraSpaces);
    }
}
