public class TwoDArray {
    public static void main(String[]args) {
        // 2d arrays are like tables, more than one row and one column
        int [][] grades = {{7,8},{10,9},{9,7}};
        //accessing an element
        System.out.println(grades[2][1]);
        //             row index__|  |__column index

        //print all values
        for(int i = 0; i < 3; i++) {
        //    System.out.println(grades[i][0] + " " + grades[i][1]);  --"ig it could work"
            for(int j = 0; j < 2; j++) {
                System.out.print(grades[i][j] + " ");  // this second loop will go through all the columns in the arrays
            }
            System.out.println();
        }
        System.out.println("------------------");
        for(int i = 0; i < grades.length; i++) {
            for(int j = 0; j < grades[0].length; j++) {
                System.out.print(grades[i][j] + " "); 
            }
            System.out.println();
        }
        System.out.println("------------------");
        
        String[][] seasons = {{"January","Winter"},{"February","Winter"},{"March","Spring"},{"April","Spring"},{"May","Spring"},{"June","Summer"},{"July","Summer"},{"August","Summer"},{"September","Autumn"},{"October","Autumn"},{"Novemeber","Autumn"},{"December","Winter"}};

        for(int i = 0; i < seasons.length; i++) {
            for(int j = 0; j < seasons[i].length; j++) {
                System.out.printf("%10s", seasons[i][j]); 
            }
            System.out.println();
        }
        System.out.println("------------------");
        System.out.println(seasons[6][1]);
        System.out.println(" ");

        System.out.println("------------------");
        System.out.println("");
        for(String[] row: seasons) {
            for (String element : row) {
                System.out.printf("%10s", element);
            }
            System.out.println("");
        }
    }
}
    
