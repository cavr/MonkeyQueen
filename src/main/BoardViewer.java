package main;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class BoardViewer extends JFrame {

    private MonkeyQueenState board;
    private JPanel panel;
    private ArrayList<JButton> buttons;

    public BoardViewer(MonkeyQueenState board) {
        this.board = board;
        panel = new JPanel();
        buttons = new ArrayList();
        /*
         * Rellenamos el tablero
         */
        /*for (int i = 0; i < board.getSize(); i++) {
            JButton auxButton = new JButton();
            if (i % 2 == 0) {
                auxButton.setBackground(Color.red);
            } else {
                auxButton.setBackground(Color.BLUE);
            }
            buttons.add(auxButton);
            panel.add(auxButton);
        }*/
        this.add(panel);
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        this.setSize(800, 600);
        this.setTitle("Monkey Queen");
        this.setVisible(true);
    }
}
