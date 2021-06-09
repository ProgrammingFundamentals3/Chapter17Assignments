import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ObjectInsertionSorterTest {

    @Test
    void insertionSort() {
        String[] strings1 = new String[5];
        Double[] doubles1 = new Double[5];
        String[] strings2 = new String[5];
        Double[] doubles2 = new Double[5];
        for(int i = 0; i < 5; i++)
        {
            strings1[i] = "hello " + (5 - i);
            doubles1[i] = 100.0*(5 - i);
            strings2[i] = "hello " + (5 - i);
            doubles2[i] = 100.0*(5 - i);
        }
        Arrays.sort(strings2);
        Arrays.sort(doubles2);
        ObjectInsertionSorter.insertionSort(strings1);
        Assertions.assertArrayEquals(strings2, strings1);
        ObjectInsertionSorter.insertionSort(doubles1);
        assertArrayEquals(doubles2, doubles1);

    }
}