public class StringCalculator {
    public int add(String numbers) {
        if (numbers.isEmpty()) { //if empty string
            return 0;
        }

        String[] numArray = numbers.split(","); //if string contains comma
        int sum = 0;
        for (String num : numArray) {
            sum += Integer.parseInt(num);
        }
        return sum;
    }
}
