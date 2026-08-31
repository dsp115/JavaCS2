public class advancedArray {
    public static void main(String[] args) {
        int[] array = {-7,10,42,80};
        int sum = 0;
        for(int i = 0; i< array.length; i++) {
            sum += array[i];
        }

        int[] ea = {4,24,80};

        //       element--variableto hold an element of the array   array--literaly the array
        for(int element : array){
            sum+= element
        }
        // This does the same as the for int i=0 loop?
    }
}
