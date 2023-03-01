public class Bishop extends Piece {
    public Bishop(String color, String name) {
        super(color, currentSquare, name);
    }
    
    public boolean canMoveTo(int row, int col, Piece[][] pieces) {
        int currentRow = getRow(pieces);
        int currentCol = getCol(pieces);
        int rowDistance = Math.abs(row - currentRow);
        int colDistance = Math.abs(col - currentCol);
        if (rowDistance == colDistance) {
            int rowDirection = row > currentRow ? 1 : -1;
            int colDirection = col > currentCol ? 1 : -1;
            int currentRowCopy = currentRow + rowDirection;
            int currentColCopy = currentCol + colDirection;
            while (currentRowCopy != row && currentColCopy != col) {
                if (pieces[currentRowCopy][currentColCopy] != null) {
                    return false;
                }
                currentRowCopy += rowDirection;
                currentColCopy += colDirection;
            }
            return true;
        } else {
            return false;
        }
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
        return new Bishop(getColor(),"bishop");
    }
    }
