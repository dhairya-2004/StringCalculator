public class StringCalculator {
    public int add(String numbers) {
        if (numbers.isEmpty()) { //if empty string
            return 0;
        }
        return Integer.parseInt(numbers); //if any single number
    }
}
