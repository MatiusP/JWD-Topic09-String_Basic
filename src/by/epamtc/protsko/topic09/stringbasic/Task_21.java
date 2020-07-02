package by.epamtc.protsko.topic09.stringbasic;

//Сложение очень длинных целых чисел

public class Task_21 {

    public static String sumBigIntegerNumbers(String firstNumber, String secondNumber) {
        StringBuilder sumBigIntegerNumbers = new StringBuilder();
        int carryOver = 0;

        while (firstNumber.length() != secondNumber.length()) {
            if (firstNumber.length() > secondNumber.length()) {
                secondNumber = '0' + secondNumber;
            } else {
                firstNumber = '0' + firstNumber;
            }
        }

        for (int i = firstNumber.length() - 1; i >= 0; i--) {
            int sumDigit = Character.getNumericValue(firstNumber.charAt(i)) +
                    Character.getNumericValue(secondNumber.charAt(i)) + carryOver;
            if (i == 0) {
                sumBigIntegerNumbers.insert(0, sumDigit);
            } else if (sumDigit >= 10) {
                carryOver = 1;
                sumBigIntegerNumbers.insert(0, (sumDigit - 10));
            } else {
                sumBigIntegerNumbers.insert(0, sumDigit);
                carryOver = 0;
            }
        }
        return sumBigIntegerNumbers.toString();
    }


    //----- check result -----
    public static void main(String[] args) {
        String firstNumber = "99999999991231321321";
        String secondNumber = "3333333333123658";

        System.out.println(sumBigIntegerNumbers(firstNumber, secondNumber));
    }
}
