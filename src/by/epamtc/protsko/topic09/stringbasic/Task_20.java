package by.epamtc.protsko.topic09.stringbasic;

//Замена подстроки в строке

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task_20 {

    public static String changeSubstringInString(String stringLine, String oldSubstring, String newSubstring) {
        String stringLineWithChangeSubstring = stringLine;
        if (stringLine.contains(oldSubstring)) {
            Pattern pattern = Pattern.compile(oldSubstring);
            Matcher matcher = pattern.matcher(stringLineWithChangeSubstring);

            while (matcher.find()) {
                stringLineWithChangeSubstring = stringLineWithChangeSubstring.replace(oldSubstring, newSubstring);
            }
            return stringLineWithChangeSubstring;

        } else {
            System.out.println("No match for substring");
        }
        return stringLine;
    }


    //----- check result -----
    public static void main(String[] args) {
        String line = "mostJava is one of the most popular most most programming language :;?!-.,%&#$@ most";
        String changedStringLine = changeSubstringInString(line, "most", "HOST");
        System.out.println(changedStringLine);
    }
}
