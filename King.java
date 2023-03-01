public class King extends Piece {
    public King(String color, String name) {
        super(color, currentSquare, name);
    }

    public boolean canMoveTo(int row, int col, Piece[][] pieces) {
        int currentRow = getRow(pieces);
        int currentCol = getCol(pieces);
        int rowDistance = Math.abs(row - currentRow);
        int colDistance = Math.abs(col - currentCol);
        if (rowDistance > 1 || colDistance > 1) {
            return false;
        }
        return true;
    }

    public void moveTo(int row, int col, Piece[][] pieces) {
        int currentRow = getRow(pieces);
        int currentCol = getCol(pieces);
        pieces[row][col] = pieces[currentRow][currentCol];
        pieces[currentRow][currentCol] = null;
    }

    public Square getCurrentSquare(Piece[][] pieces) {
        int currentRow = getRow(pieces);
        int currentCol = getCol(pieces);
        return new Square(currentRow, currentCol);
    }

    public int getRow(Piece[][] pieces) {
        for (int i = 0; i < pieces.length; i++) {
            for (int j = 0; j < pieces[0].length; j++) {
                if (pieces[i][j] == this) {
                    return i;
                }
            }
        }
        return -1;
    }

    public int getCol(Piece[][] pieces) {
        for (int i = 0; i < pieces.length; i++) {
            for (int j = 0; j < pieces[0].length; j++) {
                if (pieces[i][j] == this) {
                    return j;
                }
            }
        }
        return -1;
    }

    @Override
    public Piece copy() {
        return new King(getColor(),"king");
        
    }
}