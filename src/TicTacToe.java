import java.util.Scanner;

public class TicTacToe {
    // Create the Tic-Tac-Toe board (3x3 array)
    private static char[][] board = new char[3][3];

    // Current player's symbol ('X' or 'O')
    private static char currentPlayer = 'X';

    public static void main(String[] args) {
        // Initialize the game board with empty spaces
        initializeBoard();

        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        boolean gameRunning = true;

        // Main game loop
        while (gameRunning) {
            // Display the board
            printBoard();

            // Get player's move
            System.out.println("Player " + currentPlayer + ", enter your move (row [1-3] and column [1-3]): ");
            int row = scanner.nextInt() - 1; // Subtract 1 for zero-based index
            int col = scanner.nextInt() - 1;

            // Check if the move is valid
            if (isValidMove(row, col)) {
                // Place the player's move on the board
                board[row][col] = currentPlayer;

                // Check if the current player has won or if the game is a draw
                if (checkWinner()) {
                    printBoard();
                    System.out.println("Player " + currentPlayer + " wins!");
                    gameRunning = false;
                } else if (isBoardFull()) {
                    printBoard();
                    System.out.println("The game is a draw!");
                    gameRunning = false;
                } else {
                    // Switch the current player
                    currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
                }
            } else {
                System.out.println("This move is not valid. Try again.");
            }
        }

        // Close the Scanner object
        scanner.close();
    }

    // Method to initialize the game board with empty spaces
    private static void initializeBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = ' ';
            }
        }
    }

    // Method to print the current state of the board
    private static void printBoard() {
        System.out.println("  1 2 3");
        for (int i = 0; i < 3; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j]);
                if (j < 2) System.out.print("|");
            }
            System.out.println();
            if (i < 2) System.out.println("  -----");
        }
    }

    // Method to check if a move is valid (i.e., if the cell is empty)
    private static boolean isValidMove(int row, int col) {
        return row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == ' ';
    }

    // Method to check if the board is full (for a draw condition)
    private static boolean isBoardFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }

    // Method to check if the current player has won
    private static boolean checkWinner() {
        // Check rows and columns
        for (int i = 0; i < 3; i++) {
            if ((board[i][0] == currentPlayer && board[i][1] == currentPlayer && board[i][2] == currentPlayer) ||
                (board[0][i] == currentPlayer && board[1][i] == currentPlayer && board[2][i] == currentPlayer)) {
                return true;
            }
        }

        // Check diagonals
        if ((board[0][0] == currentPlayer && board[1][1] == currentPlayer && board[2][2] == currentPlayer) ||
            (board[0][2] == currentPlayer && board[1][1] == currentPlayer && board[2][0] == currentPlayer)) {
            return true;
        }

        return false;
    }
}
