public class Rook extends Piece {
    public Rook(String color, String name) {
        super(color, currentSquare, name);
    }

    public boolean canMoveTo(int row, int col, Piece[][] pieces) {
        int currentRow = getRow(pieces);
        int currentCol = getCol(pieces);

        // A rook can move horizontally or vertically, but not diagonally.
        return currentRow == row || currentCol == col;
    }

    public int getRow(Piece[][] pieces) {
        for (int i = 0; i < pieces.length; i++) {
            for (int j = 0; j < pieces[i].length; j++) {
                if (pieces[i][j] == this) {
                    return i;
                }
            }
        }
        return -1;
    }

    public int getCol(Piece[][] pieces) {
        for (int i = 0; i < pieces.length; i++) {
            for (int j = 0; j < pieces[i].length; j++) {
                if (pieces[i][j] == this) {
                    return j;
                }
            }
        }
        return -1;
    }

    public void moveTo(int row, int col, Piece[][] pieces) {
        int currentRow = getRow(pieces);
        int currentCol = getCol(pieces);

        pieces[row][col] = pieces[currentRow][currentCol];
        pieces[currentRow][currentCol] = null;
    }

    public Piece copy() {
        return new Rook(getColor(),"rook");
    }
}
