package by.epamtc.protsko.topic09.stringbasic;

//Является ли строка палиндромом?

public class Task_19 {

    public static boolean isStringLinePalindrome(String stringLine) {
        String stringLineForCompares = stringLine.replaceAll("[^\\p{L}]", " ")
                .replaceAll("[\\s]+", "");

        StringBuilder reverseStringLine = new StringBuilder(stringLineForCompares).reverse();

        return stringLineForCompares.compareToIgnoreCase(reverseStringLine.toString()) == 0;
    }


    //----- check result -----
    public static void main(String[] args) {
        String line = "А в Енисее — синева";

        if (isStringLinePalindrome(line)) {
            System.out.println("The string is palindrome");
        } else {
            System.out.println("The string isn't palindrome");
        }
    }
}
