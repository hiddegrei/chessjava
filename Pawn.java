public class Pawn extends Piece {
    private boolean hasMoved;
    public Pawn(String color, String name) {
        super(color, currentSquare, name);
        hasMoved = false;
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
    
    public boolean canMoveTo(int row, int col, Piece[][] pieces) {
        int currentRow = getRow(pieces);
        int currentCol = getCol(pieces);
        int direction = getColor().equals("white") ? -1 : 1;
        if (row == currentRow + direction && col == currentCol && pieces[row][col] == null) {
            return true;
        } else if (!hasMoved && row == currentRow + 2 * direction && col == currentCol && pieces[row][col] == null && pieces[row - direction][col] == null) {
            return true;
        } else if (row == currentRow + direction && (col == currentCol - 1 || col == currentCol + 1) && pieces[row][col] != null && !pieces[row][col].getColor().equals(getColor())) {
            return true;
        } else {
            return false;
        }
    }
    
    public void moveTo(int row, int col, Piece[][] pieces) {
        int currentRow = getRow(pieces);
        int currentCol = getCol(pieces);
        pieces[row][col] = pieces[currentRow][currentCol];
        pieces[currentRow][currentCol] = null;
        hasMoved = true;
    }
    
    public Piece copy() {
        Pawn copy = new Pawn(getColor(),"pawn");
        copy.hasMoved = hasMoved;
        return copy;
    }
    }