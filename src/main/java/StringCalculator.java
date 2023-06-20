public class StringCalculator {
    public static int add(String numbers) {
        int returnValue=0;
        String[] numbersArray = numbers.split(",|\n");
        for (String number : numbersArray) {
            if (!number.trim().isEmpty()) {
                int numberInt = Integer.parseInt(number.trim());
                if (numberInt < 0) {
                    throw new RuntimeException("Negatives not allowed");
                }
                if (numberInt < 1000) {
                    returnValue += numberInt;
                }
            }
        }
        return returnValue;
    }
}
