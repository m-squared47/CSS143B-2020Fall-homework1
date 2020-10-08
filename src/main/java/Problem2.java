public class Problem2 {

    // Do not change signature (function name, parameters)
    public static int[] bubbleSort(int[] data) {
        // ascending order
        int[] toSort = data;        //return array
        boolean sorted = false;     //loop condition
        int a;                      //hold 2 values to swap values if needed
        int b;

        if(data.length >= 2) {      //if there is more than 1 element
            while (!sorted) {       //if not sorted and the array has more than one element
                sorted = true;      //tells the loop to run if unsorted. Will remain true if sorted

                for (int i = 0; i < data.length - 1; i++) {
                    a = toSort[i];
                    b = toSort[i + 1];

                    if (a > b) {              //if the start element is more than than the next
                        toSort[i] = b;        //swap
                        toSort[i + 1] = a;
                        sorted = false;     //tells the while loop to run again since it's unsorted
                    }
                }
            }
        }

        return toSort;  //returns the sorted array or the input array if there are 1 or no elements
    }
}
