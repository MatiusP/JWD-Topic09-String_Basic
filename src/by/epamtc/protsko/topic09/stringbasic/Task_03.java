package by.epamtc.protsko.topic09.stringbasic;

//Удалить одинаковые символы

public class Task_03 {

    public static String getUniqueSymbols(String stringLine) {
        StringBuilder stringLineWithoutDuplicateSymbols = new StringBuilder();
        char[] stringLineSymbols = stringLine.toCharArray();

        for (char symbol : stringLineSymbols) {
            if (stringLine.indexOf(symbol) == stringLine.lastIndexOf(symbol)) {
                stringLineWithoutDuplicateSymbols.append(symbol);
            }
        }
        return stringLineWithoutDuplicateSymbols.toString();
    }


    //----- check result -----
    public static void main(String[] args) {
        String stringLine = "Java program!";
        System.out.println(getUniqueSymbols(stringLine));


    }


}
