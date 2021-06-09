import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ObjectBinarySearchTest {
    String[] strings = new String[5];
    Double[] doubles = new Double[5];

    @BeforeEach
    void setUp() {
        for(int i = 0; i < 5; i++)
        {
            strings[i] = "hello " + i;
            doubles[i] = 100.0*i;
        }

        Arrays.sort(strings);
        Arrays.sort(doubles);
        System.out.println(Arrays.toString(strings));
        System.out.println(Arrays.toString(doubles));
    }

    @Test
    void search() {
        int result = ObjectBinarySearch.search(strings, "hello 0");
        Assertions.assertEquals(0, result);
        result = ObjectBinarySearch.search(strings, "hello 5");
        Assertions.assertEquals(-1, result);
        result = ObjectBinarySearch.search(doubles, 400.0);
        Assertions.assertEquals(4, result);

    }

}