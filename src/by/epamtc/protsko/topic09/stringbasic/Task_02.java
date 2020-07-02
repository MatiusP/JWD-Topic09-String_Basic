package by.epamtc.protsko.topic09.stringbasic;

//Вычислить процентное соотношение строчных и прописных букв

public class Task_02 {
    private static int countUppercaseLetters = 0;
    private static int countLowercaseLetters = 0;

    private static void countUppercaseAndLowercaseLetter(String stringLine) {
        String onlyLettersLine = stringLine.replaceAll("[\\W\\d_]", "");
        char[] lettersArray = onlyLettersLine.toCharArray();

        for (char symbol : lettersArray) {
            if (symbol == Character.toUpperCase(symbol)) {
                countUppercaseLetters++;
            } else {
                countLowercaseLetters++;
            }
        }
    }

    public static double percentageRatioUppercaseAndLowercaseLetter(String stringLine) {
        countUppercaseAndLowercaseLetter(stringLine);
        if (countUppercaseLetters == 0) {
            System.out.println("In string line only lowercase letters.");
            return 0;
        }

        if (countLowercaseLetters == 0) {
            System.out.println("In string line only uppercase letters.");
            return 100;
        }

        return ((double) countUppercaseLetters / countLowercaseLetters) * 100;
    }


    //----- check result -----
    public static void main(String[] args) {
        String line1 = "iiii Java hello  ";
        System.out.printf("Percentage ratio Uppercase and Lowercase letters = %5.2f",
                percentageRatioUppercaseAndLowercaseLetter(line1));
    }

}
