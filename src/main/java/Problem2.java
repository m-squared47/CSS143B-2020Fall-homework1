public class Problem2 {

    // Do not change signature (function name, parameters)
    public static void bubbleSort(int[] data) {
        // ascending order
        boolean sorted = false;     //loop condition
        int a;                      //hold 2 values to swap values if needed
        int b;

        if(data.length >= 2) {      //if there is more than 1 element
            while (!sorted) {       //if not sorted and the array has more than one element
                sorted = true;      //tells the loop to run if unsorted. Will remain true if sorted

                for (int i = 0; i < data.length - 1; i++) {
                    a = data[i];
                    b = data[i + 1];

                    if (a > b) {              //if the start element is more than than the next
                        data[i] = b;        //swap
                        data[i + 1] = a;
                        sorted = false;     //tells the while loop to run again since it's unsorted
                    }
                }
            }
        }
    }
}
