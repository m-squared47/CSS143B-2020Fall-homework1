public class Problem1 {

    // Do not change signature (function name, parameters)
    public static int binarySearch(int[] data, int target) {
        //track the index position in the array
        int index = 0;

        //for every int element in the array
        for(int integer : data){
            if(target == integer){
                return index;
            }else{
                index++;
            }
        }
        return -1; // Place holder
        //tells that the array does not contain the target
    }
}
