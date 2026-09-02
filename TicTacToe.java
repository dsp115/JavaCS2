import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        //  This 2d array stores the board
        char[][] board = {
            {' ',' ',' '},
            {' ',' ',' '},
            {' ',' ',' '}
        };
        // place X
        char player = 'X';
        boolean result = false;

        do
        {
            Scanner scnr = new Scanner(System.in);
            System.out.println("Enter row # (1-3): ");
            int row = scnr.nextInt() -1;
            System.out.println("Enter col # (1-3): ");
            int col = scnr.nextInt() -1;
            result = makeMove(board, row, col, 'X');
    } while (!result);
    if (player == 'X') {

    }
    
    // makeMove(board, 1,1, 'X');
    printBoard(board);
    
    
    }
    public static boolean isBoardFull(char[][] board) {
        for (char[] row : board) {
            for (char cell : row) {
                if (cell == ' ') {
                    return false;
                }
            }
        }
        return true;
    }
    
    public static void printBoard(char[][] board) {
        // print board
        System.out.println("--------");
        for(char[] row : board) {
            System.out.print('|');
            for(char element : row) {
                System.out.print(element + '|');

            }
            System.out.println("\n--------");
                    
        }
    }

    public static boolean makeMove(char[][] board, int row, int col, char player) {
        // Check if row and col are out of bounds (0-2)
        if(row < 0 || row > 2) {
            System.out.println("Invalid row");
            return false;

            if(col < 0 || col > 2) {
                System.out.println("Invalid col");
                return false;

                // Chek if chose spot is  already occupie
                if (board[row][col] != ' ') {
                    System.out.println("Spot already taken");
                    return false;}
                    
                    
                    // Assign playe piece and return true
                    board[row][col] =player; 
                    return true;
                    }
                }
            }
        }

        

    }

