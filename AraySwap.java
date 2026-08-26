public class AraySwap {
        public static void main(String[] args) {
            int[] array = {10, 4};

            int temp = array[0];
            array[0] = array[1];
            array[1] = temp;

            System.out.println("array[0] is " + array[0]);
            System.out.println("array[1] is " + array[1]);
        }
}
