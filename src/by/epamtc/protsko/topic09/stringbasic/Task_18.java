package by.epamtc.protsko.topic09.stringbasic;

//Добавление пробелов в строку

public class Task_18 {

    public static String getStringAddedSpaces(String stringLine, int countExtraSpaces) {
        StringBuilder stringLineWithAddedSpaces = new StringBuilder(stringLine);
        int counter = 0;

        while (stringLineWithAddedSpaces.indexOf(" ", counter) > 0) {
            int countSpaces = countExtraSpaces;
            int spaceIndex = stringLineWithAddedSpaces.indexOf(" ", counter);
            while (countSpaces != 0) {
                stringLineWithAddedSpaces.insert(spaceIndex, " ");
                countSpaces--;
            }
            counter = spaceIndex + countExtraSpaces + 2;
        }
        return stringLineWithAddedSpaces.toString();
    }


    //----- check result -----
    public static void main(String[] args) {
        String line = "Java ! javac javac!";
        String stringLineWithAddedSpaces = getStringAddedSpaces(line, 1);
        System.out.println(stringLineWithAddedSpaces);

    }
}
