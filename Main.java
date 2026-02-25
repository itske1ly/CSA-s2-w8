import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Create a Scanner object for later taking user input
        Scanner scan = new Scanner(System.in);

        // Create a TicTacToeGame object for starting the game
        TicTacToeGame game = new TicTacToeGame();

        // Print some lines to welcome the users
        System.out.println("Yo Buddies, welcome to Tic Tac Toe game!");
        System.out.println("You two are going to take turns entering 2 numbers each time, which represent the location where you are placing your move!");
        System.out.println("X goes first.");

        while (true) {
            // Show the user what the board looks like
            game.printBoard();

            // tell "X" or "O" - "is your turn!"
            System.out.println("Player " + game.getCurrentPlayer() + ", it's your turn.");

            // getInt is a helper method that takes the user' input
            int row = getInt(scan, "Enter row (0-2): ");
            int col = getInt(scan, "Enter col (0-2): ");

            // Make the move for them
            boolean placed = game.placeMark(row, col);

            // Check if the move is successful or not, if not tell them to try again
            if (!placed) {
                System.out.println("Invalid move. Try again (must be in range and empty).");
                continue;
            }

            // Check if the current player has won
            if (game.checkWin()) {
                game.printBoard();
                System.out.println("Player " + game.getCurrentPlayer() + " wins!");
                // "break" means existing out from this while loop immediately, regard less of the condition
                break;
            }

            // Check if it is already a tie
            if (game.checkTie()) {
                game.printBoard();
                System.out.println("It's a tie!");
                // again, if there's a tie, the game should end immediately
                break;
            }

            // If the game continues, it's now next player's turn
            game.switchPlayer();
        }

        scan.close();
    }

// ----------------------------------------------------------------------------
    // Helper method that you can call to take user input without knowing all the Scanner details yet
    private static int getInt(Scanner scan, String prompt) {
        while (true) {
            System.out.print(prompt);
            if (scan.hasNextInt()) {
                return scan.nextInt();
            } else {
                scan.next(); // throw away invalid input
                System.out.println("Please enter a whole number.");
            }
        }
    }
}