import java.util.ArrayList;
import java.util.List;

public class StringCalculator {
    public int add(String numbers) {
        if (numbers.isEmpty()) { //if string is empty
            return 0;
        }


        String[] numArray = numbers.split("[,\n]"); // Modify as needed for delimiters
        int sum = 0;
        List<String> negatives = new ArrayList<>();

        for (String num : numArray) {
            if (!num.isEmpty()) {
                int number = Integer.parseInt(num);
                if (number < 0) {
                    negatives.add(num);
                } else if (number <= 1000) {
                    sum += number;
                }
            }
        }

        if (!negatives.isEmpty()) {
            throw new IllegalArgumentException("Negatives not allowed: " + String.join(", ", negatives));
        }

        return sum;
    }
}
