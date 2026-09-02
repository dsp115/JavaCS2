import java.util.Scanner;

public class FindMax {
    public static void main(String[] args) {
        double[][] values = {
            {-0.01, 0.06, 0.098},
            {0.087, 0.15, 0.099, 0.76},
            {0.099, 0.01}
        };

        // // Find Max
        double max = values[0][0];
        for(int i = 0; i < values.length; i++) {
            for(int j = 0; j < values[j].length; j++) {
                if(values[i][j] > max) {
                    max = values[i][j];
                }
            }
        }
        System.out.println("The max is " + max);

        max = values[0][0];

        
        System.out.println("");
        
        for(double[] row : values) {
            for(double element : row) {
                if(element > max) {
                    max = element;
                }
            }
        }
        System.out.println("The max is " + max);

        System.out.println();
        System.out.println("-----------------");

        
        String[][] seasons = {{"January","Winter"},{"February","Winter"},
        {"March","Spring"},{"April","Spring"},{"May","Spring"},{"June","Summer"},
        {"July","Summer"},{"August","Summer"},{"September","Autumn"},{"October","Autumn"},
        {"Novemeber","Autumn"},{"December","Winter"}};
        

        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter Month: ");
        String month = scnr.nextLine();
        

        // Search for month in first column
        boolean found = false;
        for(String[] row : seasons) {
            // Comparing first column
            if(row[0].equalsIgnoreCase(month)) {  
                // A match, Print Second column
                System.out.println("The season for " + row[0] + " is " + row[1]);
                found = true;

            }
            
        }
        if(!found)
        {
            System.out.println(month + " is not a month");
        }
                
        }
    
}