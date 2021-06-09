import java.util.ArrayList;

public class Check {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(5);
        for(int i = 0; i < 5; i++)
        {
            list.add("hello " + i);
        }
        smallest(list);

    }
    public static String smallest( ArrayList<String> list)
    {
        // Get the first value in the list.
        String smallest = list.get(0);

        // Step through the list looking for smaller values.
        for (int index = 1; index < list.size(); index++)
        {
            String nextElement = list.get(index);
            if (nextElement.compareTo(smallest) < 0)
                smallest = nextElement;
        }
        System.out.println(smallest);
        // Return the smallest value in the list.
        return smallest;
    }
}
