package by.epamtc.protsko.topic09.stringbasic;

//Выполнить переворот строки

public class Task_05 {

    public static String getStringLineReverse(String stringLine) {
        return new StringBuilder(stringLine).reverse().toString();
    }


    //----- check result -----
    public static void main(String[] args) {
        String line = "Java language";
        String stringLineReverse = getStringLineReverse(line);
        System.out.println(stringLineReverse);
    }
}
