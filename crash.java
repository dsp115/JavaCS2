import java.util.InputMismatchException;
import java.util.Scanner;

public class crash {
    public static void main(String[]args) {
        Scanner keyboard= new Scanner(System.in);
        int result = slicePerPerson(4, 1);


        String input = keyboard.nextLine();
        try {
            System.out.println("A");
            System.out.println("B");

            int age = Integer.parseInt(input);
            System.out.println("C");
        } catch(NumberFormatException j) { System.out.println("D");}
        finally {
            System.out.println("F");
        }

        

        System.out.println("Enter age: ");
        try {
            int age = keyboard.nextInt();
            System.out.println("Next year you will be " + (age + 1) + " years");
        }
        catch (InputMismatchException e) {
            System.out.println("That's not a number! Try again.");
            System.out.println("Here's the stack trace:");
            e.printStackTrace();
        }

        if(result == -1) {
            
        }
        
    }
    public static int slicePerPerson(int pizzas, int persons) {
        if(persons == 0) {
            System.out.println("Persons cannot be zero!");
            throw new RuntimeException("Persons is zero");
        }
        else {
            return pizzas / persons;
        }
    }
}