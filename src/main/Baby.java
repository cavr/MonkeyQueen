package main;

import java.util.ArrayList;

public class Baby extends Piece {

    private ArrayList<PieceListener> listeners;

    public Baby(int color) {
        this.color = color;
        listeners = new ArrayList();
    }

    public void addListener(PieceListener listener) {
        listeners.add(listener);
    }
}
