import java.util.Arrays;

public class scratch {
    public static void main(String[] args) {
        // int a = halvings(1);
        // System.out.println(a);

        int[] a = {14, 7, 22, 7, 30, 5};
        int[] b = {5, 1, 4, 2, 8};
        int[] left = {3, 7, 9};
        int[] right = {1, 5};
        int[] c = new int[left.length + right.length];
        int[] partC = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};

        // System.out.println(Arrays.toString(a));
        System.out.println("----------------------- Part 1 -----------------------");
        ssort(a);
        System.out.println("----------------------- Part 2 -----------------------");
        bubbleSort(b);
        System.out.println("----------------------- Part 3 -----------------------");
        merge(left, right, c);
        System.out.println("----------------------- Part 4 -----------------------");
        int k = binarySearch(partC, 8);
        System.out.println(k);

        System.out.println("\n2k array: ");
        
        int[] numbers = new int[2000];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i;
        }
        k = binarySearch(numbers, -1);
        System.out.println(k);


        System.out.println("----------------------- Part 5 -----------------------");

        CountOpA(new int[8]);
        CountOpA(new int[16]);

        CountOpB(new int[8]);
        CountOpB(new int[16]);



        
        System.out.println("----------------------- Part 6 -----------------------");
        sortNames(new String[] {"pear", "apple", "fig", "banana"});
    }

    public static int CountOpA(int[] a) {
        int c = 0;
        for (int i = 0; i < a.length; i++) {
            c = c + 1;
        }
        for (int i = 0; i < a.length; i++) {
            c = c + 1;
        }
        System.out.println("A: " + c);
        return c;
    }

    public static int CountOpB(int[] a) {
        int c = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                c = c + 1;
            }
        }
        System.out.println("B: " + c);

        return c;
    }

    public static int CountOpC(int[] a) {
        int c = 0;
        for (int i = 0; i < a.length; i++) {
            c = c + 1;
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                c = c + 1;
            }
        }
        for (int i = 0; i < a.length; i++) {
            c = c + 1;
        }
        System.out.println("C: " + c);
        return c;
    }

    public static int indexOf(int[] a, int target) {
        int c = 0;
        for (int i = 0; i < a.length; i++) {
            c = c + 1;
            if (a[i] == target) { return i; }
        }
        return -1;
    }

    public static void sortNames(String[] n) {
        for (int i = 0; i < n.length - 1; i++) {
            int min = i;

            for (int j = i + 1; j < n.length; j++) {
                if (n[j].compareTo(n[min]) < 0) {
                    min = j;
                }
            }

            String temp = n[i];
            n[i] = n[min];
            n[min] = temp;
    
            System.out.println(Arrays.toString(n));
        }
    }

    public static int halvings(int n) {
        int steps = 0;
        while (n > 1) {
        n = n / 2;
        steps = steps + 1;
        }
        return steps;
    }

    public static int[] ssort (int[] a) {
        int count = 0;
        for (int i = 0; i < a.length - 1; i++) {
            int min = i;
        for (int j = i + 1; j < a.length; j++) {
            if (a[j] < a[min]) {
            min = j;
            }
            count++;
            // System.out.println(Arrays.toString(a));
        }
        System.out.print("count: " + count + ", ");
        int temp = a[i];
        a[i] = a[min];
        a[min] = temp;
        System.out.println((i+1) + ": " + Arrays.toString(a));
        }
        return a;
    }

    public static void bubbleSort(int[] a) {
        int p = 0;
        int count = 0;
        int pass = 0;

        System.out.println("original array: " + Arrays.toString(a) + "\n");

        for(int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - 1; j++) {
            if (a[j] > a[j + 1]) {
                int temp = a[j];
                a[j] = a[j + 1];
                a[j + 1] = temp;
                count++;
            }
            System.out.print("swap counter: " + count + ", ");
            System.out.println((j+1 + pass) + ": " + Arrays.toString(a));

        }
        pass += a.length - 1;
        p++;
        System.out.println("------ pass: " + p + " ↑ -----");
        count = 0;
        }
        System.out.println("final array: " + Arrays.toString(a));
    }

    static void merge(int[] left, int[] right, int[] a) {
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                a[k++] = left[i++];
            } else {
                a[k++] = right[j++];
            }
            System.out.println(Arrays.toString(a));
        }

        while (i < left.length) {
            a[k++] = left[i++];
            System.out.println(Arrays.toString(a));
        }

        while (j < right.length) {
            a[k++] = right[j++];
            System.out.println(Arrays.toString(a));
        }
    }

        public static int binarySearch(int [] numbers, int key) {
            int mid;
            int low;
            int high;
            double c = 0;
            
            low = 0;
            high = numbers.length - 1;

            while (high >= low) {
                mid = (high + low) / 2;
                if (numbers[mid] < key) {
                    low = mid + 1;
                    System.out.println(high + " " + low + " " + mid);
                    c++;
                } 
                else if (numbers[mid] > key) {
                    high = mid - 1;
                    c++;
                    System.out.println(high + " " + low + " " + mid);

                } 
                else {
                    System.out.println(high + " " + low + " " + mid);

                    System.out.println("operated " + c + " times");
                    return mid;
                }
            }
            System.out.println("operated " + c + " times");
            return -1;
        }



}
