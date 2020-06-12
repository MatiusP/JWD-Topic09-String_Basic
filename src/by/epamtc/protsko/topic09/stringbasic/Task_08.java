package by.epamtc.protsko.topic09.stringbasic;

//Копирование части строки

public class Task_08 {

    public static String copyPartOfStringLine(String stringLine, int beginIndex) {
        return stringLine.substring(beginIndex);
    }

    public static String copyPartOfStringLine(String stringLine, int beginIndex, int endIndex) {
        return stringLine.substring(beginIndex, endIndex);
    }


    //----- check result -----
    public static void main(String[] args) {
        String line = "Java is one of the most popular programming language";
        String substring1 = copyPartOfStringLine(line, 5);
        String substring2 = copyPartOfStringLine(line, 11, 16);

        System.out.println(substring1);
        System.out.println(substring2);
    }
}
