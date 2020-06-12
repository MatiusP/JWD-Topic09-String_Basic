package by.epamtc.protsko.topic09.stringbasic;

//Вставка подстроки

public class Task_06 {

    public static String insertSubstringToStringLine(String stringLine, String substring, int offset) {
        StringBuilder newStringLine = new StringBuilder(stringLine);
        newStringLine.insert(offset, substring);
        return newStringLine.toString();
    }


    //----- check result -----
    public static void main(String[] args) {
        String line = "Java";
        String substring = " is one of the most popular programming language";
        String lineWithSubstring = insertSubstringToStringLine(line, substring, 4);
        System.out.println(lineWithSubstring);

    }
}
