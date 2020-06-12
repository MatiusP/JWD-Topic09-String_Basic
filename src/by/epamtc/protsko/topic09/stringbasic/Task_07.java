package by.epamtc.protsko.topic09.stringbasic;

//Удаление подстроки

public class Task_07 {

    public static String getStringLineWithoutSubstring(String stringLine, String substring) {
        int substringIndex = stringLine.indexOf(substring);

        if (substringIndex < 0) {
            System.out.println("String line doesn't contains substring");
            return stringLine;
        } else {
            return new StringBuilder(stringLine)
                    .delete(substringIndex, substringIndex + substring.length())
                    .toString();
        }
    }


    //----- check result -----
    public static void main(String[] args) {
        String line = "Java is one of the most popular programming language";
        String substring = "one of";
        System.out.println(getStringLineWithoutSubstring(line, substring));
    }
}
