import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TicTacToe extends JFrame {
    private JButton[][] boardButtons;
    private char currentPlayer;

    public TicTacToe() {
        setTitle("Tic Tac Toe");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(3, 3));
        setSize(500, 500);

        boardButtons = new JButton[3][3];
        currentPlayer = 'X';

        // Initialize board buttons
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                boardButtons[row][col] = new JButton();
                boardButtons[row][col].setFont(new Font("Arial", Font.PLAIN, 50));
                boardButtons[row][col].addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        onBoardButtonClick((JButton) e.getSource());
                    }
                });
                add(boardButtons[row][col]);
            }
        }

        pack();
        setLocationRelativeTo(null);
    }

    private void onBoardButtonClick(JButton button) {
        if (button.getText().isEmpty()) {
            button.setText(String.valueOf(currentPlayer));
            if (checkWin()) {
                JOptionPane.showMessageDialog(this, "Player " + currentPlayer + " wins!");
                resetBoard();
            } else if (checkDraw()) {
                JOptionPane.showMessageDialog(this, "It's a draw!");
                resetBoard();
            } else {
                currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
            }
        }
    }

    private boolean checkWin() {
        // Check rows, columns, and diagonals for a win
        for (int i = 0; i < 3; i++) {
            if (boardButtons[i][0].getText().equals(String.valueOf(currentPlayer)) &&
                    boardButtons[i][1].getText().equals(String.valueOf(currentPlayer)) &&
                    boardButtons[i][2].getText().equals(String.valueOf(currentPlayer))) {
                return true;
            }

            if (boardButtons[0][i].getText().equals(String.valueOf(currentPlayer)) &&
                    boardButtons[1][i].getText().equals(String.valueOf(currentPlayer)) &&
                    boardButtons[2][i].getText().equals(String.valueOf(currentPlayer))) {
                return true;
            }
        }

        if (boardButtons[0][0].getText().equals(String.valueOf(currentPlayer)) &&
                boardButtons[1][1].getText().equals(String.valueOf(currentPlayer)) &&
                boardButtons[2][2].getText().equals(String.valueOf(currentPlayer))) {
            return true;
        }

        return boardButtons[0][2].getText().equals(String.valueOf(currentPlayer)) &&
                boardButtons[1][1].getText().equals(String.valueOf(currentPlayer)) &&
                boardButtons[2][0].getText().equals(String.valueOf(currentPlayer));
    }

    private boolean checkDraw() {
        // Check if the game is a draw (no winner and all cells are filled)
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                if (boardButtons[row][col].getText().isEmpty()) {
                    return false;
                }
            }
        }
        return true;
    }

    private void resetBoard() {
        // Clear the board for a new game
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                boardButtons[row][col].setText("");
            }
        }
        currentPlayer = 'X';
    }

    public static void main(String[] args) {
        new TicTacToe().setVisible(true);
    }
}