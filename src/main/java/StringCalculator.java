public class StringCalculator {
    public int add(String numbers) {
        if (numbers.isEmpty()) { //if empty string
            return 0;
        }

        if (numbers.contains(",")) {
            String[] numArray = numbers.split(",");
            return Integer.parseInt(numArray[0]) + Integer.parseInt(numArray[1]);
        }   //if string contains comma


        return Integer.parseInt(numbers); //if any single number
    }
}
