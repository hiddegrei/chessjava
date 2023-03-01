public abstract class Piece {
    public String color;
    public static Square currentSquare;
    public String name;

    public Piece(String color, Square startingSquare, String name) {
        this.color = color;
        this.currentSquare = startingSquare;
        this.name=name;
    }
    public String getName(){
        return this.name;
    }

    public String getSymbol() {
        return null;
    }

    public Piece(String color2) {
    }

    public String getColor() {
        return color;
    }

    public Square getCurrentSquare() {
        return currentSquare;
    }

    public void setCurrentSquare(Square square) {
        currentSquare = square;
    }

    public abstract boolean canMoveTo(int row, int col, Piece[][] pieces);

    public abstract Piece copy();

    public void moveTo(int newRow, int newCol, Piece[][] board) {
    }
}