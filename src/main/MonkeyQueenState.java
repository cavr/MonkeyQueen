package main;

public class MonkeyQueenState {

    private int rows;
    private int cols;
    private int turn;
    private Piece board[][];
    
    // Como frecuentemente queremos saber la posición de las reinas, vamos a
    // almacenarlas aquí para no tener que recorrer el tablero cada vez que
    // queramos conocer su posición.
    private Position whiteQueenPosition, blackQueenPosition;

    public MonkeyQueenState(int rows, int cols, int whiteStack, int blackStack) {
        this.rows = rows;
        this.cols = cols;
        this.turn = Piece.WHITE;
        this.board = new Piece[rows][cols];
        
        this.board[0][cols/2] = new Queen(Piece.WHITE, whiteStack);
        this.whiteQueenPosition = new Position (0, cols/2);
        this.board[rows-1][(cols/2) + 1] = new Queen(Piece.BLACK, blackStack);
        this.blackQueenPosition = new Position (rows - 1, (cols / 2) + 1);
    }

    public int getCols() {
        return cols;
    }

    public int getRows() {
        return rows;
    }

    public int getTurn() {
        return turn;
    }

    public Position getBlackQueenPosition() {
        return blackQueenPosition;
    }

    public Position getWhiteQueenPosition() {
        return whiteQueenPosition;
    }

    public void insertPiece(Piece piece, int xpos, int ypos) {
        if (board[xpos][ypos] == null) {
            board[xpos][ypos] = piece;
        }
    }

    public int getSize() {
        return rows * cols;
    }
    
    public Piece getPieceAtPosition(int xpos, int ypos) {
        return board[xpos][ypos];
    }
    
    public Position getWhiteQueen() {
        return whiteQueenPosition;
    }
    
    public Position getBlackQueen() {
        return whiteQueenPosition;
    }
    
    public boolean canMoveFromTo(Position origin, Position target) {
        return true;
    }
    
    public boolean MoveFromTo(Position origin, Position target) {
        if (canMoveFromTo (origin, target)) {
            Piece piece = board[origin.getX()][origin.getY()];
            board[target.getX()][target.getY()] = piece;
            if (piece instanceof Queen) {
                if (board[target.getX()][target.getY()] != null) {
                    board[origin.getX()][origin.getY()] = null;
                } else {
                    board[origin.getX()][origin.getY()] = new Baby(piece.getColor());
                }
            } else {
                board[origin.getX()][origin.getY()] = null;
            }
            return true;
        }
        return false;
    }
}
