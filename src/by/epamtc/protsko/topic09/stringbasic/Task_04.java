package by.epamtc.protsko.topic09.stringbasic;

//Определить частоту встречаемости символа в строке

public class Task_04 {

    public static String getSymbolsFrequencyCount(String stringLine) {
        StringBuilder lineSymbolsFrequencyCount = new StringBuilder();
        String copyStringLine = stringLine;

        while (copyStringLine.length() > 0) {
            int symbolCount;
            int copyStringLineLength = copyStringLine.length();
            char symbol = copyStringLine.charAt(0);

            copyStringLine = copyStringLine.replaceAll(String.valueOf(symbol), "");
            symbolCount = copyStringLineLength - copyStringLine.length();
            lineSymbolsFrequencyCount
                    .append(symbol)
                    .append("=")
                    .append(symbolCount).append("\n");
        }
        return lineSymbolsFrequencyCount.toString();
    }

    //----- check result -----
    public static void main(String[] args) {
        String line = "I have to do my homework";
        System.out.println(getSymbolsFrequencyCount(line));
    }


}
