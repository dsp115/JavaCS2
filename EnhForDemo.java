public class EnhForDemo {
    public static void main(String[] args) {
        int[] array = {-7,11,42,80};
        int sum = 0;
        for(int element : array) {
            sum+= element;
        }
        System.out.println("The sum is " + sum);

        //--Example: changing the element variable doesn't change the array
        String[] devices = {"Printer", "pen" , "Projector"};
        //Try to make each element uppercase?
        for (String s : devices) {
            s = s.toUpperCase();
        } 
        // Enhanced loop/array CANNOT modify an existing array

        for(String s : devices) {
            System.out.println(s);
        }
    }
}