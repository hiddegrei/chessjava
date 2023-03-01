public class Square {
    private int row;
    private int col;

    public Square(int row, int col) {
        this.row = row;
        this.col = col;
    }

    public int getRow() {
        return this.row;
    }

    public int getCol() {
        return this.col;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public void setRowCol(int row, int col) {
        this.row = row;
        this.col = col;
    }

    public String toString() {
        return "(" + this.row + ", " + this.col + ")";
    }
}