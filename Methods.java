public class Methods {
    public static void Walah(String day)
    {
        System.out.println("Hello, World! Today is " + day);
        // Walah(); -- Don't (ends, weirdly enough)
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int[] placeinArray(int a, int b) {
        int[] array = {a, b};
        return array;
    }

    public static void main(String[] args) {
        Walah("Wednesday");
        Walah("Thursday");
        Walah("Friday");


        String[] things = {"word", "bar" , "Som Ting Wong"};
        Display(things, 2);

        System.out.println( sum(10,20) );

        System.out.println("-----------------------------");

        int[] result = placeinArray(50, 90);
        System.out.println(result[0]);
        System.out.println(result[1]);
    }

    public static void Display(String[] array, int index) {
        System.out.println(array[index]);
        for(int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    // ctrl + l -- clears terminal
}
