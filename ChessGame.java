import java.util.Scanner;
public class ChessGame {
    private Piece[][] board;
    private String currentPlayer;
    private int turn;
    public ChessGame() {
        board = new Piece[8][8];
        currentPlayer = "white";
        turn = 1;
        initializeBoard();
    }
    
    public void initializeBoard() {
        //initialize white pieces
        
        
        //initialize black pieces
        board[0][0] = new Rook("black"," Rook ");
        board[0][1] = new Knight("black","Knight");
        board[0][2] = new Bishop("black","Bishop");
        board[0][3] = new Queen("black","Queen ");
        board[0][4] = new King("black"," King ");
        board[0][5] = new Bishop("black","Bishop");
        board[0][6] = new Knight("black","Knight");
        board[0][7] = new Rook("black"," Rook ");
        for (int i = 0; i < 8; i++) {
            board[1][i] = new Pawn("black"," Pawn ");
        }

        board[7][0] = new Rook("white"," Rook ");
        board[7][1] = new Knight("white","Knight");
        board[7][2] = new Bishop("white","Bishop");
        board[7][3] = new Queen("white","Queen ");
        board[7][4] = new King("white"," King ");
        board[7][5] = new Bishop("white","Bishop");
        board[7][6] = new Knight("white","Knight");
        board[7][7] = new Rook("white"," Rook ");
        for (int i = 0; i < 8; i++) {
            board[6][i] = new Pawn("white"," Pawn ");
        }
    }
    
    public void printBoard() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (board[i][j] == null) {
                    System.out.print("     -      ");
                } else {
                    //  System.out.print(board[i][j].getName() + " ");
                    System.out.print( board[i][j].getName()+ "" + board[i][j].getColor().toUpperCase() +" ");
                }
            }
            System.out.println();
        }
    }
    
    public void play() {
        Scanner scanner = new Scanner(System.in);
        boolean gameOver = false;
        while (!gameOver) {
            System.out.println("Turn " + turn + ": " + currentPlayer + " to play.");
            printBoard();
            System.out.print("Enter the coordinates of the piece you want to move (row col): ");
            int currentRow = scanner.nextInt();
            int currentCol = scanner.nextInt();
            Piece currentPiece = board[currentRow][currentCol];
            if (currentPiece == null || !currentPiece.getColor().equals(currentPlayer)) {
                System.out.println(""+ currentPiece.getName() + " "+currentPiece.getColor()+" Invalid piece selected. Please select a valid piece.");
                continue;
            }
            System.out.print(""+ currentPiece.getName() + " "+currentPiece.getColor()+" Enter the coordinates of where you want to move the piece (row col): ");
            int newRow = scanner.nextInt();
            int newCol = scanner.nextInt();
            if (!currentPiece.canMoveTo(newRow, newCol, board)) {
                System.out.println("Invalid move. Please try again.");
                continue;
            }
            currentPiece.moveTo(newRow, newCol, board);
            if (currentPlayer.equals("white")) {
                currentPlayer = "black";
            } else {
                currentPlayer = "white";
            }
            turn++;
        }
    }
    
    public static void main(String[] args) {
        ChessGame game = new ChessGame();
        game.play();
    }
    }