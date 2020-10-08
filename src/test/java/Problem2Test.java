import org.junit.Test;

import static org.junit.Assert.*;

public class Problem2Test {
    // Example test
    // Okay to change
    @Test
    public void testBubbleSort() {
        int inputs[][] = {      //input arrays
                {},                     //empty
                {3},                    //1 element
                {3, 4},                 //sorted 2 elements
                {4, 3},                 //unsorted 2 elements
                {1, 2, 4, 3},           //unsorted 4 elements
                {1, 2, 3, 4},           //sorted 4 elements
                {1, 1, 1, 1},           //same 4 elements
                {10, 2, 5, 8, 11, 0}    //unsorted 6 elements
        };
        int targets[][] = {     //expected output arrays
                {},
                {3},
                {3, 4},
                {3, 4},
                {1, 2, 3, 4},
                {1, 2, 3, 4},
                {1, 1, 1, 1},
                {0, 2, 5, 8, 10, 11}
        };

        int input[];

        for(int i = 0; i < inputs.length; i++){     //go through every element and target
            input = Problem2.bubbleSort(inputs[i]);
            assertArrayEquals(input, targets[i]);
        }
    }
}
