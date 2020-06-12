package by.epamtc.protsko.topic09.stringbasic;

//Заменить пробел и группы пробелов символом "*"

public class Task_12 {

    public static String changeSpaceAndGroupSpace(String stringLine) {
        return stringLine.replaceAll("[\\s]+", "*");
    }


    //----- check result -----
    public static void main(String[] args) {
        String line = "Java is one of the most      popular programming   language";
        String changedLine = changeSpaceAndGroupSpace(line);
        System.out.println(changedLine);
    }
}
