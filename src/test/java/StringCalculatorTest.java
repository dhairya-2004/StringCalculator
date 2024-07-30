import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class StringCalculatorTest {

    @Test
    public void testAddEmptyString() {     //Test case for empty string
        StringCalculator calculator = new StringCalculator();
        assertEquals(0, calculator.add(""));
    }

    @Test
    public void testAddSingleNumber() {    //Test case for single digit number
        StringCalculator calculator = new StringCalculator();
        assertEquals(1, calculator.add("1"));
    }


    @Test
    public void testAddTwoNumbers() {   //Test case for 2 numbers in string
        StringCalculator calculator = new StringCalculator();
        assertEquals(3, calculator.add("1,2"));
    }

    @Test
    public void testAddMultipleNumbers() {   //Test case for multiple numbers
        StringCalculator calculator = new StringCalculator();
        assertEquals(10, calculator.add("1,2,3,4"));
    }

    @Test
    public void testAddNumbersWithNewLines() {  //Test case for new line
        StringCalculator calculator = new StringCalculator();
        assertEquals(6, calculator.add("1\n2,3"));
    }
    @Test
    public void testIgnoreNumbersGreaterThan1000() {  //Test case for number>1000
        StringCalculator calculator = new StringCalculator();
        assertEquals(2, calculator.add("2,1001"));
    }

    @Test
    public void testIgnoreLargeNumbersWithNewLines() {
        StringCalculator calculator = new StringCalculator();
        assertEquals(6, calculator.add("2\n1001\n4"));
    }

    @Test
    public void testThrowExceptionForNegativeNumbers() {  //test case for negative number added to string
        StringCalculator calculator = new StringCalculator();
        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> {
            calculator.add("1,-2,3,-4");
        });
        assertEquals("Negatives not allowed: -2, -4", thrown.getMessage());
    }
}
