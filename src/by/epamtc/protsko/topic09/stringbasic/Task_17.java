package by.epamtc.protsko.topic09.stringbasic;

//Удалить последнее слово в строке

public class Task_17 {

    public static String deleteLastWordFromStringLine(String stringLine) {
        StringBuilder stringLineWithoutLastWord = new StringBuilder(stringLine);

        String stringLineForMethod = stringLine.replaceAll("[^\\p{L}#_]", " ")
                .replaceAll("[\\s]+", " ").trim();

        String lastWord = stringLineForMethod.substring((stringLineForMethod.lastIndexOf(" ") + 1));
        int indexLastWord = stringLine.lastIndexOf(lastWord);

        stringLineWithoutLastWord.delete(indexLastWord, indexLastWord + lastWord.length());

        return stringLineWithoutLastWord.toString().replaceAll("[\\s]+", " ").trim();
    }


    //----- check result -----
    public static void main(String[] args) {
        String line = "Java is one of the most popular programming language!";
        String line1 = "Java is one of the most popular programming language before ...";

        System.out.println(deleteLastWordFromStringLine(line));
        System.out.println(deleteLastWordFromStringLine(line1));
    }
}
