public class ArrayReversed {

    public static void main(String[] args) {
        String[] colors = {"Fushia", "Periwinkle", "Pink", "Violet", "Limegreen"};
        

        // Reverse the array
        for (int i = 0; i < colors.length/2; i++) {
            System.out.println("Swapping index " + i + " and " + (colors.length - 1 -i));
            String temp = colors[i];
            colors[i] = colors[colors.length-1-i];
            colors[colors.length-1-i] = temp;
        }


        for (int i = 0; i < colors.length; i++) {
            System.out.println("colors[" + i + "] is " + colors[i]);

        }
    }
}
