import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MyListTest {
    private MyList<String> myStringList;
    private MyList<Double> myDoubleList;
    String[] strings = new String[5];
    Double[] doubles = new Double[5];

    @BeforeEach
    void setUp() {
        myStringList = new MyList<>();
        myDoubleList = new MyList<>();
        for(int i = 0; i < 5; i++)
        {
            strings[i] = "hello " + i;
            doubles[i] = 100.0*i;
        }
        for (int i = 0; i < strings.length; i++) {
            myStringList.add(strings[i]);
            myDoubleList.add(doubles[i]);
        }

        Arrays.sort(strings);
        Arrays.sort(doubles);

    }
    @Test
    void add() {
        for (int i = 0; i < strings.length; i++) {
            myStringList.add(strings[i]);
            myDoubleList.add(doubles[i]);
        }
        Assertions.assertTrue(true);
    }

    @Test
    void largest() {
        String largestString = (String) myStringList.largest();
        assertEquals(strings[strings.length-1],largestString);
        double largestDouble = (double) myDoubleList.largest();
        assertEquals(doubles[doubles.length - 1],largestDouble);
    }

    @Test
    void smallest() {
        String smallestString = (String) myStringList.smallest();
        assertEquals(strings[0],smallestString);
        double smallestDouble = (double) myDoubleList.smallest();
        assertEquals(doubles[0],smallestDouble);
    }
}