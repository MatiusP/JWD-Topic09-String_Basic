package by.epamtc.protsko.topic09.stringbasic;

//Число вхождений подстроки в строку

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task_10 {

    public static int getCountSubstringInStringLine(String stringLine, String substring) {
        int countSubstring = 0;
        Pattern pattern = Pattern.compile(substring);
        Matcher matcher = pattern.matcher(stringLine);

        while (matcher.find()) {
            countSubstring++;
        }
        return countSubstring;
    }


    //----- check result -----
    public static void main(String[] args) {
        String line1 = "java java. Program language Java";
        System.out.println(getCountSubstringInStringLine(line1, "java"));
    }
}
