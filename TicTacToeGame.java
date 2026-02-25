public class TicTacToeGameBlank {

    // Step 0: Initialize a 3X3 2D array named "board" 
    // TODO

    // This attribute is created for storing the current player
    // it will alternate between "X" and "O"
    private String currentPlayer;

    // Constructor: Call to start the game
    public TicTacToeGameBlank() {
        // When game first starts, currentPlayer is "X"
        currentPlayer = "X";

        // reset the board (clear all fields)
        resetBoard();
    }

    // Step 1: Use nested loops to go through the whole array
    // and fill each position with " " (a single space)
    public void resetBoard() {
        // TODO
    }

    // Prints the board in a nice tic-tac-toe format
    public void printBoard() {
        System.out.println();
        System.out.println("   0   1   2");
        for (int r = 0; r < 3; r++) {
            System.out.print(r + "  ");
            for (int c = 0; c < 3; c++) {
                System.out.print(board[r][c]);
                if (c < 2) System.out.print(" | ");
            }
            System.out.println();
            if (r < 2){
                System.out.println("  ---+---+---");
            }
        }
        System.out.println();
    }

    // Step 2: Make a getter method that returns the current player
    public ______ getCurrentPlayer() {
        //TODO
    }


    // Step 3: Make a method that switch the current player
    // This method will use "getCurrentPlayer" to check who the currently player is
    // and then set it to be the other person ("X" or "O")
    public void switchPlayer() {
        // TODO
    }


    // Step 4: Make a method that checks if the user's input number
    // is in bounds. It returns true or false
    // For example, if the user's input numbers are (4,5), it returns false
    public boolean isInBounds(int row, int col) {
        // TODO
        return false;
    }


    // Step 5: Make a method that checks if the location (row, col)
    // is empty (if it is " "). It returns true of false.
    public boolean isCellEmpty(int row, int col) {
        // TODO
        return false;
    }



    // Step 6: Make a method that the user can call to place their mark
    // Inside this method, you should use "isCellEmpty" and "isInBounds"
    // methods to check if the mark can be placed first. 
    // This method returns true if the mark is placed successfully, 
    // and false if the move cannot be made.
    public boolean placeMark(int row, int col) {
        // TODO
        return false;
    }



    // Step 7: Make a method that checks whether the current player has won
    // you should check 3 rows/cols/diagonals using the last three helper functions
    public boolean checkWin() {
        // TODO
        return false;
    }

    // Step 8: Make a method that checks for tie.
    // The conditions for a tie is there's not empty spot, AND 
    // nobody wins.
    public boolean checkTie() {
        // TODO
        return false;
    }

//---------------------------------------------------------------------------
    // Helper Functions
    //returns true if any row is all the same mark (currentPlayer)
    public boolean checkRows() {
        // TODO
        return false;
    }

    //returns true if any column is all the same mark (currentPlayer)
    public boolean checkCols() {
        // TODO
        return false;
    }

    // returns true if either diagonal is all the same mark (currentPlayer)
    public boolean checkDiagonals() {
        // TODO
        return false;
    }
}