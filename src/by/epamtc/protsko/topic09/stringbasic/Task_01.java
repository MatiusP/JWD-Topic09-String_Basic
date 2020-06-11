package by.epamtc.protsko.topic09.stringbasic;

//Четные и нечетные символы разделить по разным строкам

public class Task_01 {
    private static StringBuilder evenLineCharacter = new StringBuilder();
    private static StringBuilder oddLineCharacter = new StringBuilder();

    private static void divisionEvenAndOddCharacter(String primaryString) {
        for (int i = 0; i < primaryString.length(); i++) {
            if ((i + 1) % 2 == 0) {
                evenLineCharacter.append(primaryString.charAt(i));
            } else {
                oddLineCharacter.append(primaryString.charAt(i));
            }
        }
    }

    public static String getEvenCharacterString(String primaryString) {
        if (evenLineCharacter.length() == 0) {
            divisionEvenAndOddCharacter(primaryString);
        }
        return evenLineCharacter.toString();
    }

    public static String getOddCharacterString(String primaryString) {
        if (oddLineCharacter.length() == 0) {
            divisionEvenAndOddCharacter(primaryString);
        }
        return oddLineCharacter.toString();
    }


    //----- check result -----
    public static void main(String[] args) {
        String line = "I like java";

        System.out.println(getOddCharacterString(line));
        System.out.println(getEvenCharacterString(line));
    }
}
