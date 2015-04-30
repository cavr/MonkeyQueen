package main;

public class Queen extends Piece {

    int stack;

    public Queen(int color, int stack) {
        this.color = color;
        this.stack = stack;
    }

    public int getStack() {
        return stack;
    }

    public void decrementStack(int value) {
        this.stack--;
    }
}
