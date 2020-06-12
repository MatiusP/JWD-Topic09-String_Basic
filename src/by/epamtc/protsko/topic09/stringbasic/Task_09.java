package by.epamtc.protsko.topic09.stringbasic;

//Определение длины строки

public class Task_09 {

    public static int getStringLineLength(String stringLine) {
        return stringLine.length();
    }


    //----- check result -----
    public static void main(String[] args) {
        String line = "Java is one of the most popular programming language";
        System.out.println(getStringLineLength(line));
    }
}
