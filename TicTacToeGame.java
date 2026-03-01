public class TicTacToeGame{

    // Step 0: Initialize a 3X3 2D array named "board" 
    String[][] board = new String[3][3];
    // TODO
    // This attribute is created for storing the current player
    // it will alternate between "X" and "O"
    private String currentPlayer;

    // Constructor: Call to start the game
    public TicTacToeGame() {
        // When game first starts, currentPlayer is "X"
        currentPlayer = "X";
        System.out.println();
        // reset the board (clear all fields)
        resetBoard();
    }

    // Step 1: Use nested loops to go through the whole array
    // and fill each position with " " (a single space)
    public void resetBoard() {
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length;j++){
                board[i][j] = " ";
            }
        }
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
    public String getCurrentPlayer() {
        //TODO
            return currentPlayer;
    }


    // Step 3: Make a method that switch the current player
    // This method will use "getCurrentPlayer" to check who the currently player is
    // and then set it to be the other person ("X" or "O")
    public void switchPlayer() {
        if(currentPlayer.equals("X")){
            currentPlayer = "O";
        }
        else{
            currentPlayer = "X";
        }
        // TODO
    }


    // Step 4: Make a method that checks if the user's input number
    // is in bounds. It returns true or false
    // For example, if the user's input numbers are (4,5), it returns false
    public boolean isInBounds(int row, int col) {
        if(row < 0 || row > 2){
            return false;
        }
        if(col < 0 || col >2){

            return false;
        }
            return true;
    }


    // Step 5: Make a method that checks if the location (row, col)
    // is empty (if it is " "). It returns true of false.
    public boolean isCellEmpty(int row, int col) {
        if (board[row][col].equals(" ")){
            return true;
        }
        // TODO
        return false;
    }



    // Step 6: Make a method that the user can call to place their mark
    // Inside this method, you should use "isCellEmpty" and "isInBounds"
    // methods to check if the mark can be placed first. 
    // This method returns true if the mark is placed successfully, 
    // and false if the move cannot be made.
    public boolean placeMark(int row, int col) {
        boolean cellEmpty = isCellEmpty(row, col);
        boolean isInBound = isInBounds(row, col);
        if(cellEmpty && isInBound){
            board[row][col] = currentPlayer;
            return true;

        }

        // TODO
        return false;
    }



    // Step 7: Make a method that checks whether the current player has won
    // you should check 3 rows/cols/diagonals using the last three helper functions
    public boolean checkWin() {
        if (checkRows() || checkCols() || checkDiagonals()) {
        return true;
        }
        return false;

        }

    // Step 8: Make a method that checks for tie.
    // The conditions for a tie is there's not empty spot, AND 
    // nobody wins.
    public boolean checkTie() {
        
        if(checkWin() == true){
            return false;
        }

        for( int i = 0; i < 3; i++){
            for( int j = 0; j < 3; j++){
                if(isCellEmpty(i, j) == true){
                    return false;

                }
                
            }
        }

        return true;
    }

//---------------------------------------------------------------------------
    // Helper Functions
    //returns true if any row is all the same mark (currentPlayer)
    public boolean checkRows() {

        for(int i = 0; i < board.length; i++){
           if (board[i][0].equals(board[i][1]) && board[i][1].equals(board[i][2]) && board[i][2].equals(currentPlayer)){
            return true;
           }
        }
        // TODO
        return false;
    }

    //returns true if any column is all the same mark (currentPlayer)
    public boolean checkCols() {
        for(int i = 0; i < board.length; i++){
           if (board[0][i].equals(board[1][i]) && board[1][i].equals(board[2][i]) && board[2][i].equals(currentPlayer)){
            return true;
           }
        }
        // TODO
        return false;
    }

    // returns true if either diagonal is all the same mark (currentPlayer)
    public boolean checkDiagonals() {
             if (board[0][0].equals(board[1][1]) && board[1][1].equals(board[2][2]) && board[2][2].equals(currentPlayer) || board[2][0].equals(board[1][1]) && board[1][1].equals(board[0][2]) && board[0][2].equals(currentPlayer)){
            return true;
           }
        // TODO
        return false;
    }
}