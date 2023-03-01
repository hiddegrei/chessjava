public class Queen extends Piece {
    public Queen(String color, String name) {
        super(color, currentSquare, name);
    }
    
    public boolean canMoveTo(int row, int col, Piece[][] pieces) {
        int currentRow = getRow(pieces);
        int currentCol = getCol(pieces);
        int rowDistance = Math.abs(row - currentRow);
        int colDistance = Math.abs(col - currentCol);
        
        // Queen moves like a bishop (diagonally) or a rook (horizontally or vertically)
        return (rowDistance == colDistance) || (currentRow == row || currentCol == col);
    }
    
    public int getRow(Piece[][] pieces) {
        for (int i = 0; i < pieces.length; i++) {
            for (int j = 0; j < pieces[i].length; j++) {
                if (pieces[i][j] == this) {
                    return i;
                }
            }
        }
        return -1; // piece not found on board
    }
    
    public int getCol(Piece[][] pieces) {
        for (int i = 0; i < pieces.length; i++) {
            for (int j = 0; j < pieces[i].length; j++) {
                if (pieces[i][j] == this) {
                    return j;
                }
            }
        }
        return -1; // piece not found on board
    }
    
    public void moveTo(int row, int col, Piece[][] pieces) {
        int currentRow = getRow(pieces);
        int currentCol = getCol(pieces);
        pieces[row][col] = pieces[currentRow][currentCol];
        pieces[currentRow][currentCol] = null;
    }
    
    public Piece copy() {
        return new Queen(getColor(),"queen");
    }
}