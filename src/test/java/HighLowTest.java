import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class HighLowTest {
    String[] strings = new String[5];
    Double[] doubles = new Double[5];
    HighLow<String> stringHighLow;
    HighLow<Double> doubleHighLow;

    @BeforeEach
    void setUp() {
        for(int i = 0; i < 5; i++)
        {
            strings[i] = "hello " + i;
            doubles[i] = 100.0*i;
        }
        stringHighLow = new HighLow<>(strings);
        doubleHighLow = new HighLow<>(doubles);
        Arrays.sort(strings);
        Arrays.sort(doubles);
    }

    @Test
    void getHighest() {
        String largestString = strings[strings.length - 1];
        assertEquals(largestString, stringHighLow.getHighest());
        double largestDouble = doubles[doubles.length - 1];
        assertEquals(largestDouble, doubleHighLow.getHighest());
    }

    @Test
    void getLowest() {
        String lowestString = strings[0];
        assertEquals(lowestString, stringHighLow.getLowest());
        double lowestDouble = doubles[0];
        assertEquals(lowestDouble, doubleHighLow.getLowest());
    }
}